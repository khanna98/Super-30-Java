package com.example.android.intentpractice;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.android.intentpractice.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signUp = findViewById(R.id.button);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    public void register() {
        EditText Name = findViewById(R.id.userName);
        EditText Email = findViewById(R.id.userEmail);
        EditText Pass = findViewById(R.id.userPass);
        EditText Confirm = findViewById(R.id.userConfirm);
        String UserName = String.valueOf(Name.getText());
        String UserEmail = String.valueOf(Email.getText());
        String UserPass = String.valueOf(Pass.getText());
        String UserConfirm = String.valueOf(Confirm.getText());
        Intent i1 = new Intent(MainActivity.this, SignUp.class);
        int num = 0;

        if (TextUtils.isEmpty(UserName)) {
            Name.setError("Please enter a name !");
            num = 1;
        }
        if (TextUtils.isEmpty(UserEmail)) {
            Email.setError("Please enter an email !");
            num = 1;
        }
        if (TextUtils.isEmpty(UserPass)) {
            Pass.setError("Password cannot be empty !");
            num = 1;
        }
        if (TextUtils.isEmpty(UserConfirm)) {
            Confirm.setError("Password cannot be empty !");
            num = 1;
        }
        if(num==1){
            return;
        }
        if (!UserConfirm.equals(UserPass)) {
            AlertDialog.Builder build = new AlertDialog.Builder(this);
            build.setMessage("Passwords do not match !");
            build.setCancelable(true);
            build.show();
            return;
        }
        i1.putExtra("Email", UserEmail);
        i1.putExtra("Password", UserPass);
        startActivity(i1);
    }
}