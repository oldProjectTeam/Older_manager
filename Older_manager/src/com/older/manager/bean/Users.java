package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Users {
	private Integer id;

	@NotNull
	private String account;

	@NotNull
	private String password;

	@NotNull
	private String nickname;

	private String loginip;

	private Date logintime;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "姓名不合法")
	private String realname;

	@NotNull
	@Pattern(regexp = "(^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,1,2,5-9])|(177))\\d{8}$)", message = "接收的手机号码格式不正确")
	private String phone;

	@NotNull
	@Pattern(regexp = "(^(\\d{6})()?(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\w)$)|(^(\\d{6})()?(\\d{4})(\\d{2})(\\d{2})(\\d{3})(\\w)$)", message = "接收的身份证号码格式不正确")
	private String idcard;

	@Pattern(regexp = "(^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$)")
	private String email;

	private String sex;

	private Double column3;

	private Integer coumn4;

	private String column5;

	private String column6;

	private String column7;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getLoginip() {
		return loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip == null ? null : loginip.trim();
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard == null ? null : idcard.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getColumn3() {
		return column3;
	}

	public void setColumn3(Double column3) {
		this.column3 = column3;
	}

	public Integer getCoumn4() {
		return coumn4;
	}

	public void setCoumn4(Integer coumn4) {
		this.coumn4 = coumn4;
	}

	public String getColumn5() {
		return column5;
	}

	public void setColumn5(String column5) {
		this.column5 = column5 == null ? null : column5.trim();
	}

	public String getColumn6() {
		return column6;
	}

	public void setColumn6(String column6) {
		this.column6 = column6 == null ? null : column6.trim();
	}

	public String getColumn7() {
		return column7;
	}

	public void setColumn7(String column7) {
		this.column7 = column7 == null ? null : column7.trim();
	}
}