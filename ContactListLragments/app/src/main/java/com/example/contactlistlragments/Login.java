package com.example.contactlistlragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.come_in);

    }

    public void come_in(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
