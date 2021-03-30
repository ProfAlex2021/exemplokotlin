package com.ds2fatec.exemplokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btSecondScreen = findViewById<Button>(R.id.bt_segunda_tela)
        btSecondScreen.setOnClickListener {
            irParaSegundaTela()
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            irParaOutraTela()
        }
    }

    private fun irParaOutraTela() {
        
    }

    private fun irParaSegundaTela() {
        var transicao = Intent(this,SegundoActivity::class.java)
        this.startActivity(transicao)
    }
}