package com.example.estadosdobrasil
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class DetalhesEstadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_estado)

        // Referências das views
        val imgBandeira = findViewById<ImageView>(R.id.imgBandeira)
        val txtNome = findViewById<TextView>(R.id.txtNomeEstado)
        val txtCapital = findViewById<TextView>(R.id.txtCapital)
        val txtPopulacao = findViewById<TextView>(R.id.txtPopulacao)
        val txtRegiao = findViewById<TextView>(R.id.txtRegiao)


        // Pega os dados do Intent
        val nome = intent.getStringExtra("estado_nome") ?: ""
        val bandeiraResId = intent.getIntExtra("estado_bandeira", 0)
        val capital = intent.getStringExtra("estado_capital") ?: ""
        val populacao = intent.getStringExtra("estado_populacao") ?: ""
        val regiao = intent.getStringExtra("estado_regiao") ?: ""

        // Configura a Toolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        // Preenche os dados
        if (bandeiraResId != 0) imgBandeira.setImageResource(bandeiraResId)
        txtNome.text = nome
        txtCapital.text = "Capital: $capital"
        txtPopulacao.text = "População: $populacao"
        txtRegiao.text = "Região: $regiao"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish() // volta para a tela anterior
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}