package com.example.myapplication.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.ui.enter.RegisterActivity;

public class Video extends AppCompatActivity {

    private EditText editText;
    private EditText editText1;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        editText = (EditText) findViewById(R.id.emailEditText);
        editText1 = (EditText) findViewById(R.id.passwordEditText);
        button = (Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText())) {
                    Toast.makeText(Video.this, "Аты-Жөніңді енгіз ", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(editText1.getText())) {
                    Toast.makeText(Video.this, "Email-ді  енгіз ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }

}
