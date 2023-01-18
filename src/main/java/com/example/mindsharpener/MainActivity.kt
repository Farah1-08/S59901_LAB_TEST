package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.text_view_id1) as TextView
        val textView2 = findViewById<TextView>(R.id.text_view_id2) as TextView
        val textView3 = findViewById<TextView>(R.id.text_view_id3) as TextView
        val textView4 = findViewById<TextView>(R.id.text_view_id4) as TextView



         }
    }


