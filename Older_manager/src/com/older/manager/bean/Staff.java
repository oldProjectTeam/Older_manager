package com.older.manager.bean;

public class Staff {
    private Integer id;

    private String account;

    private String password;

    private String department;

    private String enterprisename;

    private Integer userrolesId;

    private String staff1;

    private String staff2;

    private String staff3;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }

    public Integer getUserrolesId() {
        return userrolesId;
    }

    public void setUserrolesId(Integer userrolesId) {
        this.userrolesId = userrolesId;
    }

    public String getStaff1() {
        return staff1;
    }

    public void setStaff1(String staff1) {
        this.staff1 = staff1 == null ? null : staff1.trim();
    }

    public String getStaff2() {
        return staff2;
    }

    public void setStaff2(String staff2) {
        this.staff2 = staff2 == null ? null : staff2.trim();
    }

    public String getStaff3() {
        return staff3;
    }

    public void setStaff3(String staff3) {
        this.staff3 = staff3 == null ? null : staff3.trim();
    }
}