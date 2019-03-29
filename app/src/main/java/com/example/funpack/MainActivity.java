package com.example.funpack;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView t,v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.tvMain);
        v=(TextView)findViewById(R.id.tvMain2);
        Typeface mycustomFont=Typeface.createFromAsset(getAssets(),"font/Bs Signature Demo.ttf");
        Typeface mycustomfont=Typeface.createFromAsset(getAssets(),"font/Falling Button.ttf");
        t.setTypeface(mycustomFont);
        v.setTypeface(mycustomfont);
    }
}
