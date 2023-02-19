package com.example.mobile_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editUserName,editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUserName = findViewById(R.id.usernametxt);
        editPassword = findViewById(R.id.passwordtxt);
        btnLogin = findViewById(R.id.loginbtn);
        btnLogin.setOnClickListener(new View.OnClickListener () {
            @Override
                    public void onClick(View view) {
                String datausername = editUserName.getText().toString();
                Toast.makeText(MainActivity.this, "Datanya : "+dataUsername, Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}