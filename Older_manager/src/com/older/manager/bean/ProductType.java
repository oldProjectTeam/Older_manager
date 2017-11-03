package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductType {
    private Integer id;

    @NotNull(message="类型名称不能为空或不能超过50个字符!")
    @Size(min=1,max=50)
    private String name;

    @NotNull(message="排序不能为空且必须是大于0的整数")
    @Min(value=1)
    private Integer sort;

    @NotNull(message="父级类型ID不能为空！")
    private Integer parentid;

    private Integer state;

    private Integer grade;

    private Date createtime;

    private String type1;

    private String type2;

    private String type3;

    private Double type4;

    private Integer type5;

    @NotNull(message="备注信息至少为10个字符且长度不能超过100")
    @Size(min=10,max=100)
    private String remark;

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1 == null ? null : type1.trim();
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2 == null ? null : type2.trim();
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3 == null ? null : type3.trim();
    }

    public Double getType4() {
        return type4;
    }

    public void setType4(Double type4) {
        this.type4 = type4;
    }

    public Integer getType5() {
        return type5;
    }

    public void setType5(Integer type5) {
        this.type5 = type5;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", name=" + name + ", sort=" + sort
				+ ", parentid=" + parentid + ", state=" + state + ", grade="
				+ grade + ", createtime=" + createtime + ", type1=" + type1
				+ ", type2=" + type2 + ", type3=" + type3 + ", type4=" + type4
				+ ", type5=" + type5 + ", remark=" + remark + "]";
	}
}