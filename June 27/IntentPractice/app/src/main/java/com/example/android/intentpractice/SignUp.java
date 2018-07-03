package com.example.android.intentpractice;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.intentpractice.R;

public class SignUp extends AppCompatActivity {

    String Uemail;
    String Upass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Bundle b1 = getIntent().getExtras();
        this.Uemail = b1.getString("Email");
        this.Upass = b1.getString("Password");
        Button btn = findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEmail = findViewById(R.id.email);
                EditText myPass = findViewById(R.id.pass);
                String newEmail = String.valueOf(myEmail.getText());
                String newPass = String.valueOf(myPass.getText());

                if(newEmail.equals(Uemail)){
                    if(newPass.equals(Upass)){
                        Intent i2 = new Intent(SignUp.this,FinalActivity.class);
                        startActivity(i2);
                    }else{
                        myEmail.setError("Email/Password don't Match !");
                    }
                }
            }
        });

    }
}
