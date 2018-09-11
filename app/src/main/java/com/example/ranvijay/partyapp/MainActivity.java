package com.example.ranvijay.partyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=(Button)findViewById(R.id.login);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(MainActivity.this,LoginActivity.class);
               startActivity(i);
           }
       });

        final Button signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1=new Intent(MainActivity.this,signup.class);
                startActivity(i1);
            }
        });
        Button laterButton=(Button)findViewById(R.id.laterbutton);
        laterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity.this,Home.class);
                startActivity(i3);
            }
        });
    }


}
