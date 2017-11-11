package com.older.manager.bean;

import java.util.Date;

public class Integral {
	private Integer id;

	private Integer usersId;

	private Integer oldmanId;

	private Date beforechangeintegral;

	private Integer currentintegral;

	private Date afterchangeintegral;

	private Date changetime;

	private String operator;

	private String operationdetail;

	private Oldman oldman;

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

	public Integer getUsersId() {
		return usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	public Integer getOldmanId() {
		return oldmanId;
	}

	public void setOldmanId(Integer oldmanId) {
		this.oldmanId = oldmanId;
	}

	public Date getBeforechangeintegral() {
		return beforechangeintegral;
	}

	public void setBeforechangeintegral(Date beforechangeintegral) {
		this.beforechangeintegral = beforechangeintegral;
	}

	public Integer getCurrentintegral() {
		return currentintegral;
	}

	public void setCurrentintegral(Integer currentintegral) {
		this.currentintegral = currentintegral;
	}

	public Date getAfterchangeintegral() {
		return afterchangeintegral;
	}

	public void setAfterchangeintegral(Date afterchangeintegral) {
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

	public String getOperationdetail() {
		return operationdetail;
	}

	public void setOperationdetail(String operationdetail) {
		this.operationdetail = operationdetail == null ? null : operationdetail
				.trim();
	}
}