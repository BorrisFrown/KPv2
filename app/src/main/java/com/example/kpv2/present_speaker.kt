package com.example.kpv2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class present_speaker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present_speaker)

        setSupportActionBar(findViewById(R.id.toolbar))
        assert(supportActionBar != null)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true) //show back button
        supportActionBar!!.setDisplayShowTitleEnabled(false) //Remove text

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.description).apply {
            text = message
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}