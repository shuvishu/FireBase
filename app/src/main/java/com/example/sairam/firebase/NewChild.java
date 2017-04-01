package com.example.sairam.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NewChild extends AppCompatActivity {

    Button Cancle,Save;
    EditText ChildId,MotherId,AnganwadiId,Childname,BirthRegistrationNumber,ChildWeight,ChildHeight;
    DatePicker ChildDOB;
    RadioGroup RChildGender,RSelectTypeOfDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_child);

        ChildId = (EditText)findViewById(R.id.ETchildId);
        MotherId =(EditText)findViewById(R.id.ETChildMotherId);
        AnganwadiId =(EditText)findViewById(R.id.ETChildAnganwadiId);
        Childname =(EditText)findViewById(R.id.ETChildName);
        BirthRegistrationNumber =(EditText)findViewById(R.id.ETBirthRegistrationNumber);
        ChildWeight =(EditText)findViewById(R.id.ETChildWeight);
        ChildHeight =(EditText)findViewById(R.id.ETChildHeight);

        ChildDOB =(DatePicker)findViewById(R.id.DPChildDOB);

        RChildGender = (RadioGroup)findViewById(R.id.RChildGender);
        String Gender = ((RadioButton)findViewById(RChildGender.getCheckedRadioButtonId())).getText().toString();

        RSelectTypeOfDelivery = (RadioGroup)findViewById(R.id.SelectTypeOfDelivery);
        String TypeOfDelivery = ((RadioButton)findViewById(RSelectTypeOfDelivery.getCheckedRadioButtonId())).getText().toString();

        Save = (Button)findViewById(R.id.BsaveChild);
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
