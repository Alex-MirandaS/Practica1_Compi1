package com.example.practica1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.practica1_kotlin.JFLEX_Y_CUP.AnalizadorLexico
import com.example.practica1_kotlin.JFLEX_Y_CUP.AnalizadorSintactico
import com.example.practica1_kotlin.Principal.Controlador
import java.io.StringReader

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensaje(view: View) {

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun analizar(view: View){
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val texto:String = editText.text.toString()
        val controlador:Controlador = Controlador()
        controlador.analizar(texto)

        val graficas = controlador.graficas
        val errores = controlador.errores
    }

}