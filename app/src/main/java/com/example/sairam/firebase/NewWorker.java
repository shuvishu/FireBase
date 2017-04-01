package com.example.sairam.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NewWorker extends AppCompatActivity {

    EditText ETworkerID;
    EditText ETworkername;
    EditText ETworkerContactNumber;
    EditText ETworkerAddress;
    Button BsaveWorker;
    Button CancelSaveNewWorker;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_worker);
        BsaveWorker=(Button)findViewById(R.id.SaveWorkerDetails);
        firebaseDatabase.getReference("Worker");
       // Button CancelSaveNewWorker=(Button)findViewById(R.id.cancelSavingWorker);
        BsaveWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ETworkerID1=ETworkerID.getText().toString();
                String ETworkername1=ETworkername.getText().toString();
                String ETworkerContactNumber1=ETworkerContactNumber.getText().toString();
                String ETworkerAddress1=ETworkerAddress.getText().toString();
                root.child("ADMIN").child(ETworkerID1).setValue(ETworkername1);
              //  root.child("Workers").child(ETworkerID1).setValue(ETworkerContactNumber1);
               // root.child("Workers").child(ETworkerID1).setValue(ETworkerAddress1);

            }
        });


    }
}
