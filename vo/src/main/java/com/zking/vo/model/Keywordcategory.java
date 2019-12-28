package com.zking.vo.model;

import java.util.Date;

public class Keywordcategory {
    private Long kcid;

    private String category;

    private Date createdata;

    private Long createid;

    public Keywordcategory(Long kcid, String category, Date createdata, Long createid) {
        this.kcid = kcid;
        this.category = category;
        this.createdata = createdata;
        this.createid = createid;
    }

    public Keywordcategory() {
        super();
    }

    public Long getKcid() {
        return kcid;
    }

    public void setKcid(Long kcid) {
        this.kcid = kcid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedata() {
        return createdata;
    }

    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
        this.createid = createid;
    }
}