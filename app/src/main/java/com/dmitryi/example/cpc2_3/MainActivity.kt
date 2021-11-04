package com.dmitryi.example.cpc2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var backgroundstart = (ImageView).findViewById(R.id.backgroundstart)
        var startButton = (ImageButton).findViewById(R.id.startButton)
    }

    public fun onStartButtonClick(View view: View) {
        startButton.setVisibility(View.GONE)
        backgroundstart.setVisibility(View.GONE)
        startButton.setClickable(false)
    }



}