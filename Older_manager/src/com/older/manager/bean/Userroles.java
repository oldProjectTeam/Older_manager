package com.older.manager.bean;

public class Userroles {
    private Integer id;

    private String name;

    private String userroles1;

    private String userroles2;

    private String userroles3;

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

    public String getUserroles1() {
        return userroles1;
    }

    public void setUserroles1(String userroles1) {
        this.userroles1 = userroles1 == null ? null : userroles1.trim();
    }

    public String getUserroles2() {
        return userroles2;
    }

    public void setUserroles2(String userroles2) {
        this.userroles2 = userroles2 == null ? null : userroles2.trim();
    }

    public String getUserroles3() {
        return userroles3;
    }

    public void setUserroles3(String userroles3) {
        this.userroles3 = userroles3 == null ? null : userroles3.trim();
    }
}