package com.sberto.comptador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton : Button
    internal lateinit var timeText : TextView
    internal lateinit var counterText : TextView
    internal var counter = 0
    internal var time = 60
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         tapMeButton = findViewById(R.id.tapMeButton)
        timeText = findViewById(R.id.timeText)
        counterText = findViewById(R.id.counterText)

        tapMeButton.setOnClickListener {
            incrementCounter()
        }

        //timeText.text = time.toString()
        timeText.text = getString(R.string.temps_disponible_1_d, time)

    }

    private fun incrementCounter() {
        counter += 1 // = counter = counter +1
        counterText.text = counter.toString()
    }
}