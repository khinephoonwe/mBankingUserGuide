package com.example.android.mbankinguserguide.activities;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.mbankinguserguide.R;

public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        MyCount counter = new MyCount(3000,1000);

        counter.start();

    }
    //countdowntimer is an abstract class, so extend it and fill in methods
    public class MyCount extends CountDownTimer {

        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(FirstScreenActivity.this,MainListActivity.class);
            startActivity(intent);
            finish();
        }

        @Override
        public void onTick(long millisUntilFinished) {


        }

    }


}
