package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        handleUserName()

        binding.btnNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btn_new_phrase -> TODO()
        }
    }

    private fun handleUserName(){
        val name = SecurityPreferences(this).getString("USER_NAME")
        binding.textUserName.text = "Olá, $name!"
    }
}