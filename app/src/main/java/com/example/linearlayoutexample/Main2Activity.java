package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static constant.AppConstant.EXTRA_EMAIL;

public class Main2Activity extends AppCompatActivity {

    // declare id
    private TextView tvMessage;
    private String passedEmailValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // after layout is inflated by the system then you can find ids
        tvMessage = findViewById(R.id.tvMessage);

        // now get the value send by MainActivity sent via intent in the key "ExtraEmail"

        Intent passedIntent = getIntent();

        if (getIntent() != null) {
            if (getIntent().hasExtra(EXTRA_EMAIL)) {

                passedEmailValue = getIntent().getStringExtra(EXTRA_EMAIL);

                // now display the passedEmail value in textView

                tvMessage.setText(passedEmailValue);
            }
        } else {
            // show toast no value has been passed
            Toast.makeText(this, "No email value has been passed", Toast.LENGTH_LONG).show();
        }
    }
}
