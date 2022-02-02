package com.lgrando.projeto1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adicionar um listenner ao botao
        // 1 - begao o botao
        // 2 - adcionar o listener

        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etName = findViewById<EditText>(R.id.etName)

        btEnviar.setOnClickListener {
            // Dentro das chaves, o codigo que esquevemos sera executado apenas quando o botao
            // for clicado


            val name = etName.text.toString()

            if (name.isNotBlank()) {
                tvResultado.text = name
            } else {
                etName.error = "Digite um nome válido"
            }


        }


        //Funcionamento para abrir noba Tela
        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela.setOnClickListener {
            //Codigo sera executado quando o botao for clicado
            //para abrir uma nova tela, registramos a intencao de fazer isto
            // intencao no android = Intent
            val intentAbrirNovaTela = Intent(this, ResultadoActivity::class.java)

            //Iremos adicionar a informacao do nome digitado na Intent atraves do put Extra
            intentAbrirNovaTela.putExtra("NOME_DIGITADO", etName.text.toString())

            //registramos a Intent
            startActivity(intentAbrirNovaTela)


        }





    }
}


