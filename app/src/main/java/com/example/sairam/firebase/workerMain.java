package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workerMain extends AppCompatActivity {

    Button BAdd_mother,BAdd_child,WeightAnalysis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_main);

        BAdd_mother = (Button) findViewById(R.id.BAddMother);
        BAdd_child =(Button)findViewById(R.id.BAddChild);
        WeightAnalysis =(Button)findViewById(R.id.BWeightAnalysis);

        BAdd_mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newMotherIntent = new Intent(workerMain.this,NewMother.class);
                startActivity(newMotherIntent);
            }
        });

        BAdd_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newChildIntent = new Intent(workerMain.this,NewChild.class);
                startActivity(newChildIntent);
            }
        });

        WeightAnalysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent weight = new Intent(workerMain.this,Weight.class);
                startActivity(weight);
            }
        });

    }
}
