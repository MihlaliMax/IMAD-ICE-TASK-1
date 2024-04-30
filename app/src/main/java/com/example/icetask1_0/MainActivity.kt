package com.example.icetask1_0

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // get the switch that turns on the Zulu greeting
        val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)

        // get the text view and edit text
        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        // get the button
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)


        // add code to the button that happens when it is clicked
        clickMeButton?.setOnClickListener {
            var greeting: String
            if (zuluSwitch.isChecked) {
                greeting = "Sawubona, ${nameEditText.text}!"
            } else {
                greeting = "Greetings, ${nameEditText.text}!"
            }
            welcomeTextView.text = greeting

            // easter egg for Sam and Samantha
            if (nameEditText.text.toString() == "Sam" ||
                nameEditText.text.toString() == "Samantha"
            ) {
                greeting = "Yo, ${nameEditText.text}!"
            } else {
                greeting = "Greetings, ${nameEditText.text}!"

            }
        }
    }

}