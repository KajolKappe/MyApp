package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity {

    CardView cv1,cv2,cv3,cv4,cv5,cv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cv1 = (CardView)findViewById(R.id.cv1);
        cv2 = (CardView)findViewById(R.id.cv2);
        cv3 = (CardView)findViewById(R.id.cv3);
        cv4 = (CardView)findViewById(R.id.cv4);
        cv5 = (CardView)findViewById(R.id.cv5);
        cv6 = (CardView)findViewById(R.id.cv6);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Card1.class);
                startActivity(i);
            }
        });
       cv2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(Home.this,Card2.class);
               startActivity(i);
           }
       });

    }
}
