package com.dluche.tststeppercomponent.model;

public class StepChecklist extends BaseStep {
    private String startDate;
    private String endDate;
    private String userCode;
    private String workgroup;
    private String partner;

    public StepChecklist() {
    }

    public StepChecklist(String stepTtl,String startDate, String endDate, String userCode, String workgroup, String partner) {
        this.stepTtl = stepTtl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userCode = userCode;
        this.workgroup = workgroup;
        this.partner = partner;
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

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
}
