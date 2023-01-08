package com.example.project

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class ShoppingCart : AppCompatActivity() {

val text1: TextView = findViewById(R.id.textView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart_shopping)
        text1.text = "hello zaid the best"

    }
    fun fed(t : String){
        text1.text = t
    }
}