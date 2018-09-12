package com.zaaviyah.android_303_1_9_sqllite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {


    DatabaseHelper databaseHelper;

    Button b1add;
    EditText etname , etphone, etemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        databaseHelper =new DatabaseHelper(this);

        b1add= (Button)findViewById(R.id.btAddSAVE);
        etemail = (EditText)findViewById(R.id.etaddEmail);
        etname = (EditText)findViewById(R.id.etaddName);
        etphone = (EditText)findViewById(R.id.etaddCall);


        b1add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean result = databaseHelper.insertContact (etname.getText().toString(),Integer.parseInt(etphone.getText().toString()) ,etemail.getText().toString());

                if(result){
                    Toast.makeText(getApplicationContext(), "add save", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "NOT save", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
