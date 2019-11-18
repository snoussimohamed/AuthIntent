package com.mohamedsnoussi.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String Extra_Login = "user_login";
    final String Extra_password = "user_password";
    Button btn_conect;
    EditText mail;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail = findViewById(R.id.user_email);
        password = findViewById(R.id.user_password);
        btn_conect = findViewById(R.id.connect);
        btn_conect.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                if (mail.getText().toString().equals("") || password.getText().toString().equals("")) {

                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
                    return;
                }
              /*  Pattern p=Pattern.compile(".+@.+\\.[a-z]+");
                Matcher m=p.matcher(mail.toString());
                if (!m.matches()){
                    Toast.makeText(MainActivity.this, R.string.email_format_error,Toast.LENGTH_LONG).show();
                    return;*/
                else {


                    Intent intent = new Intent(MainActivity.this, LoginDisplayActivity.class);
                    intent.putExtra(Extra_Login, mail.toString());
                    intent.putExtra(Extra_password, password.toString());
                    startActivity(intent);

                }
            }

        });

    }
}
