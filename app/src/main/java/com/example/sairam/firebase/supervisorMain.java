package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class supervisorMain extends AppCompatActivity {
    Button Bad_worker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisor_main);

        Bad_worker=(Button) findViewById(R.id.addAnganwadiWorker);

        Bad_worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newWorkerIntent=new Intent(getApplicationContext(),NewWorker.class);
                startActivity(newWorkerIntent);
            }
        });

    }
}
