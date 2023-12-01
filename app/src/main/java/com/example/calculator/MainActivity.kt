package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtUsername = findViewById<EditText>(R.id.edtUsername)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val sbtButton = findViewById<Button>(R.id.sbtButton)

        // Store the variables
        var username = ""
        var email = ""
        var password = ""

        sbtButton.setOnClickListener() {
            username = edtUsername.text.toString()
            email = edtEmail.text.toString()
            password = edtPassword.text.toString()

            if (username == "") {
                Toast.makeText(this@MainActivity, "Please enter a username", Toast.LENGTH_SHORT)
                    .show()
            }

            if (email == "") {
                Toast.makeText(this@MainActivity, "Please enter an email", Toast.LENGTH_SHORT)
                    .show()
            }

            if (password == "") {
                Toast.makeText(this@MainActivity, "Please enter a password", Toast.LENGTH_SHORT)
                    .show()
            }

            if (username != "" && email != "" && password != "") {
                val intent = Intent(this, ChooseActivity::class.java)
                intent.putExtra("USERNAME", username)
                intent.putExtra("EMAIL", email)
                intent.putExtra("PASSWORD", password)
                startActivity(intent)
            }
        }
    }
}
