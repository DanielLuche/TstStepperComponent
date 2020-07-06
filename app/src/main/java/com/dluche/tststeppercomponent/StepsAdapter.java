package com.dluche.tststeppercomponent;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dluche.tststeppercomponent.VH.StepActionVH;
import com.dluche.tststeppercomponent.VH.StepChecklistVH;
import com.dluche.tststeppercomponent.VH.StepMainVH;
import com.dluche.tststeppercomponent.model.BaseStep;
import com.dluche.tststeppercomponent.model.StepAction;
import com.dluche.tststeppercomponent.model.StepChecklist;
import com.dluche.tststeppercomponent.model.StepMain;
import com.dluche.tststeppercomponent.model.StepNewProcess;

import java.util.ArrayList;

public class StepsAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<BaseStep> source;
    private onMainClickListener onMainClickListener;

    public interface onMainClickListener{
        void onMainClick(boolean isShown,int mainPosition);
    }

    public void setOnMainClickListener(StepsAdapter.onMainClickListener onMainClickListener) {
        this.onMainClickListener = onMainClickListener;
    }

    public StepsAdapter(Context context, ArrayList<BaseStep> source, StepsAdapter.onMainClickListener onMainClickListener) {
        this.context = context;
        this.source = source;
        this.onMainClickListener = onMainClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        switch (viewType){
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.stepper_main_cell, viewGroup, false);
                return new StepMainVH(
                    view,
                    onMainClickListener
                );
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.stepper_action_cell, viewGroup, false);
                return new StepActionVH(view);
            case 2:
                view = LayoutInflater.from(context).inflate(R.layout.stepper_checklist_cell, viewGroup, false);
                return new StepChecklistVH(view);
            /*case 3:
                view = LayoutInflater.from(context).inflate(R.layout.stepper_new_process_cell, viewGroup, false);
                return new StepNewProcessVH(view);
                break;   */
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        BaseStep baseStep = source.get(position);
        if(baseStep instanceof StepMain){
            StepMainVH stepMainVH = (StepMainVH) viewHolder;
            ((StepMainVH) viewHolder).bindData((StepMain) source.get(position));
        }else if(baseStep instanceof StepAction){
            StepActionVH stepMainVH = (StepActionVH) viewHolder;
            ((StepActionVH) viewHolder).bindData((StepAction) source.get(position));
        }else if(baseStep instanceof StepChecklist){
            StepChecklistVH stepMainVH = (StepChecklistVH) viewHolder;
            ((StepChecklistVH) viewHolder).bindData((StepChecklist) source.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return source.size();
    }

    @Override
    public int getItemViewType(int position) {
        BaseStep baseStep = source.get(position);
        if(baseStep instanceof StepMain){
            return 0;
        }else if(baseStep instanceof StepAction){
            return 1;
        }else if(baseStep instanceof StepChecklist){
            return 2;
        }else if(baseStep instanceof StepNewProcess){
            return 3;
        } else{
            return 4;
        }
    }
}
