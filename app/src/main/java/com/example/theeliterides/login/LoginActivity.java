package com.example.theeliterides.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.theeliterides.MainActivity;
import com.example.theeliterides.R;
import com.example.theeliterides.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
    Button mGoBack;
    TextView mneedAnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mGoBack = (Button) findViewById(R.id.backtomainpage);
        mneedAnAccount = (TextView) findViewById(R.id.need_an_account);


        mGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        mneedAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
