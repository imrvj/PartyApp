package com.example.ranvijay.partyapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    AlertDialog a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a=new AlertDialog.Builder(signup.this).create();
                a.setMessage("Registration Done");
                a.setTitle("Message...!");
               a.show();
                try {
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i3=new Intent(signup.this,Home.class);
                startActivity(i3);


                }

        });


    }
}
