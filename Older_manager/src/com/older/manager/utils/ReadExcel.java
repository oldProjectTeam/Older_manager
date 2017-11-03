package com.older.manager.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.older.manager.bean.Oldman;

public class ReadExcel {

	// 总行数
	private int totalRows = 0;
	// 总条数
	private int totalCells = 0;
	// 错误信息接收器
	private String errorMsg;

	// 构造方法
	public ReadExcel() {
	}

	// 获取总行数
	public int getTotalRows() {
		return totalRows;
	}

	// 获取总列数
	public int getTotalCells() {
		return totalCells;
	}

	// 获取错误信息
	public String getErrorInfo() {
		return errorMsg;
	}

	/**
	 * 验证EXCEL文件
	 * 
	 * @param filePath
	 * @return
	 */
	public boolean validateExcel(String filePath) {
		if (filePath == null
				|| !(WDWUtil.isExcel2003(filePath) || WDWUtil
						.isExcel2007(filePath))) {
			errorMsg = "文件名不是excel格式";
			return false;
		}
		return true;
	}

	/**
	 * 读EXCEL文件，获取客户信息集合
	 * 
	 * @param fielName
	 * @return
	 */
	public List<Oldman> getExcelInfo(String fileName, MultipartFile Mfile) {

		// 把spring文件上传的MultipartFile转换成CommonsMultipartFile类型
		CommonsMultipartFile cf = (CommonsMultipartFile) Mfile; // 获取本地存储路径
		File file = new File("D:\\fileupload");
		// 创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
		if (!file.exists())
			file.mkdirs();
		// 新建一个文件
		File file1 = new File("D:\\fileupload" + new Date().getTime() + ".xlsx");
		// 将上传的文件写入新建的文件中
		try {
			cf.getFileItem().write(file1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 初始化客户信息的集合
		List<Oldman> oldmanList = new ArrayList<Oldman>();
		// 初始化输入流
		InputStream is = null;
		try {
			// 验证文件名是否合格
			if (!validateExcel(fileName)) {
				return null;
			}
			// 根据文件名判断文件是2003版本还是2007版本
			boolean isExcel2003 = true;
			if (WDWUtil.isExcel2007(fileName)) {
				isExcel2003 = false;
			}
			// 根据新建的文件实例化输入流
			is = new FileInputStream(file1);
			// 根据excel里面的内容读取客户信息
			oldmanList = getExcelInfo(is, isExcel2003);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					is = null;
					e.printStackTrace();
				}
			}
		}
		return oldmanList;
	}

	/**
	 * 根据excel里面的内容读取客户信息
	 * 
	 * @param is
	 *            输入流
	 * @param isExcel2003
	 *            excel是2003还是2007版本
	 * @return
	 * @throws IOException
	 */
	public List<Oldman> getExcelInfo(InputStream is, boolean isExcel2003) {
		List<Oldman> oldmans = null;
		try {
			/** 根据版本选择创建Workbook的方式 */
			Workbook wb = null;
			// 当excel是2003时
			if (isExcel2003) {
				wb = new HSSFWorkbook(is);
			} else {// 当excel是2007时
				wb = new XSSFWorkbook(is);
			}
			// 读取Excel里面客户的信息
			oldmans = readExcelValue(wb);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return oldmans;
	}

	/**
	 * 读取Excel里面客户的信息
	 * 
	 * @param wb
	 * @return
	 */
	private List<Oldman> readExcelValue(Workbook wb) {
		// 得到第一个shell
		Sheet sheet = wb.getSheetAt(0);

		// 得到Excel的行数
		this.totalRows = sheet.getPhysicalNumberOfRows();

		// 得到Excel的列数(前提是有行数)
		if (totalRows >= 1 && sheet.getRow(0) != null) {
			this.totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		}

		List<Oldman> oldmans = new ArrayList<Oldman>();
		Oldman oldman;
		// 标题行
		Row titleRow = null;
		String name = "";
		if (sheet != null) {
			titleRow = sheet.getRow(0);
		}
		if (titleRow != null) {
			Cell cell = titleRow.getCell(0);
			if (cell != null) {
				name = cell.getStringCellValue();
			}
		}
		if (!name.equals("老人的姓名")) {
			oldmans = null;
		} else {
			// 循环Excel行数,从第二行开始。标题不入库
			for (int r = 1; r < totalRows; r++) {
				Row row = sheet.getRow(r);
				if (row != null) {
					oldman = new Oldman();
					// 循环Excel的列
					for (int c = 0; c < this.totalCells; c++) {
						Cell cell = row.getCell(c);
						cell.setCellType(Cell.CELL_TYPE_STRING);
						if (cell != null) {
							if (c == 0) {// 第一列不读
								// 老人的姓名
								oldman.setName(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 1) {
								// 老人的性别
								oldman.setSex(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 2) {
								// 老人的电话
								oldman.setPhone(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 3) {
								// 老人的民族
								oldman.setNation(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 4) {
								// 老人的出生年月
								Calendar calendar = new GregorianCalendar(1900,
										0, -1);
								Date d = calendar.getTime();
								Date birthday = DateUtils.addDays(d, Integer
										.parseInt(cell.getStringCellValue()));
								System.out.println(birthday.toString());
								oldman.setBirthday(birthday);
								System.out.println(cell.getStringCellValue());
							} else if (c == 5) {
								// 老人的年龄
								oldman.setAge(Integer.parseInt(cell
										.getStringCellValue()));
								System.out.println(cell.getStringCellValue());
							} else if (c == 6) {
								// 老人的地址
								oldman.setAddress(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 7) {
								// 老人的服务点
								oldman.setService(cell.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 8) {
								// 紧急联系人
								oldman.setUrgencycontact(cell
										.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 9) {
								// 紧急联系人电话
								oldman.setUrgencycontactphone(cell
										.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							} else if (c == 10) {
								// 老人的服务状态
								oldman.setServicestatu(cell
										.getStringCellValue());
								System.out.println(cell.getStringCellValue());
							}
						}
					}
					// 设置默认图片
					oldman.setPhoto("upload/default.png");
					// 添加客户
					oldmans.add(oldman);
				}
			}
		}
		return oldmans;
	}
}
