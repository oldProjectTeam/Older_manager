package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Trauma {
    private Integer id;

    @NotEmpty(message="外伤名称不能为空！")
    @Length(min=1,max=50)
    private String traumaname;

    @NotNull(message="治疗时间不能为空")
    private Date occurrencetime;

    //条件查询所用
    private Date occurrencetime1;
    private Date occurrencetime2;
     
    @Length(min=0,max=100,message="医院名称长度超出限制")
    private String hospitalname;
    
    @Length(min=0,max=200,message="备注长度超出限制")
    private String remark;

    private Integer oldmanId;

    private String numone;

    private String numtwo;

    private String numthree;
    private Oldman oldman;
    

    @Override
	public String toString() {
		return "Trauma [id=" + id + ", traumaname=" + traumaname
				+ ", occurrencetime=" + occurrencetime + ", hospitalname="
				+ hospitalname + ", remark=" + remark + ", oldmanId="
				+ oldmanId + ", numone=" + numone + ", numtwo=" + numtwo
				+ ", numthree=" + numthree + ", oldman=" + oldman + "]";
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

    public String getTraumaname() {
        return traumaname;
    }

    public void setTraumaname(String traumaname) {
        this.traumaname = traumaname == null ? null : traumaname.trim();
    }

    public Date getOccurrencetime() {
        return occurrencetime;
    }

    public void setOccurrencetime(Date occurrencetime) {
        this.occurrencetime = occurrencetime;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
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