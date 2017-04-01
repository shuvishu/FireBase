package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewChild extends AppCompatActivity {

    Button Cancle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_child);

        Cancle = (Button)findViewById(R.id.BcancelsaveChild);

        Cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelChildToWorker=new Intent(NewChild.this,workerMain.class);
                startActivity(cancelChildToWorker);
            }
        });
    }
}
