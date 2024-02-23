package com.kimhong.baitap01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var bg : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bg = findViewById(R.id.constraintLayout1)

        val arrayList = ArrayList<Int>()
        arrayList.add(R.drawable.bg1)
        arrayList.add(R.drawable.bg2)
        arrayList.add(R.drawable.bg3)
        arrayList.add(R.drawable.bg4)

        val random = Random
        val vitri = random.nextInt(arrayList.size)
        bg.setBackgroundResource(arrayList.get(vitri));
    }
}