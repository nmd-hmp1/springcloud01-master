package com.zking.eurekaprovider.model;

import java.util.List;

public class GjcWithBLOBs extends Gjc {
    private String gzmc;

    private String hfnr;

    public GjcWithBLOBs(Integer gid, String gjc, Long uid, String createdata, Integer action, String gzmc, String hfnr) {
        super(gid, gjc, uid, createdata, action);
        this.gzmc = gzmc;
        this.hfnr = hfnr;
    }
    private List<AuditCause> auditCauseList;

    public List<AuditCause> getAuditCauseList() {
        return auditCauseList;
    }

    public void setAuditCauseList(List<AuditCause> auditCauseList) {
        this.auditCauseList = auditCauseList;
    }
    public GjcWithBLOBs() {
        super();
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