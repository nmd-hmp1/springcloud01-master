package com.zking.vo.model;

import java.util.Date;

public class keyword {
    private Long kid;

    private String keyword;

    private Long kcid;

    private Integer kaction;

    private Date createdata;

    private Long createid;

    public keyword(Long kid, String keyword, Long kcid, Integer kaction, Date createdata, Long createid) {
        this.kid = kid;
        this.keyword = keyword;
        this.kcid = kcid;
        this.kaction = kaction;
        this.createdata = createdata;
        this.createid = createid;
    }

    public keyword() {
        super();
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getKcid() {
        return kcid;
    }

    public void setKcid(Long kcid) {
        this.kcid = kcid;
    }

    public Integer getKaction() {
        return kaction;
    }

    public void setKaction(Integer kaction) {
        this.kaction = kaction;
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