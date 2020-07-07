package com.dluche.tststeppercomponent.VH;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dluche.tststeppercomponent.R;
import com.dluche.tststeppercomponent.StepsAdapter;
import com.dluche.tststeppercomponent.model.StepMain;

public class StepMainVH extends RecyclerView.ViewHolder{
    private ImageView ivStatus;
    private TextView tvStatus;
    private TextView tvTtl;
    private TextView tvCloseDate;
    private ImageView ivEndDate;
    private View vTopStatus;
    private View vBottomStatus;
    private boolean childShown = false;
    private final StepsAdapter.onMainClickListener onClickListener;

    public StepMainVH(@NonNull View itemView, StepsAdapter.onMainClickListener onClickListener) {
        super(itemView);
        this.onClickListener = onClickListener;
        bindViews();
    }

    private void bindViews() {
        ivStatus = this.itemView.findViewById(R.id.stepper_main_iv_status);
        vTopStatus = this.itemView.findViewById(R.id.stepper_main_v_top_status);
        vBottomStatus = this.itemView.findViewById(R.id.stepper_main_v_bottom_status);
        tvStatus = this.itemView.findViewById(R.id.stepper_main_tv_status);
        tvTtl = this.itemView.findViewById(R.id.stepper_main_tv_ttl);
        tvCloseDate = this.itemView.findViewById(R.id.stepper_main_tv_close_date);
        ivEndDate = this.itemView.findViewById(R.id.stepper_main_iv_close_date);
        //
        this.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onClickListener != null){
                    onClickListener.onMainClick(
                        isChildShown(),
                        getAdapterPosition()
                    );
                    //
                    childShown = !childShown;
                }
            }
        });
    }

    public boolean isChildShown() {
        return childShown;
    }

    public void setChildShown(boolean childShown) {
        this.childShown = childShown;
    }

    public void bindData(StepMain stepMain){
        if(getAdapterPosition() == 0){
            vTopStatus.setVisibility(View.GONE);
        }
        tvTtl.setText(stepMain.getStepTtl());
        tvCloseDate.setText(stepMain.getEndDate());
    }
}
