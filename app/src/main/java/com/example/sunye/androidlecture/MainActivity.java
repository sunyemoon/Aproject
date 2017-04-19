package com.example.sunye.androidlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    View mpage1,mpage2, mpage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpage1 = findViewById(R.id.layout_page1);
        mpage2 = findViewById(R.id.layout_page2);
        mpage3 = findViewById(R.id.layout_page3);

        findViewById(R.id.button).setOnClickListener(mClickListerner);
        findViewById(R.id.button2).setOnClickListener(mClickListerner);
        findViewById(R.id.button3).setOnClickListener(mClickListerner);
    }

    Button.OnClickListener mClickListerner = new Button.OnClickListener() {
        public void onClick(View v) {

            mpage1.setVisibility(View.INVISIBLE);
            mpage2.setVisibility(View.INVISIBLE);
            mpage3.setVisibility(View.INVISIBLE);

                switch (v.getId()) {
                    case R.id.button:
                        mpage1.setVisibility(View.VISIBLE);
                        break;
                    case R.id.button2:
                        mpage2.setVisibility(View.VISIBLE);
                        break;
                    case R.id.button3:
                        mpage3.setVisibility(View.VISIBLE);
                        break;


                }

        }
    };
}
