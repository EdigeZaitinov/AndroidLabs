package com.example.contactlistlragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ContactAdapter.itemClicked{

    TextView tvName,tvSurname;
    EditText edName,edSurname;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName=(TextView) findViewById(R.id.tvNameRow);
        tvSurname=(TextView) findViewById(R.id.tvSurnameRow);
        edName=(EditText) findViewById(R.id.edName);
        edSurname=(EditText) findViewById(R.id.edSurname);
        addButton=(Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onItemClicked(int index) {
        tvName.setText(ContactBase.people.get(index).getName());
        tvSurname.setText(ContactBase.people.get(index).getSurname());
    }
}
