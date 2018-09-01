package com.zaaviyah.android_303_1_9_sqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    Button b1ADD ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper =new DatabaseHelper(this);

        b1ADD= (Button)findViewById(R.id.btAdd);
        b1ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent addINTENT = new Intent(MainActivity.this,AddActivity.class);
                startActivity(addINTENT);

            }
        });

    }
}
