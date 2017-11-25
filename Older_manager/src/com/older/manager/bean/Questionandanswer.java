package com.older.manager.bean;

public class Questionandanswer {
    private Integer id;

    private String questionone;

    private String answerone;

    private String questiontwo;

    private String answertwo;

    private Integer userid;

    private String one;

    private String two;

    private Integer three;

    
    
    
    @Override
	public String toString() {
		return "Questionandanswer [id=" + id + ", questionone=" + questionone
				+ ", answerone=" + answerone + ", questiontwo=" + questiontwo
				+ ", answertwo=" + answertwo + ", userid=" + userid + ", one="
				+ one + ", two=" + two + ", three=" + three + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionone() {
        return questionone;
    }

    public void setQuestionone(String questionone) {
        this.questionone = questionone == null ? null : questionone.trim();
    }

    public String getAnswerone() {
        return answerone;
    }

    public void setAnswerone(String answerone) {
        this.answerone = answerone == null ? null : answerone.trim();
    }

    public String getQuestiontwo() {
        return questiontwo;
    }

    public void setQuestiontwo(String questiontwo) {
        this.questiontwo = questiontwo == null ? null : questiontwo.trim();
    }

    public String getAnswertwo() {
        return answertwo;
    }

    public void setAnswertwo(String answertwo) {
        this.answertwo = answertwo == null ? null : answertwo.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one == null ? null : one.trim();
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two == null ? null : two.trim();
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }
}