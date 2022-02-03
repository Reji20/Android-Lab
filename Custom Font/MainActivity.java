package com.example.customfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.t1);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/Comforter-Regular.ttf");
        t1.setTypeface(myFont);
    }
}
