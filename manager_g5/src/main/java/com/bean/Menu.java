package com.bean;

public class Menu {
    private Integer mId;

    private String mLoad;

    private Integer mUpload;

    private Integer mState;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmLoad() {
        return mLoad;
    }

    public void setmLoad(String mLoad) {
        this.mLoad = mLoad == null ? null : mLoad.trim();
    }

    public Integer getmUpload() {
        return mUpload;
    }

    public void setmUpload(Integer mUpload) {
        this.mUpload = mUpload;
    }

    public Integer getmState() {
        return mState;
    }

    public void setmState(Integer mState) {
        this.mState = mState;
    }
}