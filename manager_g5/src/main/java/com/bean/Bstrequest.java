package com.bean;

import java.util.Date;

public class Bstrequest {
    private Integer bstreqId;

    private String bstreqAppliactid;

    private Date bstreqBegin;

    private Date bstreqEnd;

    private String bstreqAddress;

    private Integer bstreqCarid;

    private String bstreqReason;

    private Integer bstreqMoney;

    private Integer bstreqApproid;

    private String bstreqTask;

    public Integer getBstreqId() {
        return bstreqId;
    }

    public void setBstreqId(Integer bstreqId) {
        this.bstreqId = bstreqId;
    }

    public String getBstreqAppliactid() {
        return bstreqAppliactid;
    }

    public void setBstreqAppliactid(String bstreqAppliactid) {
        this.bstreqAppliactid = bstreqAppliactid == null ? null : bstreqAppliactid.trim();
    }

    public Date getBstreqBegin() {
        return bstreqBegin;
    }

    public void setBstreqBegin(Date bstreqBegin) {
        this.bstreqBegin = bstreqBegin;
    }

    public Date getBstreqEnd() {
        return bstreqEnd;
    }

    public void setBstreqEnd(Date bstreqEnd) {
        this.bstreqEnd = bstreqEnd;
    }

    public String getBstreqAddress() {
        return bstreqAddress;
    }

    public void setBstreqAddress(String bstreqAddress) {
        this.bstreqAddress = bstreqAddress == null ? null : bstreqAddress.trim();
    }

    public Integer getBstreqCarid() {
        return bstreqCarid;
    }

    public void setBstreqCarid(Integer bstreqCarid) {
        this.bstreqCarid = bstreqCarid;
    }

    public String getBstreqReason() {
        return bstreqReason;
    }

    public void setBstreqReason(String bstreqReason) {
        this.bstreqReason = bstreqReason == null ? null : bstreqReason.trim();
    }

    public Integer getBstreqMoney() {
        return bstreqMoney;
    }

    public void setBstreqMoney(Integer bstreqMoney) {
        this.bstreqMoney = bstreqMoney;
    }

    public Integer getBstreqApproid() {
        return bstreqApproid;
    }

    public void setBstreqApproid(Integer bstreqApproid) {
        this.bstreqApproid = bstreqApproid;
    }

    public String getBstreqTask() {
        return bstreqTask;
    }

    public void setBstreqTask(String bstreqTask) {
        this.bstreqTask = bstreqTask == null ? null : bstreqTask.trim();
    }
}