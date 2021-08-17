package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    TextView txt_name, txt_email, txt_contact, txt_dob, txt_id;
    Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);



        txt_name = findViewById(R.id.name);
        txt_email = findViewById(R.id.email);
        txt_contact = findViewById(R.id.contact);
        txt_dob = findViewById(R.id.dob);
        txt_id = findViewById(R.id.id);

        Intent intent = getIntent();

        String NAME_DATA = intent.getStringExtra(Students.NAME_KEY);
        String EMAIL_DATA = intent.getStringExtra(Students.EMAIL_KEY);
        String CONTACT_DATA = intent.getStringExtra(Students.PHONE_KEY);
        String DOB_DATA = intent.getStringExtra(Students.DOB_KEY);
        String ID_DATA = intent.getStringExtra(Students.ID_KEY);

        txt_name.setText(NAME_DATA);
        txt_email.setText(EMAIL_DATA);
        txt_contact.setText(CONTACT_DATA);
        txt_dob.setText(DOB_DATA);
        txt_id.setText(ID_DATA);


        buttonback = findViewById(R.id.btn_back);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent = new Intent(UserActivity.this, MainActivity.class);

                startActivity(intent);

            }
        });




    }
}