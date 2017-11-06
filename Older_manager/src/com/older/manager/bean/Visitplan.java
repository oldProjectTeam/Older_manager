package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Visitplan {
	private Integer id;

	@NotNull
	private Integer oldmanId;

	@NotNull
	private Date visiplantime;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "请输入中文")
	private String plannedvisits;

	@NotNull
	private String state;

	@NotNull
	private Date remindvistitplantime;

	@NotNull
	private String remindpeople;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "请输入中文")
	private String pendingevent;

	@NotNull
	private Date actualtime;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "请输入中文")
	private String actualplannedvisits;

	@NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "请输入中文")
	private String visitrecord;

	private String images;

	private String video;

	private String recording;

	private Date createtime;

	private String visitplan1;

	private String visitplan2;

	private String visitplan3;

	private Oldman oldman;

	@Override
	public String toString() {
		return "Visitplan [id=" + id + ", oldmanId=" + oldmanId
				+ ", visiplantime=" + visiplantime + ", plannedvisits="
				+ plannedvisits + ", state=" + state
				+ ", remindvistitplantime=" + remindvistitplantime
				+ ", remindpeople=" + remindpeople + ", pendingevent="
				+ pendingevent + ", actualtime=" + actualtime
				+ ", actualplannedvisits=" + actualplannedvisits
				+ ", visitrecord=" + visitrecord + ", images=" + images
				+ ", video=" + video + ", recording=" + recording
				+ ", createtime=" + createtime + ", visitplan1=" + visitplan1
				+ ", visitplan2=" + visitplan2 + ", visitplan3=" + visitplan3
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

	public Integer getOldmanId() {
		return oldmanId;
	}

	public void setOldmanId(Integer oldmanId) {
		this.oldmanId = oldmanId;
	}

	public Date getVisiplantime() {
		return visiplantime;
	}

	public void setVisiplantime(Date visiplantime) {
		this.visiplantime = visiplantime;
	}

	public String getPlannedvisits() {
		return plannedvisits;
	}

	public void setPlannedvisits(String plannedvisits) {
		this.plannedvisits = plannedvisits == null ? null : plannedvisits
				.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public Date getRemindvistitplantime() {
		return remindvistitplantime;
	}

	public void setRemindvistitplantime(Date remindvistitplantime) {
		this.remindvistitplantime = remindvistitplantime;
	}

	public String getRemindpeople() {
		return remindpeople;
	}

	public void setRemindpeople(String remindpeople) {
		this.remindpeople = remindpeople == null ? null : remindpeople.trim();
	}

	public String getPendingevent() {
		return pendingevent;
	}

	public void setPendingevent(String pendingevent) {
		this.pendingevent = pendingevent == null ? null : pendingevent.trim();
	}

	public Date getActualtime() {
		return actualtime;
	}

	public void setActualtime(Date actualtime) {
		this.actualtime = actualtime;
	}

	public String getActualplannedvisits() {
		return actualplannedvisits;
	}

	public void setActualplannedvisits(String actualplannedvisits) {
		this.actualplannedvisits = actualplannedvisits == null ? null
				: actualplannedvisits.trim();
	}

	public String getVisitrecord() {
		return visitrecord;
	}

	public void setVisitrecord(String visitrecord) {
		this.visitrecord = visitrecord == null ? null : visitrecord.trim();
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images == null ? null : images.trim();
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video == null ? null : video.trim();
	}

	public String getRecording() {
		return recording;
	}

	public void setRecording(String recording) {
		this.recording = recording == null ? null : recording.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getVisitplan1() {
		return visitplan1;
	}

	public void setVisitplan1(String visitplan1) {
		this.visitplan1 = visitplan1 == null ? null : visitplan1.trim();
	}

	public String getVisitplan2() {
		return visitplan2;
	}

	public void setVisitplan2(String visitplan2) {
		this.visitplan2 = visitplan2 == null ? null : visitplan2.trim();
	}

	public String getVisitplan3() {
		return visitplan3;
	}

	public void setVisitplan3(String visitplan3) {
		this.visitplan3 = visitplan3 == null ? null : visitplan3.trim();
	}
}