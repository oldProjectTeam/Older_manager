package com.older.manager.bean;

import java.util.Date;

public class Sortads {
    private Integer id;

    private String sortname;

    private Integer sortnum;

    private String sortcontent;

    private Date sortjointime;

    private String sortstate;

    private String numone;

    private String numtwo;

    private String numthree;

    private Integer numfore;

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

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public String getSortcontent() {
        return sortcontent;
    }

    public void setSortcontent(String sortcontent) {
        this.sortcontent = sortcontent == null ? null : sortcontent.trim();
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

    public String getNumone() {
        return numone;
    }

    public void setNumone(String numone) {
        this.numone = numone == null ? null : numone.trim();
    }

    public String getNumtwo() {
        return numtwo;
    }

    public void setNumtwo(String numtwo) {
        this.numtwo = numtwo == null ? null : numtwo.trim();
    }

    public String getNumthree() {
        return numthree;
    }

    public void setNumthree(String numthree) {
        this.numthree = numthree == null ? null : numthree.trim();
    }

    public Integer getNumfore() {
        return numfore;
    }

    public void setNumfore(Integer numfore) {
        this.numfore = numfore;
    }
}