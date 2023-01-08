package com.example.project

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.NumberPicker
import android.widget.TextView
import androidx.fragment.app.DialogFragment


class CustomDialogFragment(var name : String) : DialogFragment(R.layout.fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val uri: String = "drawable/" + name

        val imageResource = resources.getIdentifier(uri, null, "com.example.project")
        view.findViewById<ImageView>(R.id.productView).setImageResource(imageResource)
        val numberPicker: NumberPicker = view.findViewById(R.id.numberPicker)
        val buttonCancel: Button = view.findViewById(R.id.cancel)
        val buttonAdd: Button = view.findViewById(R.id.add)
        numberPicker.minValue = 1
        numberPicker.maxValue = 20


        buttonCancel.setOnClickListener {
            dismiss()
        }

        buttonAdd.setOnClickListener {

        }

    }
    }



