package com.older.manager.bean;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Orders {
    private Integer id;

    private String orderNo;

    private String transactionid;

    private String subject;

    private Double cost;

    private Integer num;

    //关联订单详细表
    private List<Orderdetail>orderdetails;
    
    @Length(min=0,max=200,message="买家留言不能超过200！")
    private String body;

    @NotEmpty(message="支付方式不能为空！")
    @Length(min=1,max=20,message="支付方式字数超限！")
    private String paytype;

    private Date creattime;

    private String shipper;

    private String shipperphone;

    @NotEmpty(message="物流方式不能为空")
    @Length(min=1,max=20,message="物流方式字数超限")
    private String formulaway;

    @NotNull(message="地址ID不能为空")
    private Integer shippingaddressId;

    //关联地址信息
    private Shippingaddress shippingaddress;
    
    @NotNull(message="用户ID不能为空")
    private Integer userId;

    private String state;

    private Double freight;

    private String orders1;

    private String orders2;

    private String orders3;

    private String orders4;

    private String orders5;

    private String orders6;

    private String orders7;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid == null ? null : transactionid.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper == null ? null : shipper.trim();
    }

    public String getShipperphone() {
        return shipperphone;
    }

    public void setShipperphone(String shipperphone) {
        this.shipperphone = shipperphone == null ? null : shipperphone.trim();
    }

    public String getFormulaway() {
        return formulaway;
    }

    public void setFormulaway(String formulaway) {
        this.formulaway = formulaway == null ? null : formulaway.trim();
    }

    public Integer getShippingaddressId() {
        return shippingaddressId;
    }

    public void setShippingaddressId(Integer shippingaddressId) {
        this.shippingaddressId = shippingaddressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getOrders1() {
        return orders1;
    }

    public void setOrders1(String orders1) {
        this.orders1 = orders1 == null ? null : orders1.trim();
    }

    public String getOrders2() {
        return orders2;
    }

    public void setOrders2(String orders2) {
        this.orders2 = orders2 == null ? null : orders2.trim();
    }

    public String getOrders3() {
        return orders3;
    }

    public void setOrders3(String orders3) {
        this.orders3 = orders3 == null ? null : orders3.trim();
    }

    public String getOrders4() {
        return orders4;
    }

    public void setOrders4(String orders4) {
        this.orders4 = orders4 == null ? null : orders4.trim();
    }

    public String getOrders5() {
        return orders5;
    }

    public void setOrders5(String orders5) {
        this.orders5 = orders5 == null ? null : orders5.trim();
    }

    public String getOrders6() {
        return orders6;
    }

    public void setOrders6(String orders6) {
        this.orders6 = orders6 == null ? null : orders6.trim();
    }

    public String getOrders7() {
        return orders7;
    }

    public void setOrders7(String orders7) {
        this.orders7 = orders7 == null ? null : orders7.trim();
    }

	public Shippingaddress getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(Shippingaddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	 

	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderNo=" + orderNo + ", transactionid="
				+ transactionid + ", subject=" + subject + ", cost=" + cost
				+ ", num=" + num + ", orderdetails=" + orderdetails + ", body="
				+ body + ", paytype=" + paytype + ", creattime=" + creattime
				+ ", shipper=" + shipper + ", shipperphone=" + shipperphone
				+ ", formulaway=" + formulaway + ", shippingaddressId="
				+ shippingaddressId + ", shippingaddress=" + shippingaddress
				+ ", userId=" + userId + ", state=" + state + ", freight="
				+ freight + ", orders1=" + orders1 + ", orders2=" + orders2
				+ ", orders3=" + orders3 + ", orders4=" + orders4
				+ ", orders5=" + orders5 + ", orders6=" + orders6
				+ ", orders7=" + orders7 + "]";
	}
}