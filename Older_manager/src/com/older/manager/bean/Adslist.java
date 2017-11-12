package com.older.manager.bean;

import java.util.Date;

public class Adslist {
    private Integer id;

    private String sortname;

    private Integer sort;

    private String sortphoto;

    private String sortsize;

    private String sorthref;

    private Date sortjointime;

    private String sortstate;

    private String sortone;

    private String sorttwo;

    private String sortthree;

    private Integer sortfour;

    private Integer sortadsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname == null ? null : sortname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSortphoto() {
        return sortphoto;
    }

    public void setSortphoto(String sortphoto) {
        this.sortphoto = sortphoto == null ? null : sortphoto.trim();
    }

    public String getSortsize() {
        return sortsize;
    }

    public void setSortsize(String sortsize) {
        this.sortsize = sortsize == null ? null : sortsize.trim();
    }

    public String getSorthref() {
        return sorthref;
    }

    public void setSorthref(String sorthref) {
        this.sorthref = sorthref == null ? null : sorthref.trim();
    }

    public Date getSortjointime() {
        return sortjointime;
    }

    public void setSortjointime(Date sortjointime) {
        this.sortjointime = sortjointime;
    }

    public String getSortstate() {
        return sortstate;
    }

    public void setSortstate(String sortstate) {
        this.sortstate = sortstate == null ? null : sortstate.trim();
    }

    public String getSortone() {
        return sortone;
    }

    public void setSortone(String sortone) {
        this.sortone = sortone == null ? null : sortone.trim();
    }

    public String getSorttwo() {
        return sorttwo;
    }

    public void setSorttwo(String sorttwo) {
        this.sorttwo = sorttwo == null ? null : sorttwo.trim();
    }

    public String getSortthree() {
        return sortthree;
    }

    public void setSortthree(String sortthree) {
        this.sortthree = sortthree == null ? null : sortthree.trim();
    }

    public Integer getSortfour() {
        return sortfour;
    }

    public void setSortfour(Integer sortfour) {
        this.sortfour = sortfour;
    }

    public Integer getSortadsid() {
        return sortadsid;
    }

    public void setSortadsid(Integer sortadsid) {
        this.sortadsid = sortadsid;
    }
}