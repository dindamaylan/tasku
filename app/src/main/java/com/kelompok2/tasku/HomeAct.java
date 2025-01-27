package com.kelompok2.tasku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeAct extends AppCompatActivity {

    LinearLayout card_todo;
    ImageView nav_home, nav_task, nav_daily, nav_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card_todo = findViewById(R.id.card_todo);
        nav_home = findViewById(R.id.nav_home);
        nav_task = findViewById(R.id.nav_task);
        nav_daily = findViewById(R.id.nav_daily);
        nav_profile = findViewById(R.id.nav_profile);


        card_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTask = new Intent(HomeAct.this, TaskAct.class);
                startActivity(toTask);
                //finish();
            }
        });
    }

    public void openHome(View view){
        Intent toHome = new Intent(HomeAct.this, HomeAct.class);
        startActivity(toHome);
    }

    public void openTask(View view){
        Intent toTask = new Intent(HomeAct.this, TaskAct.class);
        startActivity(toTask);
    }

    public void openDaily(View view){
        Intent toDaily = new Intent(HomeAct.this, DailyAct.class);
        startActivity(toDaily);
    }

    public void openProfile(View view){
        Intent toProfile = new Intent(HomeAct.this, ProfileAct.class);
        startActivity(toProfile);
    }

}