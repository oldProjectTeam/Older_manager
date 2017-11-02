package com.older.manager.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author ym
 *
 */
public class Sms {
    private Integer id;
    
    @NotNull
	@Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "姓名不合法")
    private String sender;

    private Date sendtime;

    @NotNull
    private String content;

    private Integer number;
    
    @NotNull
	@Pattern(regexp = "(^1[0-9]{10}$)", message = "接收的手机号码格式不正确")
    private String receiverphone;

    @Pattern(regexp = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)", message = "姓名不合法")
    private String receivername;

    private String sms3;

    private String sms4;

    private String sms5;

    private String sms6;

    private String sms7;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public String getReceiverphone() {
		return receiverphone;
	}

	public void setReceiverphone(String receiverphone) {
		this.receiverphone = receiverphone;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public String getSms3() {
        return sms3;
    }

    public void setSms3(String sms3) {
        this.sms3 = sms3 == null ? null : sms3.trim();
    }

    public String getSms4() {
        return sms4;
    }

    public void setSms4(String sms4) {
        this.sms4 = sms4 == null ? null : sms4.trim();
    }

    public String getSms5() {
        return sms5;
    }

    public void setSms5(String sms5) {
        this.sms5 = sms5 == null ? null : sms5.trim();
    }

    public String getSms6() {
        return sms6;
    }

    public void setSms6(String sms6) {
        this.sms6 = sms6 == null ? null : sms6.trim();
    }

    public String getSms7() {
        return sms7;
    }

    public void setSms7(String sms7) {
        this.sms7 = sms7 == null ? null : sms7.trim();
    }

	/*@Override
	public String toString() {
		return "Sms [id=" + id + ", sender=" + sender + ", sendtime="
				+ sendtime + ", content=" + content + ", number=" + number
				+ ", receiverphone=" + receiverphone + ", receivername="
				+ receivername + ", sms3=" + sms3 + ", sms4=" + sms4
				+ ", sms5=" + sms5 + ", sms6=" + sms6 + ", sms7=" + sms7 + "]";
	}*/
    
    
}