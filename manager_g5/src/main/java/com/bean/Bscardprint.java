package com.bean;

import java.util.Date;

public class Bscardprint {
    private Integer bscardId;

    private Integer bscardApplicatid;

    private Date bscardDate;

    private String bscardDuty;

    private String bscardPhone;

    private Integer bscardNum;

    private String bscardComment;

    private Integer bscardApproid;

    public Integer getBscardId() {
        return bscardId;
    }

    public void setBscardId(Integer bscardId) {
        this.bscardId = bscardId;
    }

    public Integer getBscardApplicatid() {
        return bscardApplicatid;
    }

    public void setBscardApplicatid(Integer bscardApplicatid) {
        this.bscardApplicatid = bscardApplicatid;
    }

    public Date getBscardDate() {
        return bscardDate;
    }

    public void setBscardDate(Date bscardDate) {
        this.bscardDate = bscardDate;
    }

    public String getBscardDuty() {
        return bscardDuty;
    }

    public void setBscardDuty(String bscardDuty) {
        this.bscardDuty = bscardDuty == null ? null : bscardDuty.trim();
    }

    public String getBscardPhone() {
        return bscardPhone;
    }

    public void setBscardPhone(String bscardPhone) {
        this.bscardPhone = bscardPhone == null ? null : bscardPhone.trim();
    }

    public Integer getBscardNum() {
        return bscardNum;
    }

    public void setBscardNum(Integer bscardNum) {
        this.bscardNum = bscardNum;
    }

    public String getBscardComment() {
        return bscardComment;
    }

    public void setBscardComment(String bscardComment) {
        this.bscardComment = bscardComment == null ? null : bscardComment.trim();
    }

    public Integer getBscardApproid() {
        return bscardApproid;
    }

    public void setBscardApproid(Integer bscardApproid) {
        this.bscardApproid = bscardApproid;
    }
}