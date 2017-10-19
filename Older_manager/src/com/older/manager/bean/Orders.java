package com.older.manager.bean;

import java.util.Date;

public class Orders {
    private Integer id;

    private String orderNo;

    private Double cost;

    private Integer num;

    private String paytype;

    private Date creattime;

    private Integer oldmanaccountId;

    private String harvestaddress;

    private String consignee;

    private String consigneephone;

    private String shipper;

    private String shipperphone;

    private String formulaway;

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

    public Integer getOldmanaccountId() {
        return oldmanaccountId;
    }

    public void setOldmanaccountId(Integer oldmanaccountId) {
        this.oldmanaccountId = oldmanaccountId;
    }

    public String getHarvestaddress() {
        return harvestaddress;
    }

    public void setHarvestaddress(String harvestaddress) {
        this.harvestaddress = harvestaddress == null ? null : harvestaddress.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneephone() {
        return consigneephone;
    }

    public void setConsigneephone(String consigneephone) {
        this.consigneephone = consigneephone == null ? null : consigneephone.trim();
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
}