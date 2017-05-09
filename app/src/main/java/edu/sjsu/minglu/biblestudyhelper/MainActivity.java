package edu.sjsu.minglu.biblestudyhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_view = (ImageView) findViewById(R.id.chapter1);
        image_view.setImageResource(R.drawable.c2);
        image_view.bringToFront();
    }
}
