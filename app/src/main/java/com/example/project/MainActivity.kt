package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_home)

        var cart:TextView = findViewById(R.id.ViewCart)
        cart.setOnClickListener{

            setContentView(R.layout.cart_shopping)

        }
    }
    fun onClick(v: View) {

        var dialog = CustomDialogFragment(""+v.resources.getResourceEntryName(v.id))
        dialog.show(supportFragmentManager, "Shop to your cart ")

    }

}