package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Card1 extends AppCompatActivity {

    private EditText jobId, customerName, date, contactNumber, paperNumber;
    private Button submitBtn;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        submitBtn = (Button)findViewById(R.id.btncont);
        jobId = (EditText)findViewById(R.id.jobid);
        customerName = (EditText)findViewById(R.id.customername);
        date = (EditText)findViewById(R.id.date);
        contactNumber = (EditText)findViewById(R.id.contactnumber);
        paperNumber = (EditText)findViewById(R.id.papernumber);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean status = writeNewUser(jobId.getText().toString(),customerName.getText().toString(),date.getText().toString()
                        ,contactNumber.getText().toString(),paperNumber.getText().toString());
                if(status == true){
                    Toast.makeText(getApplicationContext(), "Data Added Successfully", Toast.LENGTH_LONG);
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Unable to Add the Data", Toast.LENGTH_LONG);
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
            }
        });

    }

    private boolean writeNewUser(String jobId, String customerName, String date, String contactNumber, String paperNumber) {
        try {
            Card1Model cm1 = new Card1Model(jobId, customerName, date, contactNumber, paperNumber);

            mDatabase.child("Jobs").child(jobId).setValue(cm1);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}