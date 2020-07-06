package com.dluche.tststeppercomponent.model;

public class StepMain extends BaseStep{
    private String endDate;

    public StepMain() {
    }

    public StepMain(String stepTtl,String endDate) {
        this.stepTtl = stepTtl;
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
