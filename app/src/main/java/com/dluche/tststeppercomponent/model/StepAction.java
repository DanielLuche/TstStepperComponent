package com.dluche.tststeppercomponent.model;

public class StepAction extends BaseStep {
    private String startDate;
    private String endDate;
    private String userCode;

    public StepAction() {
    }

    public StepAction(String stepTtl,String startDate, String endDate, String userCode) {
        this.stepTtl = stepTtl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userCode = userCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
