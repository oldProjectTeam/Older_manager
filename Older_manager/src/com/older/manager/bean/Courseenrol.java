package com.older.manager.bean;

import java.util.Date;

public class Courseenrol {
    private Integer id;

    private Date enroltime;
    private String timeStr;//用作设置日期格式所用
    private String enrolstate;

    private Integer oldmamId;

    private String coursecompletion;

    private Double grade;

    private String rating;

    private String isnormalclass;

    private String remark;

    private Integer courseId;

    private String courseenrol1;

    private String courseenrol2;

    private String courseenrol3;

    //联表查询所用
    private Oldman oldman;
    private Courses courses;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEnroltime() {
        return enroltime;
    }

    public void setEnroltime(Date enroltime) {
        this.enroltime = enroltime;
    }

    public String getEnrolstate() {
        return enrolstate;
    }

    public void setEnrolstate(String enrolstate) {
        this.enrolstate = enrolstate == null ? null : enrolstate.trim();
    }

    public Integer getOldmamId() {
        return oldmamId;
    }

    public void setOldmamId(Integer oldmamId) {
        this.oldmamId = oldmamId;
    }

    public String getCoursecompletion() {
        return coursecompletion;
    }

    public void setCoursecompletion(String coursecompletion) {
        this.coursecompletion = coursecompletion == null ? null : coursecompletion.trim();
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    public String getIsnormalclass() {
        return isnormalclass;
    }

    public void setIsnormalclass(String isnormalclass) {
        this.isnormalclass = isnormalclass == null ? null : isnormalclass.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseenrol1() {
        return courseenrol1;
    }

    public void setCourseenrol1(String courseenrol1) {
        this.courseenrol1 = courseenrol1 == null ? null : courseenrol1.trim();
    }

    public String getCourseenrol2() {
        return courseenrol2;
    }

    public void setCourseenrol2(String courseenrol2) {
        this.courseenrol2 = courseenrol2 == null ? null : courseenrol2.trim();
    }

    public String getCourseenrol3() {
        return courseenrol3;
    }

    public void setCourseenrol3(String courseenrol3) {
        this.courseenrol3 = courseenrol3 == null ? null : courseenrol3.trim();
    }

	public Oldman getOldman() {
		return oldman;
	}

	public void setOldman(Oldman oldman) {
		this.oldman = oldman;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Courseenrol [id=" + id + ", enroltime=" + enroltime
				+ ", enrolstate=" + enrolstate + ", oldmamId=" + oldmamId
				+ ", coursecompletion=" + coursecompletion + ", grade=" + grade
				+ ", rating=" + rating + ", isnormalclass=" + isnormalclass
				+ ", remark=" + remark + ", courseId=" + courseId
				+ ", courseenrol1=" + courseenrol1 + ", courseenrol2="
				+ courseenrol2 + ", courseenrol3=" + courseenrol3 + ", oldman="
				+ oldman + ", courses=" + courses + "]";
	}

	public String getTimeStr() {
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}
}