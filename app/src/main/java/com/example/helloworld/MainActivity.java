package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.orange));
            }
        });
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((RelativeLayout) findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.darkBlue));
            }
        });
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Lulseged!");
                textView.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightBlue));

            }
        });

        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEntry = ((EditText) findViewById(R.id.editText)).getText().toString();
                String noUserEntry = "Sup Bro! Mind Entering a text?";
                if(userEntry.isEmpty()) {
                ((TextView) findViewById(R.id.text)).setText(noUserEntry);}
                else {
                ((TextView) findViewById(R.id.text)).setText(userEntry);}



            }
        });


    }
    }
