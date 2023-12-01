package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val tvTaunt = findViewById<TextView>(R.id.tvTaunt)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val btnCalc = findViewById<Button>(R.id.btnCalc)
        tvWelcome.text =
            "Welcome Nidday's everything app, what can we do you for today " + intent.getStringExtra(
                "USERNAME"
            ) + "?"
        tvTaunt.text =
            "So this \uD83D\uDC49 " + "**" + intent.getStringExtra("PASSWORD") + "**" + " is the password that you use for everything. Did you seriously think a simple app like this one needed a password! Now i know your everything password. Watch your back \uD83D\uDC40"
        btnConvert.setOnClickListener() {
            val intent = Intent(this, FahrenheitActivity::class.java)
            startActivity(intent)
        }

        btnCalc.setOnClickListener() {
            val intent = Intent(this, CalcActivity::class.java)
            startActivity(intent)
        }
    }
}