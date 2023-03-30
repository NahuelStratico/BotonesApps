package com.example.imcapp.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.imcapp.R

class ResultNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_name)

        val tvName = findViewById<TextView>(R.id.tvName)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()

        tvName.text = "Hello $name !"

    }
}
