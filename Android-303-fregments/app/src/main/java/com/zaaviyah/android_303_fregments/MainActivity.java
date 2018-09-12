package com.zaaviyah.android_303_fregments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        Configuration conf = getResources().getConfiguration();

        FragmentManager fragmentManager =getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        if(conf.orientation==Configuration.ORIENTATION_LANDSCAPE){

            Lm_fragment  lm_fragment = new  Lm_fragment();
            fragmentTransaction.replace(android.R.id.content, lm_fragment);

        }
        else{

            PM_Fragement pm_fragment = new PM_Fragement();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
    }
}
