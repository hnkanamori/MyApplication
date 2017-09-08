package com.example.kanamori.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent in = new Intent(this,SubActivity.class);
        EditText editText = (EditText)this.findViewById(R.id.editText);
        in.putExtra("sendText", editText.getText().toString());
        startActivity(in);
    }
}
