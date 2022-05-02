package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.botao).setOnClickListener{
            comparaNumero()
        }
    }

    private fun comparaNumero(){
        val num1 = findViewById<EditText>(R.id.numero1)
        val num2 = findViewById<EditText>(R.id.numero2)
        val resultado = findViewById<TextView>(R.id.teste)

        if(num1 > num2){

        }
        if(num1 < num2){

        }
        if(num1 == num2){

        }
        else{

        }
    }
}