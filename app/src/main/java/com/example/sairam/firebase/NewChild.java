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

import java.util.ArrayList;

public class NewChild extends AppCompatActivity {

    Button Cancle,Save;
    EditText ChildId,MotherId,AnganwadiId,Childname,BirthRegistrationNumber,ChildWeight,ChildHeight;
    DatePicker ChildDOB;
    RadioGroup RChildGender,RSelectTypeOfDelivery,RChildCried;

    EditText ETUPD1,ETUPD3,ETUPD7,ETUPW6;
    EditText ETSPD1,ETSPD3,ETSPD7,ETSPW6;
    EditText ETDD1,ETDD3,ETDD7,ETDW6;
    EditText ETVD1,ETVD3,ETVD7,ETVW6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_child);


        //Fetch date from date picker
        ChildDOB = (DatePicker)findViewById(R.id.DPChildDOB);
        int day,month,year;
        day = ChildDOB.getDayOfMonth();
        month = ChildDOB.getMonth();
        year = ChildDOB.getYear();
        String ChildDob = day + "/" + month + "/" + year;

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

        RChildCried = (RadioGroup)findViewById(R.id.RChildCried);
        String RChildCriedValue = ((RadioButton)findViewById(RChildCried.getCheckedRadioButtonId())).getText().toString();


        ETUPD1 = (EditText)findViewById(R.id.ETUPD1);
        ETUPD3 = (EditText)findViewById(R.id.ETUPD3);
        ETUPD7 = (EditText)findViewById(R.id.ETUPD7);
        ETUPW6 = (EditText)findViewById(R.id.ETUPW6);

        ETSPD1 = (EditText)findViewById(R.id.ETSPD1);
        ETSPD3 = (EditText)findViewById(R.id.ETSPD3);
        ETSPD7 = (EditText)findViewById(R.id.ETSPD7);
        ETSPW6 = (EditText)findViewById(R.id.ETSPW6);

        ETDD1 = (EditText)findViewById(R.id.ETDD1);
        ETDD3 = (EditText)findViewById(R.id.ETDD3);
        ETDD7 = (EditText)findViewById(R.id.ETDD7);
        ETDW6 = (EditText)findViewById(R.id.ETDW6);

        ETVD1 = (EditText)findViewById(R.id.ETVD1);
        ETVD3 = (EditText)findViewById(R.id.ETVD3);
        ETVD7 = (EditText)findViewById(R.id.ETVD7);
        ETVW6 = (EditText)findViewById(R.id.ETVW6);





        Save = (Button)findViewById(R.id.BsaveChild);
        Cancle = (Button)findViewById(R.id.BcancelsaveChild);
        Cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelChildToWorker=new Intent(NewChild.this,workerMain.class);
                startActivity(cancelChildToWorker);
            }
        });

        ArrayList<Model> list=new ArrayList<>();
        Model m=new Model(
                ETUPD1.getText().toString(),ETUPD3.getText().toString(),ETUPD7.getText().toString(),ETUPW6.getText().toString(),
                ETSPD1.getText().toString(),ETSPD3.getText().toString(),ETSPD7.getText().toString(),ETSPW6.getText().toString(),
                ETDD1.getText().toString(),ETDD3.getText().toString(),ETDD7.getText().toString(),ETDW6.getText().toString(),
                ETVD1.getText().toString(),ETVD3.getText().toString(),ETVD7.getText().toString(),ETVW6.getText().toString()
        );

        //m.setUPD1376(ETUPD1.getText().toString(),ETUPD1.getText().toString(),ETUPD3.getText().toString(),ETUPD7.getText().toString());

//        m.setUPD1(ETUPD1.getText().toString());
//        m.setUPD3(ETUPD3.getText().toString());
//        m.setUPD7(ETUPD7.getText().toString());

       // m.setHelth(edt.getText().tostring());
       // m.setSocial("2");


        list.add(m);
    }
}
