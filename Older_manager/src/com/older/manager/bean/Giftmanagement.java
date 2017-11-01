package com.older.manager.bean;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Giftmanagement {
    private Integer id;

     
    @NotEmpty(message="礼品名称:长度不能超过50个字符且不能为空")
    @Size(min=1,max=50)
    private String giftname;
    
    
    private String giftnumber;
     
   @NotEmpty(message="礼品类型：礼品类型长度不能超过30个字符且不能为空")
   @Size(min=1,max=30)
    private String gifttype;
    
   @NotEmpty(message="礼品状态：礼品状态必须是[上架]|[下架]")
    @Size(min=2,max=2)
    private String giftstate;
    
   @NotEmpty(message="礼品单位：礼品单位长度不能超过20个字符或不能为空！")
    @Size(min=1,max=20)
    private String giftunit;

     
    @NotNull(message="礼品单价：礼品单价必须是1-8位纯数字且不能为空！")
    @Digits(integer=8,fraction=2)
    @Min(value=0)
    private Double giftprice;

    
    @NotNull(message="所需积分：所需积分必须是1-6位正整数且不能为空！")
    @Min(value=0)
    private Integer integral;

    
    @NotNull(message="库存数量：库存数量必须是1-6位正整数且不能为空！")
    @Min(value=0)
    private Integer inventory;

    
    @NotNull(message="兑换数量：兑换数量必须是1-6位正整数且不能为空！")
    @Min(value=0)
    private Integer lowernumber;
    
     
    @Size(min=0,max=500,message="备注信息：备注信息长度不能超过500个字符！")
    private String remake;
    
    private String image;

    private String giftmanagement1;

    private String giftmanagement2;

    private String giftmanagement3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname == null ? null : giftname.trim();
    }

    public String getGiftnumber() {
        return giftnumber;
    }

    public void setGiftnumber(String giftnumber) {
        this.giftnumber = giftnumber;
    }

    public String getGifttype() {
        return gifttype;
    }

    public void setGifttype(String gifttype) {
        this.gifttype = gifttype == null ? null : gifttype.trim();
    }

    public String getGiftstate() {
        return giftstate;
    }

    public void setGiftstate(String giftstate) {
        this.giftstate = giftstate == null ? null : giftstate.trim();
    }

    public String getGiftunit() {
        return giftunit;
    }

    public void setGiftunit(String giftunit) {
        this.giftunit = giftunit == null ? null : giftunit.trim();
    }

    public Double getGiftprice() {
        return giftprice;
    }

    public void setGiftprice(Double giftprice) {
        this.giftprice = giftprice;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getLowernumber() {
        return lowernumber;
    }

    public void setLowernumber(Integer lowernumber) {
        this.lowernumber = lowernumber;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getGiftmanagement1() {
        return giftmanagement1;
    }

    public void setGiftmanagement1(String giftmanagement1) {
        this.giftmanagement1 = giftmanagement1 == null ? null : giftmanagement1.trim();
    }

    public String getGiftmanagement2() {
        return giftmanagement2;
    }

    public void setGiftmanagement2(String giftmanagement2) {
        this.giftmanagement2 = giftmanagement2 == null ? null : giftmanagement2.trim();
    }

    public String getGiftmanagement3() {
        return giftmanagement3;
    }

    public void setGiftmanagement3(String giftmanagement3) {
        this.giftmanagement3 = giftmanagement3 == null ? null : giftmanagement3.trim();
    }

	@Override
	public String toString() {
		return "Giftmanagement [id=" + id + ", giftname=" + giftname
				+ ", giftnumber=" + giftnumber + ", gifttype=" + gifttype
				+ ", giftstate=" + giftstate + ", giftunit=" + giftunit
				+ ", giftprice=" + giftprice + ", integral=" + integral
				+ ", inventory=" + inventory + ", lowernumber=" + lowernumber
				+ ", remake=" + remake + ", image=" + image
				+ ", giftmanagement1=" + giftmanagement1 + ", giftmanagement2="
				+ giftmanagement2 + ", giftmanagement3=" + giftmanagement3
				+ "]";
	}
}