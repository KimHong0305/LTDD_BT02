package com.kimhong.vd_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.Control
import android.service.controls.actions.ControlAction
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var sw : Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw = findViewById(R.id.switch1)
        sw.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Wifi đang bật", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Wifi đang tắt", Toast.LENGTH_LONG).show()
        }
    }
}