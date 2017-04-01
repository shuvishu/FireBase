package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class supervisorMain extends AppCompatActivity {
    Button Bad_mother,Bad_child,Bad_worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisor_main);
        Bad_mother= (Button) findViewById(R.id.add_mother);
        Bad_child=(Button)findViewById(R.id.add_child);
        Bad_worker=(Button) findViewById(R.id.addAnganwadiWorker);
        Bad_mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newMotherIntent=new Intent(supervisorMain.this,NewMother.class);
                startActivity(newMotherIntent);
            }
        });
        Bad_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newChildIntent=new Intent(supervisorMain.this,NewChild.class);
                startActivity(newChildIntent);
            }
        });
        Bad_worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newWorkerIntent=new Intent(supervisorMain.this,NewWorker.class);
                startActivity(newWorkerIntent);
            }
        });

    }
}
