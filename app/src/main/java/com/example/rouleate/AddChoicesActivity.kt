package com.example.rouleate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddChoicesActivity : AppCompatActivity() {

    // Holds the list of choices, this will most likely change once we have the database set up
    private val listOfChoices = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_user_list)

            // Find RecyclerView Layout
            val recyclerView = findViewById<RecyclerView>(R.id.rv_list_choices)

            // Create adapter class
            val adapter = AddChoiceAdapter(listOfChoices)

            // Attach adapter to the recyclerview to populate choices
            recyclerView.adapter = adapter

            // Set the layout manager
            recyclerView.layoutManager = LinearLayoutManager(this)

            // Find add button
            val inputTextChoice = findViewById<EditText>(R.id.et_enter_choices)

        // Register when user clicks on the add button
            findViewById<Button>(R.id.add_button).setOnClickListener{
                // 1. Grab Choice
                val userInputChoice = inputTextChoice.text.toString()

                // 2. Add string to list of choices
                listOfChoices.add(userInputChoice)

                //Notify adapter that the list has been updated 
                adapter.notifyItemInserted(listOfChoices.size -1)

                // 3. Reset text field
                inputTextChoice.setText("")

        }
    }
}