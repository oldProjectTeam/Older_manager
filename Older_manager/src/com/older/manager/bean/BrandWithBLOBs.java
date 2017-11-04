package com.older.manager.bean;

import java.util.Date;

public class BrandWithBLOBs extends Brand {
    private String logoimage;

    private String description;
    //添加时间，结合addtime做时间区间查询所有
   private Date addtime1;
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

	public Date getAddtime1() {
		return addtime1;
	}

	public void setAddtime1(Date addtime1) {
		this.addtime1 = addtime1;
	}

	@Override
	public String toString() {
		return "BrandWithBLOBs [logoimage=" + logoimage + ", description="
				+ description + ", addtime1=" + addtime1 + "]";
	}
}