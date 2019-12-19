package com.zking.eurekaprovider.model;

import java.util.List;

public class Permission {
    private Long permissionId;

    private String permissionName;

    private Integer level;

    private Long parentPermissionId;

    private Integer available;

    private String url;

    private String icon;

    private List<Permission> permissions;




    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Permission(Long permissionId, String permissionName, Integer level, Long parentPermissionId, Integer available, String url, String icon) {
        this.permissionId = permissionId;
        this.permissionName = permissionName;
        this.level = level;
        this.parentPermissionId = parentPermissionId;
        this.available = available;
        this.url = url;
        this.icon = icon;
    }

    public Permission() {
        super();
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentPermissionId() {
        return parentPermissionId;
    }

    public void setParentPermissionId(Long parentPermissionId) {
        this.parentPermissionId = parentPermissionId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}