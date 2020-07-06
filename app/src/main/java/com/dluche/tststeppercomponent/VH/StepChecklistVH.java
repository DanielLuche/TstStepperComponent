package com.dluche.tststeppercomponent.VH;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dluche.tststeppercomponent.R;
import com.dluche.tststeppercomponent.model.StepChecklist;

public class StepChecklistVH extends RecyclerView.ViewHolder {
    private TextView tvTtl;
    private TextView tv_start_date;
    private TextView tv_workgroup;
    private TextView tv_partner;

    public StepChecklistVH(@NonNull View itemView) {
        super(itemView);
        bindViews();
    }

    private void bindViews() {
       tvTtl = this.itemView.findViewById(R.id.stepper_checklist_tv_ttl);
       tv_start_date = this.itemView.findViewById(R.id.stepper_checklist_tv_start_date);
       tv_workgroup = this.itemView.findViewById(R.id.stepper_checklist_tv_work_group);
       tv_partner = this.itemView.findViewById(R.id.stepper_checklist_tv_partner);
    }

    public void bindData(StepChecklist stepChecklist){
        tvTtl.setText(stepChecklist.getStepTtl());
        tv_start_date.setText(stepChecklist.getStartDate());
        tv_workgroup.setText(stepChecklist.getWorkgroup());
        tv_partner.setText(stepChecklist.getPartner());
    }
}
