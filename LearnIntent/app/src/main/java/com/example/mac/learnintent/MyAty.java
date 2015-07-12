package com.example.mac.learnintent;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Mac on 15/7/12.
 */
public class MyAty extends Activity {

    public  static final String ACTION = "com.example.mac.learnintent.intent.action.myAty";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
    }
}
