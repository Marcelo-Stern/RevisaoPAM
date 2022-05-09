package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.numero1)
        val num2 = findViewById<EditText>(R.id.numero2)

        findViewById<Button>(R.id.botao).setOnClickListener {
            val primeiro = num1.text.toString()
            val segundo = num2.text.toString()

            if (primeiro == "" && segundo == "") {
                Toast.makeText(
                    applicationContext, "Entrada inválida",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                primeiro.toInt();
                segundo.toInt();

                if (primeiro > segundo) {
                    Toast.makeText(
                        applicationContext, "O primeiro número é maior",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                if (primeiro < segundo) {
                    Toast.makeText(
                        applicationContext, "O segundo número é maior",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                if (primeiro == segundo) {
                    Toast.makeText(
                        applicationContext, "Os dois números são iguais",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        applicationContext, "Entrada inválida",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
