package com.zaaviyah.android_303_kotlin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     String TAG = "WELLCOME Android";
     Button btLogin ,b2Call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("onCreate()",TAG);

        btLogin =(Button)findViewById(R.id.btLOGIN);
        b2Call = (Button)findViewById(R.id.btCall) ;

        b2Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent CallINENT = new Intent( Intent.ACTION_VIEW, Uri.parse("tel:9510300000"));
                startActivity(CallINENT);

            }
        });


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"yes here",Toast.LENGTH_SHORT).show();

                Intent loginIntent = new Intent( MainActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart()",TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume()",TAG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause()",TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
         Log.d("onStop()",TAG);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart()",TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy()",TAG);
    }

}
