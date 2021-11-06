package com.dmitryi.example.cpc2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.isInvisible


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backGround: ImageView = findViewById(R.id.background_start)
        val startButton: ImageButton = findViewById(R.id.start_Button)

        startButton.setOnClickListener {
            backGround.visibility = backGround.isInvisible
            startButton.visibility = startButton.isInvisible
        }

    }


}