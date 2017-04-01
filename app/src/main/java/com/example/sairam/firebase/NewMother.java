package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewMother extends AppCompatActivity {

    Button Cancle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_mother);
        Cancle = (Button)findViewById(R.id.BcancelsaveMother);

        Cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelMotherToWorker=new Intent(NewMother.this,workerMain.class);
                startActivity(cancelMotherToWorker);
            }
        });
    }
}
