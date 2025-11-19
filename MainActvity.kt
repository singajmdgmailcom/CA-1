package com.cscorner.designForest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import android.widget.Toast
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val login_button = findViewById<Button>(R.id.login_button)
        login_button.setOnClickListener {
            Toast.makeText(this, "Login is Successful", Toast.LENGTH_SHORT).show()
        }
    }
}
