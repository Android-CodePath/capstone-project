package com.example.rouleate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AddChoicesActivity : AppCompatActivity() {

    // Holds the list of choices, this will most likely change once we have the database set up
    val listOfChoices = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_choices)

        // Register when user clicks on the add button
        findViewById<Button>(R.id.add_button).setOnClickListener{

        }
    }
}