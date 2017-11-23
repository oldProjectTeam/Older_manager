package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Surgery {
    private Integer id;

    @NotEmpty(message="手术名称不能为空")
    @Length(min=1,max=50,message="手术名称长度超出限制")
    private String surgeryname;

    @NotNull(message="手术时间不能为空")
    private Date surgerytime;
    
    //条件查询所有时间
    private Date surgerytime1;
    private Date surgerytime2;

     
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
		return "Surgery [id=" + id + ", surgeryname=" + surgeryname
				+ ", surgerytime=" + surgerytime + ", hospitalname="
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

    public String getSurgeryname() {
        return surgeryname;
    }

    public void setSurgeryname(String surgeryname) {
        this.surgeryname = surgeryname == null ? null : surgeryname.trim();
    }

    public Date getSurgerytime() {
        return surgerytime;
    }

    public void setSurgerytime(Date surgerytime) {
        this.surgerytime = surgerytime;
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

	public Date getSurgerytime1() {
		return surgerytime1;
	}

	public void setSurgerytime1(Date surgerytime1) {
		this.surgerytime1 = surgerytime1;
	}

	public Date getSurgerytime2() {
		return surgerytime2;
	}

	public void setSurgerytime2(Date surgerytime2) {
		this.surgerytime2 = surgerytime2;
	}
}