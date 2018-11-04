package com.bean;

public class User {
    private Integer userId;

    private String userName;

    private String userPass;

    private String userRealname;

    private String userCardid;

    private Integer userAge;

    private Integer userPhone;

    private Integer userGender;

    private String userTitle;

    private Integer userRoleid;

    private String userImage;

    private Integer userOrgid;

    private Integer userDepartid;

    private Integer userState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserCardid() {
        return userCardid;
    }

    public void setUserCardid(String userCardid) {
        this.userCardid = userCardid == null ? null : userCardid.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle == null ? null : userTitle.trim();
    }

    public Integer getUserRoleid() {
        return userRoleid;
    }

    public void setUserRoleid(Integer userRoleid) {
        this.userRoleid = userRoleid;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public Integer getUserOrgid() {
        return userOrgid;
    }

    public void setUserOrgid(Integer userOrgid) {
        this.userOrgid = userOrgid;
    }

    public Integer getUserDepartid() {
        return userDepartid;
    }

    public void setUserDepartid(Integer userDepartid) {
        this.userDepartid = userDepartid;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }
}