package com.older.manager.bean;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Products {
	private Integer id;

	//分页参数
	private Integer page;//当前页
	private Integer limit;//每页显示大小
	
	//图片路径列表
	private List<String>imgList;
	
	@NotEmpty(message="简略标题不能为空")
	@Length(min=1,max=100,message="简略标题长度超出限制")
	private String name;
  
	@Length(min=0,max=30,message="产品编号长度超出限制")
	private String number;

	@NotNull(message="原来价格不能为空！")
	@Min(value=0,message="原来价格不能为负数！")
	private Double orprice;

	@NotEmpty(message="所属地区/国家不能为空！")
	@Length(min=1,max=50,message="所属地区/国家字数超过限制！")
	private String region;

	@NotNull(message="现在价格不能为空！")
	@Min(value=0,message="现在价格不能为负数！")
	private Double nowprice;

	private Date addtime;

	private Date addtime1;

	private Integer auditstatus;

	private Integer state;

	@NotEmpty(message="图片标题不能为空")
	@Length(min=1,max=50,message="图片标题长度超出限制")
	private String imagetitle;

	@Length(min=0,max=100,message="产地长度超出限制")
	private String placeorigin;

	private Integer brandId;

	@Valid
	private ProductKeyword productKeyword;
	
	// 类型ID
	private Integer typeId;

	private ProductType productType;

	private BrandWithBLOBs brand;

	@Length(min=0,max=100,message="材质长度超出限制")
	private String texture;

	@Min(value=0,message="重量不能为负数！")
	private Double weight;

	@Length(min=0,max=20,message="单位长度超出限制！最长为20")
	private String unit;

	@NotEmpty(message="内容摘要不能为空")
	@Length(min=1,max=200,message="内容摘要长度超出限制")
	private String synopsis;

	@NotEmpty(message="详细内容不能为空")
	@Length(min=1,max=1000,message="详细内容长度超出限制")
	private String description;
	
	@NotNull(message="库存量不能为空！")
	@Min(value=0,message="库存量不能为负数！")
	private Integer inventory;

	@Min(value=0,message="销量不能为负数！")
	private Integer sales;

	private String paral1;

	private String paral2;

	private String paral3;

	private String paral4;

	private String paral5;

	private String paral6;

	private String paral7;

	private String paral8;

	private String paral9;

	private String paral10;

	private Double paral11;

	private Double paral12;

	private Double paral13;

	private Double paral14;

	private Double paral15;

	private Double paral16;

	private Double paral17;

	private String images;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number == null ? null : number.trim();
	}

	public Double getOrprice() {
		return orprice;
	}

	public void setOrprice(Double orprice) {
		this.orprice = orprice;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region == null ? null : region.trim();
	}

	public Double getNowprice() {
		return nowprice;
	}

	public void setNowprice(Double nowprice) {
		this.nowprice = nowprice;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getImagetitle() {
		return imagetitle;
	}

	public void setImagetitle(String imagetitle) {
		this.imagetitle = imagetitle == null ? null : imagetitle.trim();
	}

	public String getPlaceorigin() {
		return placeorigin;
	}

	public void setPlaceorigin(String placeorigin) {
		this.placeorigin = placeorigin == null ? null : placeorigin.trim();
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture == null ? null : texture.trim();
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis == null ? null : synopsis.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getParal1() {
		return paral1;
	}

	public void setParal1(String paral1) {
		this.paral1 = paral1 == null ? null : paral1.trim();
	}

	public String getParal2() {
		return paral2;
	}

	public void setParal2(String paral2) {
		this.paral2 = paral2 == null ? null : paral2.trim();
	}

	public String getParal3() {
		return paral3;
	}

	public void setParal3(String paral3) {
		this.paral3 = paral3 == null ? null : paral3.trim();
	}

	public String getParal4() {
		return paral4;
	}

	public void setParal4(String paral4) {
		this.paral4 = paral4 == null ? null : paral4.trim();
	}

	public String getParal5() {
		return paral5;
	}

	public void setParal5(String paral5) {
		this.paral5 = paral5 == null ? null : paral5.trim();
	}

	public String getParal6() {
		return paral6;
	}

	public void setParal6(String paral6) {
		this.paral6 = paral6 == null ? null : paral6.trim();
	}

	public String getParal7() {
		return paral7;
	}

	public void setParal7(String paral7) {
		this.paral7 = paral7 == null ? null : paral7.trim();
	}

	public String getParal8() {
		return paral8;
	}

	public void setParal8(String paral8) {
		this.paral8 = paral8 == null ? null : paral8.trim();
	}

	public String getParal9() {
		return paral9;
	}

	public void setParal9(String paral9) {
		this.paral9 = paral9 == null ? null : paral9.trim();
	}

	public String getParal10() {
		return paral10;
	}

	public void setParal10(String paral10) {
		this.paral10 = paral10 == null ? null : paral10.trim();
	}

	public Double getParal11() {
		return paral11;
	}

	public void setParal11(Double paral11) {
		this.paral11 = paral11;
	}

	public Double getParal12() {
		return paral12;
	}

	public void setParal12(Double paral12) {
		this.paral12 = paral12;
	}

	public Double getParal13() {
		return paral13;
	}

	public void setParal13(Double paral13) {
		this.paral13 = paral13;
	}

	public Double getParal14() {
		return paral14;
	}

	public void setParal14(Double paral14) {
		this.paral14 = paral14;
	}

	public Double getParal15() {
		return paral15;
	}

	public void setParal15(Double paral15) {
		this.paral15 = paral15;
	}

	public Double getParal16() {
		return paral16;
	}

	public void setParal16(Double paral16) {
		this.paral16 = paral16;
	}

	public Double getParal17() {
		return paral17;
	}

	public void setParal17(Double paral17) {
		this.paral17 = paral17;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images == null ? null : images.trim();
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public BrandWithBLOBs getBrand() {
		return brand;
	}

	public void setBrand(BrandWithBLOBs brand) {
		this.brand = brand;
	}

	public Date getAddtime1() {
		return addtime1;
	}

	public void setAddtime1(Date addtime1) {
		this.addtime1 = addtime1;
	}

	public ProductKeyword getProductKeyword() {
		return productKeyword;
	}

	public void setProductKeyword(ProductKeyword productKeyword) {
		this.productKeyword = productKeyword;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", page=" + page + ", limit=" + limit
				+ ", name=" + name + ", number=" + number + ", orprice="
				+ orprice + ", region=" + region + ", nowprice=" + nowprice
				+ ", addtime=" + addtime + ", addtime1=" + addtime1
				+ ", auditstatus=" + auditstatus + ", state=" + state
				+ ", imagetitle=" + imagetitle + ", placeorigin=" + placeorigin
				+ ", brandId=" + brandId + ", productKeyword=" + productKeyword
				+ ", typeId=" + typeId + ", productType=" + productType
				+ ", brand=" + brand + ", texture=" + texture + ", weight="
				+ weight + ", unit=" + unit + ", synopsis=" + synopsis
				+ ", description=" + description + ", inventory=" + inventory
				+ ", sales=" + sales + ", paral1=" + paral1 + ", paral2="
				+ paral2 + ", paral3=" + paral3 + ", paral4=" + paral4
				+ ", paral5=" + paral5 + ", paral6=" + paral6 + ", paral7="
				+ paral7 + ", paral8=" + paral8 + ", paral9=" + paral9
				+ ", paral10=" + paral10 + ", paral11=" + paral11
				+ ", paral12=" + paral12 + ", paral13=" + paral13
				+ ", paral14=" + paral14 + ", paral15=" + paral15
				+ ", paral16=" + paral16 + ", paral17=" + paral17 + ", images="
				+ images + "]";
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}
}