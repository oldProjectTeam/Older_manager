package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Oldman {
	private Integer id;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "姓名不合法")
	private String name;

	private String sex;

	@NotNull
	@Pattern(regexp = "(^1[0-9]{10}$)", message = "联系的手机号码格式不正确")
	private String phone;

	private String nation;

	private String marriage;

	private String type;

	@NotNull
	private Date birthday;

	@NotNull
	@Min(value = 70, message = "年龄低于了最小的范围")
	@Max(value = 110, message = "年龄高于了最大的范围")
	private Integer age;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "地址不合法")
	private String address;

	private String photo;

	private String service;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "紧急联系人姓名不合法")
	private String urgencycontact;

	@NotNull
	@Pattern(regexp = "(^1[0-9]{10}$)", message = "紧急联系人的手机号码格式不正确")
	private String urgencycontactphone;

	private String relation;

	private String servicetype;

	@NotNull
	private String servicestatu;

	private String economicsource;

	private Double monthlyincome;

	private String healthcare;

	private String socialsecurityno;

	private String chronicdiseases;

	private String bloodtype;

	private String disabilitysituation;

	private String disability;

	private String educationlevel;

	private String majors;

	private String title;

	private String unitorignal;

	@NotNull
	@Pattern(regexp = "(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)||(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$)", message = "身份证号码格式不正确")
	private String idcar;

	private String liveinfo;

	private String numone;

	private String numtwo;

	private String numthree;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation == null ? null : nation.trim();
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage == null ? null : marriage.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo == null ? null : photo.trim();
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service == null ? null : service.trim();
	}

	public String getUrgencycontact() {
		return urgencycontact;
	}

	public void setUrgencycontact(String urgencycontact) {
		this.urgencycontact = urgencycontact == null ? null : urgencycontact
				.trim();
	}

	public String getUrgencycontactphone() {
		return urgencycontactphone;
	}

	public void setUrgencycontactphone(String urgencycontactphone) {
		this.urgencycontactphone = urgencycontactphone == null ? null
				: urgencycontactphone.trim();
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation == null ? null : relation.trim();
	}

	public String getServicetype() {
		return servicetype;
	}

	public void setServicetype(String servicetype) {
		this.servicetype = servicetype == null ? null : servicetype.trim();
	}

	public String getServicestatu() {
		return servicestatu;
	}

	public void setServicestatu(String servicestatu) {
		this.servicestatu = servicestatu == null ? null : servicestatu.trim();
	}

	public String getEconomicsource() {
		return economicsource;
	}

	public void setEconomicsource(String economicsource) {
		this.economicsource = economicsource == null ? null : economicsource
				.trim();
	}

	public Double getMonthlyincome() {
		return monthlyincome;
	}

	public void setMonthlyincome(Double monthlyincome) {
		this.monthlyincome = monthlyincome;
	}

	public String getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(String healthcare) {
		this.healthcare = healthcare == null ? null : healthcare.trim();
	}

	public String getSocialsecurityno() {
		return socialsecurityno;
	}

	public void setSocialsecurityno(String socialsecurityno) {
		this.socialsecurityno = socialsecurityno == null ? null
				: socialsecurityno.trim();
	}

	public String getChronicdiseases() {
		return chronicdiseases;
	}

	public void setChronicdiseases(String chronicdiseases) {
		this.chronicdiseases = chronicdiseases == null ? null : chronicdiseases
				.trim();
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype == null ? null : bloodtype.trim();
	}

	public String getDisabilitysituation() {
		return disabilitysituation;
	}

	public void setDisabilitysituation(String disabilitysituation) {
		this.disabilitysituation = disabilitysituation == null ? null
				: disabilitysituation.trim();
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability == null ? null : disability.trim();
	}

	public String getEducationlevel() {
		return educationlevel;
	}

	public void setEducationlevel(String educationlevel) {
		this.educationlevel = educationlevel == null ? null : educationlevel
				.trim();
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors == null ? null : majors.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getUnitorignal() {
		return unitorignal;
	}

	public void setUnitorignal(String unitorignal) {
		this.unitorignal = unitorignal == null ? null : unitorignal.trim();
	}

	public String getIdcar() {
		return idcar;
	}

	public void setIdcar(String idcar) {
		this.idcar = idcar == null ? null : idcar.trim();
	}

	public String getLiveinfo() {
		return liveinfo;
	}

	public void setLiveinfo(String liveinfo) {
		this.liveinfo = liveinfo == null ? null : liveinfo.trim();
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

	@Override
	public String toString() {
		return "Oldman [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", phone=" + phone + ", nation=" + nation + ", marriage="
				+ marriage + ", type=" + type + ", birthday=" + birthday
				+ ", age=" + age + ", address=" + address + ", photo=" + photo
				+ ", service=" + service + ", urgencycontact=" + urgencycontact
				+ ", urgencycontactphone=" + urgencycontactphone
				+ ", relation=" + relation + ", servicetype=" + servicetype
				+ ", servicestatu=" + servicestatu + ", economicsource="
				+ economicsource + ", monthlyincome=" + monthlyincome
				+ ", healthcare=" + healthcare + ", socialsecurityno="
				+ socialsecurityno + ", chronicdiseases=" + chronicdiseases
				+ ", bloodtype=" + bloodtype + ", disabilitysituation="
				+ disabilitysituation + ", disability=" + disability
				+ ", educationlevel=" + educationlevel + ", majors=" + majors
				+ ", title=" + title + ", unitorignal=" + unitorignal
				+ ", idcar=" + idcar + ", liveinfo=" + liveinfo + ", numone="
				+ numone + ", numtwo=" + numtwo + ", numthree=" + numthree
				+ "]";
	}

}