package com.example.mayank.letscall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by mayank on 14-11-2016.
 */

public class LoginActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button Login = (Button)findViewById(R.id.login_button);
        TextView Username = (TextView)findViewById(R.id.username);
        TextView Password = (TextView)findViewById(R.id.password);
    }
}
