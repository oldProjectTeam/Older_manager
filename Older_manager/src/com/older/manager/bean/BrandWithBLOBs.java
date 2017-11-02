package com.older.manager.bean;

public class BrandWithBLOBs extends Brand {
    private String logoimage;

    private String description;

    public String getLogoimage() {
        return logoimage;
    }

    public void setLogoimage(String logoimage) {
        this.logoimage = logoimage == null ? null : logoimage.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}