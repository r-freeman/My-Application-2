/**
 *  https://developer.android.com/training/basics/firstapp/creating-project.html
 *  https://developer.android.com/training/basics/firstapp/building-ui
 */

package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
