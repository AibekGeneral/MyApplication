package com.example.myapplication.ui.enter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;

public class RegisterActivity extends AppCompatActivity {

    private ImageView photo;
    private ImageView photo1;
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private Button button;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        photo = (ImageView) findViewById(R.id.photo);
        photo1 = (ImageView) findViewById(R.id.photo1);
        editText = (EditText) findViewById(R.id.nameRegister1);
        editText1 = (EditText) findViewById(R.id.emailRegister1);
        editText2 = (EditText) findViewById(R.id.quriaRegister1);
        button = (Button) findViewById(R.id.button3);
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
                if (TextUtils.isEmpty(editText.getText())){
                    Toast.makeText(RegisterActivity.this, "Аты-Жөніңді енгіз ", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(editText1.getText())){
                    Toast.makeText(RegisterActivity.this, "Email-ді  енгіз ", Toast.LENGTH_SHORT).show();
                }else if(TextUtils.isEmpty(editText2.getText())) {
                    Toast.makeText(RegisterActivity.this, "Құпия сөз енгіз ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            photo.setVisibility(View.GONE);
            Bitmap image = (Bitmap) data.getExtras().get("data");
            photo1.setImageBitmap(image);
        }
    }
}