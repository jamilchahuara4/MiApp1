package com.jamil.miapp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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


        val nombre : EditText = findViewById(R.id.Nombre)
        val miboton : Button = findViewById(R.id.BotonCentral)
        val mensaje : TextView = findViewById(R.id.Mensaje)
        val eliminar: Button = findViewById(R.id.Limpiar)

       //Boton Saludo
        miboton.setOnClickListener {
            //recogemos el valor del campo EditText y lo pasamos a cadena
            val textoNombre = nombre.text.toString()
            if (textoNombre.isEmpty()) {
                Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Bienvenid@ $textoNombre", Toast.LENGTH_LONG).show()
                mensaje.text = "Hola, $textoNombre"
            }
        }
        // Boton limpiar
        eliminar.setOnClickListener {
            nombre.text.clear()
            mensaje.text=""
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}