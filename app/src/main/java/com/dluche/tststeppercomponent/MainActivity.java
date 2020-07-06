package com.dluche.tststeppercomponent;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dluche.tststeppercomponent.model.BaseStep;
import com.dluche.tststeppercomponent.model.StepAction;
import com.dluche.tststeppercomponent.model.StepMain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private StepsAdapter mAdapter;
    private ArrayList<BaseStep> sources = new ArrayList<>();
    private RecyclerView rvSteps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getBaseContext();
        rvSteps = findViewById(R.id.main_rv);
        generatedSources();
        initAdapter();
    }

    private void initAdapter() {
        if(sources != null){
            mAdapter = new StepsAdapter(
                context,
                sources,
                new StepsAdapter.onMainClickListener() {
                    @Override
                    public void onMainClick(boolean isShown, int mainPosition) {
                        int targetPosition = mainPosition +1;
                        if(isShown){
                            sources.remove(
                                targetPosition
                            );
                            mAdapter.notifyItemRemoved(targetPosition);
                        }else{
                            sources.add(
                                targetPosition,
                                new StepAction(
                                    "Ação",
                                    " 20/05/2020 17:05",
                                    " 25/05/2020 18:05",
                                    "Ronaldinho"
                                )
                            );
                            mAdapter.notifyItemInserted(targetPosition);
                        }
                    }
                }
            );
            rvSteps.setLayoutManager(
                new LinearLayoutManager(
                    context
                )
            );
            rvSteps.setAdapter(mAdapter);
        }
    }

    private void generatedSources() {
        StepMain stepMain = new StepMain(
            "1.Planejamento",
            " 20/05/2020 17:05"
        );
        StepMain stepMain2 = new StepMain(
            "2.Retirada de peças",
            ""
        );
        /*StepAction stepAction = new StepAction(
            "Ação",
            " 20/05/2020 17:05",
            " 25/05/2020 18:05",
            "Ronaldinho"
        );
        StepChecklist stepChecklist = new StepChecklist(
            "Ação",
            " 20/05/2020 17:05",
            " 25/05/2020 18:05",
            "Ronaldinho",
            "BttXApp",
            "22 - Namoa"
        );*/
        sources.add(stepMain);
        sources.add(stepMain2);
        /*sources.add(stepAction);
        sources.add(stepChecklist);*/
    }
}