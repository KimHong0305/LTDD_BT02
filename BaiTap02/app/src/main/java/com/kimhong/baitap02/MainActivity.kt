package com.kimhong.baitap02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var sw : Switch
    private lateinit var bg : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw = findViewById(R.id.switch1)
        bg = findViewById(R.id.constraintLayout1)
        sw.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                bg.setBackgroundResource(R.drawable.bg2);
            else
                bg.setBackgroundResource(R.drawable.bg4);
        }
    }
}