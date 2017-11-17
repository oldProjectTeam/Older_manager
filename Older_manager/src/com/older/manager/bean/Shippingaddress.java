package com.older.manager.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Shippingaddress {
    private Integer id;

    
    private String location;

    @NotEmpty(message="详细地址不能为空")
    @Length(min=1,max=100,message="详细地址长度超出限制")
    private String detailaddress;

    
    @Pattern(regexp="(^[a-zA-Z_-]{1,30}$)|(^[\\u2E80-\\u9FFF]{2,30})",
	message="收货人必须是2-30位字母或中文")
    private String name;

    @Pattern(regexp="^1[34578]\\d{9}$",message="手机号码不合法")
    private String phone;

    private String postcode;

    private Integer state;

    private Integer userId;

    private String column1;

    private String column2;
    
    private Users users;
    
    //扩展属性
    @NotEmpty(message="省份不能为空")
    @Length(min=1,max=20,message="省份长度超出限制")
    private String province1;//省份
    
    @NotEmpty(message="城市不能为空")
    @Length(min=1,max=20,message="城市长度超出限制")
    private String city1;//市
    
    @NotEmpty(message="区域不能为空")
    @Length(min=1,max=20,message="区域长度超出限制")
    private String area1;//区

    @Override
	public String toString() {
		return "Shippingaddress [id=" + id + ", location=" + location
				+ ", detailaddress=" + detailaddress + ", name=" + name
				+ ", phone=" + phone + ", postcode=" + postcode + ", state="
				+ state + ", userId=" + userId + ", column1=" + column1
				+ ", column2=" + column2 + ", users=" + users + "]";
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

	public String getProvince1() {
		return province1;
	}

	public void setProvince1(String province1) {
		this.province1 = province1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getArea1() {
		return area1;
	}

	public void setArea1(String area1) {
		this.area1 = area1;
	}
}