package com.older.manager.bean;

import java.util.Date;

public class Recomactivity {
    private Integer id;

    private Integer activityId;

    private Date recomtime;

    private String recompeople;

    private Integer number;

    private String state;

    private Integer recomid;

    private String recomactivity1;

    private String recomactivity2;

    private String recomactivity3;

    private String remark;
    
    private Activity activity;
    
    

    public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getRecomtime() {
        return recomtime;
    }

    public void setRecomtime(Date recomtime) {
        this.recomtime = recomtime;
    }

    public String getRecompeople() {
        return recompeople;
    }

    public void setRecompeople(String recompeople) {
        this.recompeople = recompeople == null ? null : recompeople.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getRecomid() {
        return recomid;
    }

    public void setRecomid(Integer recomid) {
        this.recomid = recomid;
    }

    public String getRecomactivity1() {
        return recomactivity1;
    }

    public void setRecomactivity1(String recomactivity1) {
        this.recomactivity1 = recomactivity1 == null ? null : recomactivity1.trim();
    }

    public String getRecomactivity2() {
        return recomactivity2;
    }

    public void setRecomactivity2(String recomactivity2) {
        this.recomactivity2 = recomactivity2 == null ? null : recomactivity2.trim();
    }

    public String getRecomactivity3() {
        return recomactivity3;
    }

    public void setRecomactivity3(String recomactivity3) {
        this.recomactivity3 = recomactivity3 == null ? null : recomactivity3.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "Recomactivity [id=" + id + ", activityId=" + activityId
				+ ", recomtime=" + recomtime + ", recompeople=" + recompeople
				+ ", number=" + number + ", state=" + state + ", recomid="
				+ recomid + ", recomactivity1=" + recomactivity1
				+ ", recomactivity2=" + recomactivity2 + ", recomactivity3="
				+ recomactivity3 + ", remark=" + remark + ", activity="
				+ activity + ", getActivity()=" + getActivity() + ", getId()="
				+ getId() + ", getActivityId()=" + getActivityId()
				+ ", getRecomtime()=" + getRecomtime() + ", getRecompeople()="
				+ getRecompeople() + ", getNumber()=" + getNumber()
				+ ", getState()=" + getState() + ", getRecomid()="
				+ getRecomid() + ", getRecomactivity1()=" + getRecomactivity1()
				+ ", getRecomactivity2()=" + getRecomactivity2()
				+ ", getRecomactivity3()=" + getRecomactivity3()
				+ ", getRemark()=" + getRemark() + "]";
	}

	
    
}