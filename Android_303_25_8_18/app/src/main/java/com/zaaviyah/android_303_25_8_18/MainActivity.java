package com.zaaviyah.android_303_25_8_18;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Bitmap bmp;

    private Bitmap operation;


     Button b1blue, b2gray;
     ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1blue= (Button)findViewById(R.id.btBlue);
        b2gray =(Button)findViewById(R.id.btGray);

        img= (ImageView)findViewById(R.id.img1);


        /// class add here show
        BitmapDrawable abmp = (BitmapDrawable) img.getDrawable();
        bmp = abmp.getBitmap();


    }

    public void gray (View view){

        operation= Bitmap.createBitmap(bmp.getHeight(),bmp.getWidth(),bmp.getConfig());

        double red = 0.33;
        double green = 0.59;
        double blue = 0.11;

        for (int i = 0; i < bmp.getWidth(); i++) {
            for (int j = 0; j < bmp.getHeight(); j++) {

                int p = bmp.getPixel(i, j);

                int r = Color.red(p);
                int g = Color.green(p);
                int b = Color.blue(p);

                r = (int) red * r;
                g = (int) green * g;
                b = (int) blue * b;
                operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
            }
        }

        img.setImageBitmap(operation);
    }
}



