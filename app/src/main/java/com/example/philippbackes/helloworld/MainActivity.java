package com.example.philippbackes.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFcn(View view) {
        TextView text;
        text = findViewById(R.id.myText);
        if (text.getVisibility() == View.VISIBLE){
            text.setVisibility(View.INVISIBLE);
        } else {
            text.setVisibility(View.VISIBLE);
        }
    }
}
