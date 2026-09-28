package com.jamil.miapp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nombre: EditText = find
        val miboton: Button = findViewById(R.id.BotonCentral)
        val mensaje: TextView = findViewById(R.id.BotonCentral)

        val button: Button = findViewById(R.id.BotonCentral)

        button.setOnClickListener {
           Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_LONG).show()
       }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}