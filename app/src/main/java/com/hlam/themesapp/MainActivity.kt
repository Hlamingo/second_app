package com.hlam.themesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.read_button)
        button.setOnClickListener {

            val intent = Intent(this@MainActivity, ReadActivity::class.java)
            startActivity(intent)
        }

    }

}