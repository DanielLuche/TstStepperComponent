package com.dluche.tststeppercomponent.VH;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dluche.tststeppercomponent.R;
import com.dluche.tststeppercomponent.model.StepAction;

public class StepActionVH extends RecyclerView.ViewHolder {
    private TextView tvTtl;
    private TextView tv_start_date;
    private ImageView iv_date_start;
    private ImageView iv_date_end;
    private TextView tv_end_date;
    private ImageView iv_user;
    private TextView tv_user;

    public StepActionVH(@NonNull View itemView) {
        super(itemView);
        bindViews();
    }

    private void bindViews() {
       tvTtl = this.itemView.findViewById(R.id.stepper_action_tv_ttl);
       tv_start_date = this.itemView.findViewById(R.id.stepper_action_tv_start_date);
       iv_date_start = this.itemView.findViewById(R.id.stepper_action_iv_date_start);
       iv_date_end = this.itemView.findViewById(R.id.stepper_action_iv_date_end);
       tv_end_date = this.itemView.findViewById(R.id.stepper_action_tv_end_date);
       iv_user = this.itemView.findViewById(R.id.stepper_action_iv_user);
       tv_user = this.itemView.findViewById(R.id.stepper_action_tv_user);
    }

    public void bindData(StepAction stepAction){
        tvTtl.setText(stepAction.getStepTtl());
        tv_start_date.setText(stepAction.getStartDate());
        tv_end_date.setText(stepAction.getEndDate());
        tv_user.setText(stepAction.getUserCode());
    }
}
