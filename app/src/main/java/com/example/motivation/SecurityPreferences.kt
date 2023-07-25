package com.example.motivation

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        // Se por um acaso, o valor de retorno direto for nulo, a outra expressão será utilizada
        // Operador Elvis
        return security.getString(key, "") ?: ""
    }
}