package com.older.manager.bean;

import java.util.Date;

public class Integral {
    private Integer id;

    private Integer oldmanId;

    private Integer beforechangeintegral;

    private Integer currentintegral;

    private Integer afterchangeintegral;

    private Date changetime;

    private String operator;

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
}