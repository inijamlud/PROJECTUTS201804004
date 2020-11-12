package com.jamal.UTS201804004

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val btn_call :Button = findViewById(R.id.btn_call)

        btn_call.setOnClickListener {
            val dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:087700228471"))
            startActivity(dial)
        }
    }
}