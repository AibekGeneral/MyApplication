package com.example.myapplication.ui.enter;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

public class EnterFragment extends Fragment {

    public EnterFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_enter, container, false);

        TextInputEditText emailEditText = view.findViewById(R.id.emailEditText);
        TextInputEditText editTextTextPassword = view.findViewById(R.id.passwordEditText);
        TextView textView = view.findViewById(R.id.text);
        TextView textView1 = view.findViewById(R.id.text2);
        Button button = view.findViewById(R.id.button2);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SecretActivity.class);
                startActivity(intent);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),RegisterActivity.class);
            startActivity(intent);
        }
    });


        return view;
    }
}