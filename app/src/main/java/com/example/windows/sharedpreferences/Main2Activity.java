package com.example.windows.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText edtEmail, edtPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        edtEmail	= findViewById(R.id.editEmail);
        edtPassword	=	findViewById(R.id.editPassword);
        buttonLogin	=	findViewById(R.id.buttonLogin);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
