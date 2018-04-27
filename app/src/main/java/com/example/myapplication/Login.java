package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.rengwuxian.materialedittext.MaterialEditText;

public class Login extends AppCompatActivity {

    Button log;
    Button Adminlog;
    MaterialEditText usrname,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usrname = (MaterialEditText)findViewById(R.id.username);
        pass = (MaterialEditText)findViewById(R.id.password);
        log = (Button)findViewById(R.id.btncont);
        Adminlog = (Button)findViewById(R.id.admin);
        Adminlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               
                Intent i = new Intent(getApplicationContext(),adminlogin.class);
                startActivity(i);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(usrname.getText().toString().equals("deeptanshu") && pass.getText().toString().equals("dj123"))
                {

                    Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Enter Correct Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
