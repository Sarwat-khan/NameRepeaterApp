package com.namerepeat.namerepeater;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NameRepeat extends AppCompatActivity {

    public static final String NAME_EXTRA = "name_extra";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_repeat);

        TextView yourName = findViewById(R.id.yourName);

        String name = getIntent().getStringExtra(NAME_EXTRA);
        yourName.setText("Your Have Amazing Name " + name);


    }


}
