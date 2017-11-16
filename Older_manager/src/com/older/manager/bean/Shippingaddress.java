package com.older.manager.bean;

public class Shippingaddress {
    private Integer id;

    private String location;

    private String detailaddress;

    private String name;

    private String phone;

    private String postcode;

    private Integer state;

    private Integer userId;

    private String column1;

    private String column2;
    
    private Users users;
    
    

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
}