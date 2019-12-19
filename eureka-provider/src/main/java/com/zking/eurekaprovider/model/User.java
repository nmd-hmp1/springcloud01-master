package com.zking.eurekaprovider.model;

public class User {
    private Long userId;

    private String userAccountnmber;

    private String userCipher;

    private String userKey;

    private Integer locked;

    public User(Long userId, String userAccountnmber, String userCipher, String userKey, Integer locked) {
        this.userId = userId;
        this.userAccountnmber = userAccountnmber;
        this.userCipher = userCipher;
        this.userKey = userKey;
        this.locked = locked;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAccountnmber() {
        return userAccountnmber;
    }

    public void setUserAccountnmber(String userAccountnmber) {
        this.userAccountnmber = userAccountnmber;
    }

    public String getUserCipher() {
        return userCipher;
    }

    public void setUserCipher(String userCipher) {
        this.userCipher = userCipher;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}