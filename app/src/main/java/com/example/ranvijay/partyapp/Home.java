package com.example.ranvijay.partyapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
              FragmentManager fragmentManager=getSupportFragmentManager();
              FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    fragmentTransaction.replace(R.id.container,new SearchFragment()).commit();

                    return true;


                /*case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    fragmentTransaction.replace(R.id.noti,new Notification()).commit();
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText("search");
                    fragmentTransaction.replace(R.id.searchbar,new Search()).commit();

                    return  true;*/
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

       // mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.content,new SearchFragment()).commit();
    }

}
