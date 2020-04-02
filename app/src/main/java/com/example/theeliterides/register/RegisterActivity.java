package com.example.theeliterides.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.theeliterides.MainActivity;
import com.example.theeliterides.R;
import com.example.theeliterides.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {


    TextView mLogInText,mGoBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mLogInText = (TextView) findViewById(R.id.reg_go_to_login);
        mGoBack = (TextView) findViewById(R.id.backtomainpage);


        mGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        mLogInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(log);
            }
        });

    }
}
