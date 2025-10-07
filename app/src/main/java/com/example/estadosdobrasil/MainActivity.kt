package com.example.estadosdobrasil

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity(), EstadoAdapter.EstadoOnClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EstadoAdapter
    private var estados = EstadoData.getEstados() // Lista completa de estados

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura a Toolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        // Configura o RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this) // padrão linear
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        // Configura o Adapter e o click listener
        adapter = EstadoAdapter(this, estados, this)
        recyclerView.adapter = adapter
    }

    // Infla o menu Linear/Grid
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Trata clique do menu Linear/Grid
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_linear_layout -> {
                recyclerView.layoutManager = LinearLayoutManager(this)
                true
            }
            R.id.action_grid_layout -> {
                recyclerView.layoutManager = GridLayoutManager(this, 2)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Clique em um estado da lista
    override fun onClickEstado(holder: EstadoAdapter.EstadoViewHolder?, idx: Int) {
        val estadoSelecionado = estados[idx]
        val intent = Intent(this, DetalhesEstadoActivity::class.java).apply {
            putExtra("estado_nome", estadoSelecionado.nome)
            putExtra("estado_bandeira", estadoSelecionado.bandeiraResId)
            putExtra("estado_capital", estadoSelecionado.capital)
            putExtra("estado_populacao", estadoSelecionado.populacao)
            putExtra("estado_regiao", estadoSelecionado.regiao)
        }
        startActivity(intent)
    }
}