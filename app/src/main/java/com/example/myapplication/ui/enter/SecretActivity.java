package com.example.myapplication.ui.enter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

public class SecretActivity extends AppCompatActivity {

    private ImageView image;
    private Button button;
    private TextInputEditText emailEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);

        emailEditText=(TextInputEditText)findViewById(R.id.emailEditText);
        button= (Button) findViewById(R.id.button2) ;
        image = (ImageView) findViewById(R.id.image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(emailEditText.getText())){
                    Toast.makeText(SecretActivity.this, "Email енгізіңіз", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });



    }
}