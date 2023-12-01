package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FahrenheitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrenheit)

        val edtDegrees = findViewById<EditText>(R.id.edtDegrees)
        val edtFah = findViewById<EditText>(R.id.edtFah)
        val btnFahConvert = findViewById<Button>(R.id.btnFahConvert)
        val tvMain = findViewById<TextView>(R.id.tvMain)

        btnFahConvert.setOnClickListener() {
            val degrees = edtDegrees.text.toString()
            val fah = edtFah.text.toString()

            if (degrees != "") {
                val degreesInt = degrees.toInt()
                val ans = (degreesInt * (9 / 5)) + 32
                tvMain.text = "$degreesInt ℃ = $ans ℉"
            } else if (fah != "") {
                val fahInt = fah.toInt()
                val ans = (fahInt - 32) * 5 / 9
                tvMain.text = "$fahInt ℉ = $ans ℃"
            } else {
                Toast.makeText(
                    this@FahrenheitActivity,
                    "Please input one to convert X﹏X",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}