package com.example.netology_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w("onCreate", "start")

        val i: Int = 42
        val s: String = "Hello, World!"
        val f: Float = 3.14f

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "$s $i $f"

        Log.w("onCreate", "finish")
    }
}