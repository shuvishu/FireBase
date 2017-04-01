package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MinistryAct extends AppCompatActivity {
    Button Badsupevisor;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministry);
        Badsupevisor= (Button) findViewById(R.id.Baddsupervisor);
        Badsupevisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addsupervisorIntent=new Intent(MinistryAct.this,newSupervisor.class);
                startActivity(addsupervisorIntent);
            }
        });
    }
}
