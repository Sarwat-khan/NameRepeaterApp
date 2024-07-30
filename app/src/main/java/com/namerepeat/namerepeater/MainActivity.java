package com.namerepeat.namerepeater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput = findViewById(R.id.nameInput);
    }

    public void Repeat(View view) {




        EditText nameInput = findViewById(R.id.nameInput); // Make sure the ID matches your layout
        String name = nameInput.getText().toString();

        Intent intent = new Intent(this, NameRepeat.class);
         intent.putExtra( NameRepeat.NAME_EXTRA,name);
        startActivity(intent);
    }

}