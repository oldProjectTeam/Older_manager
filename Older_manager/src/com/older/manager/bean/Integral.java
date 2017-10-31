package com.older.manager.bean;

import java.util.Date;

public class Integral {
    private Integer id;

    private Integer oldmanId;

    private Integer beforechangeintegral;

    private Integer currentintegral;

    private Integer afterchangeintegral;

    private Date changetime;
    
    private Date changetime1;
    
    private Date changetime2;

    private String operator;

    private Oldman oldman;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public Integer getBeforechangeintegral() {
        return beforechangeintegral;
    }

    public void setBeforechangeintegral(Integer beforechangeintegral) {
        this.beforechangeintegral = beforechangeintegral;
    }

    public Integer getCurrentintegral() {
        return currentintegral;
    }

    public void setCurrentintegral(Integer currentintegral) {
        this.currentintegral = currentintegral;
    }

    public Integer getAfterchangeintegral() {
        return afterchangeintegral;
    }

    public void setAfterchangeintegral(Integer afterchangeintegral) {
        this.afterchangeintegral = afterchangeintegral;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

	public Date getChangetime1() {
		return changetime1;
	}

	public void setChangetime1(Date changetime1) {
		this.changetime1 = changetime1;
	}

	public Date getChangetime2() {
		return changetime2;
	}

	public void setChangetime2(Date changetime2) {
		this.changetime2 = changetime2;
	}

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}
}