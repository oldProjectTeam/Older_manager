package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Bloodtransfusion {
    private Integer id;

    @NotEmpty(message="输血原因不能为空")
    @Length(min=1,max=100,message="输血原因字数超出限制")
    private String bloodtransfusionwhy;

    @NotNull(message="输血时间不能为空!")
    private Date occurrencetime;

    //条件查询所用
    private Date occurrencetime1;
    private Date occurrencetime2;
    
    @NotNull(message="输血量不能为空!")
    private Double bloodtransfusionamount;

    @Length(min=0,max=200,message="备注字数超出限制")
    private String remark;

    private Integer oldmanId;

    private String numone;

    private String numtwo;

    private String numthree;
    
    private Oldman oldman;
    

    @Override
	public String toString() {
		return "Bloodtransfusion [id=" + id + ", bloodtransfusionwhy="
				+ bloodtransfusionwhy + ", occurrencetime=" + occurrencetime
				+ ", bloodtransfusionamount=" + bloodtransfusionamount
				+ ", remark=" + remark + ", oldmanId=" + oldmanId + ", numone="
				+ numone + ", numtwo=" + numtwo + ", numthree=" + numthree
				+ ", oldman=" + oldman + "]";
	}

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloodtransfusionwhy() {
        return bloodtransfusionwhy;
    }

    public void setBloodtransfusionwhy(String bloodtransfusionwhy) {
        this.bloodtransfusionwhy = bloodtransfusionwhy == null ? null : bloodtransfusionwhy.trim();
    }

    public Date getOccurrencetime() {
        return occurrencetime;
    }

    public void setOccurrencetime(Date occurrencetime) {
        this.occurrencetime = occurrencetime;
    }

    public Double getBloodtransfusionamount() {
        return bloodtransfusionamount;
    }

    public void setBloodtransfusionamount(Double bloodtransfusionamount) {
        this.bloodtransfusionamount = bloodtransfusionamount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getNumone() {
        return numone;
    }

    public void setNumone(String numone) {
        this.numone = numone == null ? null : numone.trim();
    }

    public String getNumtwo() {
        return numtwo;
    }

    public void setNumtwo(String numtwo) {
        this.numtwo = numtwo == null ? null : numtwo.trim();
    }

    public String getNumthree() {
        return numthree;
    }

    public void setNumthree(String numthree) {
        this.numthree = numthree == null ? null : numthree.trim();
    }

	public Date getOccurrencetime1() {
		return occurrencetime1;
	}

	public void setOccurrencetime1(Date occurrencetime1) {
		this.occurrencetime1 = occurrencetime1;
	}

	public Date getOccurrencetime2() {
		return occurrencetime2;
	}

	public void setOccurrencetime2(Date occurrencetime2) {
		this.occurrencetime2 = occurrencetime2;
	}
}