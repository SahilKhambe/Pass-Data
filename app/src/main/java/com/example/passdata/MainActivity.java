package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt_name, txt_email, txt_contact, txt_dob, txt_id;
    Button bsend;
    public static final String NAME_KEY = "nameKey";
    public static final String EMAIL_KEY = "emailKey";
    public static final String PHONE_KEY = "phoneKey";
    public static final String DOB_KEY = "dobkey";
    public static final String ID_KEY = "idkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name = findViewById(R.id.tname);
        txt_email = findViewById(R.id.temail);
        txt_contact = findViewById(R.id.tcontact);
        txt_dob = findViewById(R.id.tdob);
        txt_id = findViewById(R.id.tid);

        bsend = findViewById(R.id.bsend);

        bsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NAME = txt_name.getText().toString();
                String EMAIL = txt_email.getText().toString();
                String CONTACT = txt_contact.getText().toString();
                String DOB = txt_dob.getText().toString();
                String ID = txt_id.getText().toString();

                Intent intent = new Intent(MainActivity.this, UserActivity.class);

//                intent.putExtra(NAME_KEY, NAME);
//                intent.putExtra(EMAIL_KEY, EMAIL);
//                intent.putExtra(PHONE_KEY, CONTACT);
//                intent.putExtra(DOB_KEY, DOB);
//                intent.putExtra(ID_KEY, ID);


                intent.putExtra(Students.NAME_KEY, NAME);
                intent.putExtra(Students.EMAIL_KEY, EMAIL);
                intent.putExtra(Students.PHONE_KEY, CONTACT);
                intent.putExtra(Students.DOB_KEY, DOB);
                intent.putExtra(Students.ID_KEY, ID);

                startActivity(intent);


            }
        });






    }
}