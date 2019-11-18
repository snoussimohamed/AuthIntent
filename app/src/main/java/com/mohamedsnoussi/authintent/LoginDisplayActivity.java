package com.mohamedsnoussi.authintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginDisplayActivity extends AppCompatActivity {
    final String Extra_Login ="user_login";
    final  String Extra_password ="user_password";
    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
        Intent intent=getIntent();
        TextView laoginDisplay=findViewById(R.id.email_display);
        TextView passwordD= findViewById(R.id.password_display);
        if(intent!=null)


        {
            laoginDisplay.setText(intent.getStringExtra(Extra_Login));
            passwordD.setText(intent.getStringExtra(Extra_password));
        }
    }

}
