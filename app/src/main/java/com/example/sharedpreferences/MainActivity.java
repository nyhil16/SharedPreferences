package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.txtEmail);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et.setText(preferences.getString("email", ""));
    }

    public void sig(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit().putString("mail", et.getText().toString());
        obj_editor.commit();
        finish();
    }
}