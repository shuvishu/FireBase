package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newSupervisor extends AppCompatActivity {
    Button BaddSupervisor;
    Button cancelAddSupervisor;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_supervisor);
        BaddSupervisor= (Button) findViewById(R.id.Baddsupervisor);
        cancelAddSupervisor= (Button) findViewById(R.id.BcancelAddSupervisor);
        cancelAddSupervisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelAddSupervisor=new Intent(newSupervisor.this,MinistryAct.class);
                startActivity(cancelAddSupervisor);
            }
        });
    }
}
