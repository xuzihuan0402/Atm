package com.tom.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        EditText edusername = findViewById(R.id.username);
        EditText edpassword = findViewById(R.id.password);
        String username = edusername.getText().toString();
        String password = edpassword.getText().toString();
        if ("jack".equals(username) && "1234".equals(password)) {
            setResult(RESULT_OK);
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("登入訊息")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK",null)
                    .show();

        }

    }
}
