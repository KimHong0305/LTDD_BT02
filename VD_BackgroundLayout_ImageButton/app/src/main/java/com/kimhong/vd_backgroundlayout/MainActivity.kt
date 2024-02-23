package com.kimhong.vd_backgroundlayout

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var img1 : ImageView
    private lateinit var bg : ConstraintLayout
    private lateinit var img2 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img1 = findViewById(R.id.imageView2)
        img2 = findViewById(R.id.imageButton1)

        img2.setOnClickListener{
            img1.setImageResource(R.drawable.dart);
            img1.getLayoutParams().width=550;
            img1.getLayoutParams().height=550;
        }

        bg = findViewById(R.id.constraintLayout1)
        bg.setBackgroundColor(Color.BLUE)
        bg.setBackgroundResource(R.drawable.bg2);

        // Random background
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