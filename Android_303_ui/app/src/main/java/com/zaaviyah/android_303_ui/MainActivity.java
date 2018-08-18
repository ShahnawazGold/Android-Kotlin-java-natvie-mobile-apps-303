package com.zaaviyah.android_303_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1TOGGLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1TOGGLE= (Button)findViewById(R.id.btTOOGLE);
        b1TOGGLE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toogleIntent = new Intent(MainActivity.this,ToggleActivity.class);
                startActivity(toogleIntent);

            }
        });
    }
}
