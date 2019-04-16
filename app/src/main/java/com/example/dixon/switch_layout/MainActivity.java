package com.example.dixon.switch_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTV1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTV1=(TextView)findViewById(R.id.tv1);
    }
    public void click_1(View view){
        setContentView(R.layout.screen_2);
    }
    public void click_2(View view){
        setContentView(R.layout.activity_main);
    }
}
