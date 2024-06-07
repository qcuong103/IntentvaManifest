package com.cuong_103.bai6_intentvamanifest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        finish();
    }

    @Override
    public void finish() {
        Intent data = new Intent();
        data.putExtra("returnKey1","Gia tri tra ve thu 1");
        data.putExtra("returnKey2","Gia tri tra ve thu 2");
        setResult(RESULT_OK, data);
        super.finish();
    }
}