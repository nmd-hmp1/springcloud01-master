package com.zking.vo.model;

public class Role {
    private Long tRoleId;

    private String tRoleName;

    private Integer tRoleAvailable;

    private String tRoleDescription;

    public Role(Long tRoleId, String tRoleName, Integer tRoleAvailable, String tRoleDescription) {
        this.tRoleId = tRoleId;
        this.tRoleName = tRoleName;
        this.tRoleAvailable = tRoleAvailable;
        this.tRoleDescription = tRoleDescription;
    }

    public Role() {
        super();
    }

    public Long gettRoleId() {
        return tRoleId;
    }

    public void settRoleId(Long tRoleId) {
        this.tRoleId = tRoleId;
    }

    public String gettRoleName() {
        return tRoleName;
    }

    public void settRoleName(String tRoleName) {
        this.tRoleName = tRoleName;
    }

    public Integer gettRoleAvailable() {
        return tRoleAvailable;
    }

    public void settRoleAvailable(Integer tRoleAvailable) {
        this.tRoleAvailable = tRoleAvailable;
    }

    public String gettRoleDescription() {
        return tRoleDescription;
    }

    public void settRoleDescription(String tRoleDescription) {
        this.tRoleDescription = tRoleDescription;
    }
}