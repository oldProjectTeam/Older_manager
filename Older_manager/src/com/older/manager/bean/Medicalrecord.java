package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 就诊类
 * @author lenovo
 *
 */
public class Medicalrecord {
	private Integer id;

	@NotEmpty
	@Length(min=1,max=100)
	private String hospital;

	@NotEmpty
	@Length(min=1,max=100)
	private String department;

	@NotEmpty
	@Length(min=1,max=30)
	private String doctor;

	@NotNull
	private Date clinicaltime;//就诊时间
	
	//条件查询所用
	private Date clinicaltime1;
	private Date clinicaltime2;

	private Date appointmenttime;

	@Length(min=0,max=200)
	private String chekcontent;

	@Length(min=0,max=200)
	private String ancillarycheckcontent;

	@Length(min=0,max=200)
	private String realcheckcontent;

	@Length(min=0,max=200)
	private String normalusedrug;

	@Length(min=0,max=200)
	private String diagnosis;

	@Length(min=0,max=200)
	private String treatmentcareprescription;

	@Length(min=0,max=200)
	private String tabooltems;

	private Integer oldmanId;

	private String medicalrecord1;

	private String medicalrecord2;

	private String medicalrecord3;

	private String medicalrecord4;

	private String medicalrecord5;

	private String medicalrecord6;

	private String medicalrecord7;

	private String medicalrecord8;

	private String medicalrecord9;

	private String medicalrecord10;

	

	private Oldman oldman;

	

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}

	@Override
	public String toString() {
		return "Medicalrecord [id=" + id + ", hospital=" + hospital
				+ ", department=" + department + ", doctor=" + doctor
				+ ", clinicaltime=" + clinicaltime + ", appointmenttime="
				+ appointmenttime + ", chekcontent=" + chekcontent
				+ ", ancillarycheckcontent=" + ancillarycheckcontent
				+ ", realcheckcontent=" + realcheckcontent + ", normalusedrug="
				+ normalusedrug + ", diagnosis=" + diagnosis
				+ ", treatmentcareprescription=" + treatmentcareprescription
				+ ", tabooltems=" + tabooltems + ", oldmanId=" + oldmanId
				+ ", medicalrecord1=" + medicalrecord1 + ", medicalrecord2="
				+ medicalrecord2 + ", medicalrecord3=" + medicalrecord3
				+ ", medicalrecord4=" + medicalrecord4 + ", medicalrecord5="
				+ medicalrecord5 + ", medicalrecord6=" + medicalrecord6
				+ ", medicalrecord7=" + medicalrecord7 + ", medicalrecord8="
				+ medicalrecord8 + ", medicalrecord9=" + medicalrecord9
				+ ", medicalrecord10=" + medicalrecord10 + ", oldman=" + oldman
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital == null ? null : hospital.trim();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor == null ? null : doctor.trim();
	}

	public Date getClinicaltime() {
		return clinicaltime;
	}

	public void setClinicaltime(Date clinicaltime) {
		this.clinicaltime = clinicaltime;
	}

	public Date getAppointmenttime() {
		return appointmenttime;
	}

	public void setAppointmenttime(Date appointmenttime) {
		this.appointmenttime = appointmenttime;
	}

	public String getChekcontent() {
		return chekcontent;
	}

	public void setChekcontent(String chekcontent) {
		this.chekcontent = chekcontent == null ? null : chekcontent.trim();
	}

	public String getAncillarycheckcontent() {
		return ancillarycheckcontent;
	}

	public void setAncillarycheckcontent(String ancillarycheckcontent) {
		this.ancillarycheckcontent = ancillarycheckcontent == null ? null
				: ancillarycheckcontent.trim();
	}

	public String getRealcheckcontent() {
		return realcheckcontent;
	}

	public void setRealcheckcontent(String realcheckcontent) {
		this.realcheckcontent = realcheckcontent == null ? null
				: realcheckcontent.trim();
	}

	public String getNormalusedrug() {
		return normalusedrug;
	}

	public void setNormalusedrug(String normalusedrug) {
		this.normalusedrug = normalusedrug == null ? null : normalusedrug
				.trim();
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis == null ? null : diagnosis.trim();
	}

	public String getTreatmentcareprescription() {
		return treatmentcareprescription;
	}

	public void setTreatmentcareprescription(String treatmentcareprescription) {
		this.treatmentcareprescription = treatmentcareprescription == null ? null
				: treatmentcareprescription.trim();
	}

	public String getTabooltems() {
		return tabooltems;
	}

	public void setTabooltems(String tabooltems) {
		this.tabooltems = tabooltems == null ? null : tabooltems.trim();
	}

	public Integer getOldmanId() {
		return oldmanId;
	}

	public void setOldmanId(Integer oldmanId) {
		this.oldmanId = oldmanId;
	}

	public String getMedicalrecord1() {
		return medicalrecord1;
	}

	public void setMedicalrecord1(String medicalrecord1) {
		this.medicalrecord1 = medicalrecord1 == null ? null : medicalrecord1
				.trim();
	}

	public String getMedicalrecord2() {
		return medicalrecord2;
	}

	public void setMedicalrecord2(String medicalrecord2) {
		this.medicalrecord2 = medicalrecord2 == null ? null : medicalrecord2
				.trim();
	}

	public String getMedicalrecord3() {
		return medicalrecord3;
	}

	public void setMedicalrecord3(String medicalrecord3) {
		this.medicalrecord3 = medicalrecord3 == null ? null : medicalrecord3
				.trim();
	}

	public String getMedicalrecord4() {
		return medicalrecord4;
	}

	public void setMedicalrecord4(String medicalrecord4) {
		this.medicalrecord4 = medicalrecord4 == null ? null : medicalrecord4
				.trim();
	}

	public String getMedicalrecord5() {
		return medicalrecord5;
	}

	public void setMedicalrecord5(String medicalrecord5) {
		this.medicalrecord5 = medicalrecord5 == null ? null : medicalrecord5
				.trim();
	}

	public String getMedicalrecord6() {
		return medicalrecord6;
	}

	public void setMedicalrecord6(String medicalrecord6) {
		this.medicalrecord6 = medicalrecord6 == null ? null : medicalrecord6
				.trim();
	}

	public String getMedicalrecord7() {
		return medicalrecord7;
	}

	public void setMedicalrecord7(String medicalrecord7) {
		this.medicalrecord7 = medicalrecord7 == null ? null : medicalrecord7
				.trim();
	}

	public String getMedicalrecord8() {
		return medicalrecord8;
	}

	public void setMedicalrecord8(String medicalrecord8) {
		this.medicalrecord8 = medicalrecord8 == null ? null : medicalrecord8
				.trim();
	}

	public String getMedicalrecord9() {
		return medicalrecord9;
	}

	public void setMedicalrecord9(String medicalrecord9) {
		this.medicalrecord9 = medicalrecord9 == null ? null : medicalrecord9
				.trim();
	}

	public String getMedicalrecord10() {
		return medicalrecord10;
	}

	public void setMedicalrecord10(String medicalrecord10) {
		this.medicalrecord10 = medicalrecord10 == null ? null : medicalrecord10
				.trim();
	}

	public Date getClinicaltime1() {
		return clinicaltime1;
	}

	public void setClinicaltime1(Date clinicaltime1) {
		this.clinicaltime1 = clinicaltime1;
	}

	public Date getClinicaltime2() {
		return clinicaltime2;
	}

	public void setClinicaltime2(Date clinicaltime2) {
		this.clinicaltime2 = clinicaltime2;
	}
}