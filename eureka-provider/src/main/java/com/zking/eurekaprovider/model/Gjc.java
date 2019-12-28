package com.zking.eurekaprovider.model;

import java.util.Date;

public class Gjc {
    private Integer gid;

    private String gjc;

    private Long uid;

    private String createdata;

    private Integer action;
    private String gzmc;

    private String hfnr;
    public Gjc(Integer gid, String gjc, Long uid, String createdata, Integer action) {
        this.gid = gid;
        this.gjc = gjc;
        this.uid = uid;
        this.createdata = createdata;
        this.action = action;
    }

    public Gjc() {
        super();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGjc() {
        return gjc;
    }

    public void setGjc(String gjc) {
        this.gjc = gjc;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCreatedata() {
        return createdata;
    }

    public void setCreatedata(String createdata) {
        this.createdata = createdata;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getGzmc() {
        return gzmc;
    }

    public void setGzmc(String gzmc) {
        this.gzmc = gzmc;
    }

    public String getHfnr() {
        return hfnr;
    }

    public void setHfnr(String hfnr) {
        this.hfnr = hfnr;
    }
}