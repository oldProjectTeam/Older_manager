package com.older.manager.bean;

import java.util.Date;

public class Changesale {
    private Integer id;

    private Integer usid;

    private String chno;

    private Date chtime;

    private String chphoto;

    private String chbrieft;

    private String chname;

    private Double chmoeny;

    private Double chaftermoney;

    private Integer chstate;

    private Integer productid;

    private Integer chone;

    private String chtwo;

    private String chthree;

    private String chtype;

    private String chwhy;

    private String chcontent;

    private String chimages;

    private String chdeletestate;
  
    
    
    @Override
	public String toString() {
		return "Changesale [id=" + id + ", usid=" + usid + ", chno=" + chno
				+ ", chtime=" + chtime + ", chphoto=" + chphoto + ", chbrieft="
				+ chbrieft + ", chname=" + chname + ", chmoeny=" + chmoeny
				+ ", chaftermoney=" + chaftermoney + ", chstate=" + chstate
				+ ", productid=" + productid + ", chone=" + chone + ", chtwo="
				+ chtwo + ", chthree=" + chthree + ", chtype=" + chtype
				+ ", chwhy=" + chwhy + ", chcontent=" + chcontent
				+ ", chimages=" + chimages + ", chdeletestate=" + chdeletestate
				+ "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
    }

    public String getChno() {
        return chno;
    }

    public void setChno(String chno) {
        this.chno = chno == null ? null : chno.trim();
    }

    public Date getChtime() {
        return chtime;
    }

    public void setChtime(Date chtime) {
        this.chtime = chtime;
    }

    public String getChphoto() {
        return chphoto;
    }

    public void setChphoto(String chphoto) {
        this.chphoto = chphoto == null ? null : chphoto.trim();
    }

    public String getChbrieft() {
        return chbrieft;
    }

    public void setChbrieft(String chbrieft) {
        this.chbrieft = chbrieft == null ? null : chbrieft.trim();
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname == null ? null : chname.trim();
    }

    public Double getChmoeny() {
        return chmoeny;
    }

    public void setChmoeny(Double chmoeny) {
        this.chmoeny = chmoeny;
    }

    public Double getChaftermoney() {
        return chaftermoney;
    }

    public void setChaftermoney(Double chaftermoney) {
        this.chaftermoney = chaftermoney;
    }

    public Integer getChstate() {
        return chstate;
    }

    public void setChstate(Integer chstate) {
        this.chstate = chstate;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getChone() {
        return chone;
    }

    public void setChone(Integer chone) {
        this.chone = chone;
    }

    public String getChtwo() {
        return chtwo;
    }

    public void setChtwo(String chtwo) {
        this.chtwo = chtwo == null ? null : chtwo.trim();
    }

    public String getChthree() {
        return chthree;
    }

    public void setChthree(String chthree) {
        this.chthree = chthree == null ? null : chthree.trim();
    }

    public String getChtype() {
        return chtype;
    }

    public void setChtype(String chtype) {
        this.chtype = chtype == null ? null : chtype.trim();
    }

    public String getChwhy() {
        return chwhy;
    }

    public void setChwhy(String chwhy) {
        this.chwhy = chwhy == null ? null : chwhy.trim();
    }

    public String getChcontent() {
        return chcontent;
    }

    public void setChcontent(String chcontent) {
        this.chcontent = chcontent == null ? null : chcontent.trim();
    }

    public String getChimages() {
        return chimages;
    }

    public void setChimages(String chimages) {
        this.chimages = chimages == null ? null : chimages.trim();
    }

    public String getChdeletestate() {
        return chdeletestate;
    }

    public void setChdeletestate(String chdeletestate) {
        this.chdeletestate = chdeletestate == null ? null : chdeletestate.trim();
    }
}