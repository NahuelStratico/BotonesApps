package com.example.imcapp.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.imcapp.R
import com.example.imcapp.firstapp.settings.SettingsActivity
import com.example.imcapp.firstapp.superheroapp.SuperHeroListActivity
import com.example.imcapp.firstapp.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // variables con ID
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)


        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener{ navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperhero.setOnClickListener { navigateSuperheroApp() }
        btnSettings.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }


    private fun navigateToTodoApp() {
        val intent = Intent( this, TodoActivity::class.java)
        startActivity(intent)
    }


    private fun navigateToSaludApp() {
        val intent = Intent( this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent( this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateSuperheroApp() {
        val intent = Intent( this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}