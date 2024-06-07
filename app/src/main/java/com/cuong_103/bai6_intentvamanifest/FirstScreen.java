package com.cuong_103.bai6_intentvamanifest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

//        Button testButton = (Button) findViewById(R.id.btnClickMe);
//        testButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);
//                startActivity(intent);
//            }
//        });

//        Intent serviceIntent = new Intent(this, ServiceExemple.class);
//        serviceIntent.putExtra("Key","value");
//        startService(serviceIntent);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Xf2vj9kLBUw"));
//        startActivity(intent);

//        Bundle extra = getIntent().getExtras();
//        String data = extra.getString(Intent.EXTRA_TEXT);

        Button testButton = (Button) findViewById(R.id.btnClickMe);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstScreen.this, SecondScreen.class);
                i.putExtra("value1", "day la gia tri 1 cho activity 2");
                i.putExtra("value2", "day la gia tri 2 cho activity 2");
                int REQUEST_CODE = 9;
                startActivityForResult(i, REQUEST_CODE);
            }
        });

//        Intent i = new Intent(FirstScreen.this, SecondScreen.class);
//        i.putExtra("value1", "day la gia tri 1 cho activity 2");
//        i.putExtra("value2", "day la gia tri 2 cho activity 2");
//        int REQUEST_CODE = 9;
//        startActivityForResult(i, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 9) {
            if (data.hasExtra("returnKey2")) {
                Toast.makeText(this, data.getExtras().getString("returnKey2"), Toast.LENGTH_SHORT).show();
            }
        }
    }
}