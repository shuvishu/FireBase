package com.example.sairam.firebase;

import android.content.Intent;
import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static java.lang.System.in;

public class MainActivity extends AppCompatActivity {
    EditText et_id;
    EditText et_pass;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference root=firebaseDatabase.getReference();//provides acccess to root node
    //DatabaseReference child=root.child("ADMIN");
    Button login;
    Button ADD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.Login);

        ADD = (Button)findViewById(R.id.ADDBUTTON);
        et_id= (EditText)findViewById(R.id.ETid);
        et_pass= (EditText)findViewById(R.id.ETpass);

               login.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Character login_in_char;
                       String t=et_id.getText().toString().toUpperCase();
                       login_in_char=t.charAt(0);

                       switch (login_in_char)
                       {
                           case 'A':
                                root.child("LOGIN/ADMIN").child(t).addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {
                                        String password=et_pass.getText().toString();
                                        String firPass= (String) dataSnapshot.getValue();
                                        Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                        if (password.equals(firPass))
                                        {
                                            Intent adminIntent = new Intent(MainActivity.this,adminMain.class);
                                            startActivity(adminIntent);
                                        }
                                        else
                                        {
                                            Toast.makeText(MainActivity.this,"INVALID ID/PASSWORD",Toast.LENGTH_SHORT).show();
                                        }
                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                    }
                                });


                               break;
                           case 'D':
                               root.child("LOGIN/DISPENSARY").child(t).addValueEventListener(new ValueEventListener() {
                                   @Override
                                   public void onDataChange(DataSnapshot dataSnapshot) {
                                       String password=et_pass.getText().toString();
                                       String firPass= (String) dataSnapshot.getValue();
                                       Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                       if (password.equals(firPass))
                                       {
                                           Intent Dispintent=new Intent(getApplicationContext(),dispensaryMain.class);
                                           startActivity(Dispintent);
                                       }
                                       else
                                       {
                                           Toast.makeText(MainActivity.this,"INVALID PASSWORD",Toast.LENGTH_SHORT).show();
                                       }
                                   }

                                   @Override
                                   public void onCancelled(DatabaseError databaseError) {

                                   }
                               });


                               break;
                           case 'H':
                               root.child("LOGIN/HOSPITAL").child(t).addValueEventListener(new ValueEventListener() {
                                   @Override
                                   public void onDataChange(DataSnapshot dataSnapshot) {
                                       String password=et_pass.getText().toString();
                                       String firPass= (String) dataSnapshot.getValue();
                                       Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                       if (password.equals(firPass))
                                       {
                                           Intent Hosintent=new Intent(getApplicationContext(),hospitalMain.class);
                                           startActivity(Hosintent);
                                       }
                                       else
                                       {
                                           Toast.makeText(MainActivity.this,"INVALID PASSWORD",Toast.LENGTH_SHORT).show();
                                       }
                                   }

                                   @Override
                                   public void onCancelled(DatabaseError databaseError) {

                                   }
                               });


                               break;
                           case 'M':
                               root.child("LOGIN/MOTHER").child(t).addValueEventListener(new ValueEventListener() {
                                   @Override
                                   public void onDataChange(DataSnapshot dataSnapshot) {
                                       String password=et_pass.getText().toString();
                                       String firPass= (String) dataSnapshot.getValue();
                                       Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                       if (password.equals(firPass))
                                       {
                                           Intent MotherIntent=new Intent(getApplicationContext(),motherMain.class);
                                           startActivity(MotherIntent);
                                       }
                                       else
                                       {
                                           Toast.makeText(MainActivity.this,"INVALID PASSWORD",Toast.LENGTH_SHORT).show();
                                       }
                                   }

                                   @Override
                                   public void onCancelled(DatabaseError databaseError) {

                                   }
                               });

                               break;
                           case 'S':
                               root.child("LOGIN/SUPERVISOR").child(t).addValueEventListener(new ValueEventListener() {
                                   @Override
                                   public void onDataChange(DataSnapshot dataSnapshot) {
                                       String password=et_pass.getText().toString();
                                       String firPass= (String) dataSnapshot.getValue();
                                       Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                       if (password.equals(firPass))
                                       {
                                           Intent SupIntent=new Intent(getApplicationContext(),supervisorMain.class);
                                           startActivity(SupIntent);
                                       }
                                       else
                                       {
                                           Toast.makeText(MainActivity.this,"INVALID PASSWORD",Toast.LENGTH_SHORT).show();
                                       }
                                   }

                                   @Override
                                   public void onCancelled(DatabaseError databaseError) {

                                   }
                               });

                               break;
                           case 'W':
                               root.child("LOGIN/WORKER").child(t).addValueEventListener(new ValueEventListener() {
                                   @Override
                                   public void onDataChange(DataSnapshot dataSnapshot) {
                                       String password=et_pass.getText().toString();
                                       String firPass= (String) dataSnapshot.getValue();
                                       Toast.makeText(MainActivity.this,firPass,Toast.LENGTH_SHORT).show();
                                       if (password.equals(firPass))
                                       {
                                           Intent WorkerIntent=new Intent(getApplicationContext(),workerMain.class);
                                           startActivity(WorkerIntent);
                                       }
                                       else
                                       {
                                           Toast.makeText(MainActivity.this,"INVALID PASSWORD",Toast.LENGTH_SHORT).show();
                                       }
                                   }

                                   @Override
                                   public void onCancelled(DatabaseError databaseError) {

                                   }
                               });

                               break;
                       }
                   }
               });

    }



}
