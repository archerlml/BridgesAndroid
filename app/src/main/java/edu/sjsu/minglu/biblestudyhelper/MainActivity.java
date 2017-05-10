package edu.sjsu.minglu.biblestudyhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    private ImageView image_view;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        image_view = (ImageView) findViewById(R.id.chapter1);
//        image_view.setImageResource(R.drawable.c2);
//        image_view.bringToFront();
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_top, new topFragment());
        transaction.replace(R.id.fragment_bot, new botFragment());
        transaction.commit();
    }

    public void onbotFragmentInteraction(String string) {
        // Do stuff
    }


    public void ontopFragmentInteraction(String string) {
        // Do different stuff
    }
}
