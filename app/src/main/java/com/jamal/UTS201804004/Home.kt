package com.jamal.UTS201804004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn1 :Button = findViewById(R.id.btn1)
        val btn2 :Button = findViewById(R.id.btn2)

        val tuname :TextView = findViewById(R.id.tuname)
        val teinfo :TextView = findViewById(R.id.tehelp)

        val bundle = intent.extras
        tuname.setText(bundle?.getString("uname"))

        btn1.setOnClickListener {
            startActivity(Intent(this, RvAsia::class.java))
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, RvEurope::class.java))
        }

        teinfo.setOnClickListener {
            startActivity(Intent(this, Call::class.java))
        }

    }
}