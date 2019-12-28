package com.zking.vo.model;

import lombok.Data;

import java.util.Date;
@Data
public class AuditCause {
    private Long ghid;

    private Long gid;

    private String cause;

    private Date causedata;

    private Integer aaction;

    public AuditCause(Long ghid, Long gid, String cause, Date causedata, Integer aaction) {
        this.ghid = ghid;
        this.gid = gid;
        this.cause = cause;
        this.causedata = causedata;
        this.aaction = aaction;
    }

    public AuditCause() {
        super();
    }

    public Long getGhid() {
        return ghid;
    }

    public void setGhid(Long ghid) {
        this.ghid = ghid;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Date getCausedata() {
        return causedata;
    }

    public void setCausedata(Date causedata) {
        this.causedata = causedata;
    }

    public Integer getAaction() {
        return aaction;
    }

    public void setAaction(Integer aaction) {
        this.aaction = aaction;
    }
}