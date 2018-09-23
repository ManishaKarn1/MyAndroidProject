package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;
import constant.AppConstant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AppConstant {

    private EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
    }

    public void showEmail(View view) {

        // can simply show toast
        Toast.makeText(this, etEmail.getText().toString(), Toast.LENGTH_LONG).show();

        // we can launch another activity also
        // Let's create Main2Activity -> Done

        // another activtity is launched via startActivity();
        // create an Intent

        Intent intentToAnotherActivtiy = new Intent(this, Main2Activity.class);

        // pass the entered email to another activity only when user has entered an email otherwise show error
        if (!etEmail.getText().toString().isEmpty()) {
            intentToAnotherActivtiy.putExtra(EXTRA_EMAIL, etEmail.getText().toString());

            startActivity(intentToAnotherActivtiy);

            // Now Another activity will get launched

            // further code i am writing on , u comment it out and see execution of code
            // Like wise we can send email entered in mainActivty to Main2Activity and display it there

            // pass email as a string as an intent to another activity
        } else {
            Toast.makeText(this, "Please enter an email", Toast.LENGTH_LONG).show();

        }
    }
}
