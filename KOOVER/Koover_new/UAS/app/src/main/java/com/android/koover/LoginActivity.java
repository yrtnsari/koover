package com.android.koover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    private EditText nohp,password;
    Button  loginPost, regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nohp = (EditText) findViewById(R.id.txtHp);
        password = (EditText) findViewById(R.id.txtPassword);
        loginPost = (Button) findViewById(R.id.btnPost);
    }
    public void LoginPost(View view){
        if(nohp.getText().length()==0 && password.getText().length()==0){
            Toast.makeText(this, "Data tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }
        String user = nohp.getText().toString();
        String pass = password.getText().toString();
        new AsyncLoginActivity(this, 0).execute(user,pass);

    }
    public void regis(View view){
        startActivity(new Intent(LoginActivity.this,RegisActivity.class));
    }
}
