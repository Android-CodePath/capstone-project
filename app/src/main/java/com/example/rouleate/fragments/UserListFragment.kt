package com.example.rouleate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rouleate.AddChoiceAdapter
import com.example.rouleate.R

class UserListFragment : Fragment() {

    // This is where we tell the fragment which layout to use
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_list, container, false)
    }

    // Holds the list of choices, this will most likely change once we have the database set up
    private val listOfChoices = mutableListOf<String>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set onClicklisteners and setup logic

        // Find RecyclerView Layout
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_list_choices)

        // Create adapter class
        val adapter = AddChoiceAdapter(listOfChoices)

        // Attach adapter to the recyclerview to populate choices
        recyclerView.adapter = adapter

        // Set the layout manager
        recyclerView.layoutManager = LinearLayoutManager(context) // would context work?

        // Find add button
        val inputTextChoice = view.findViewById<EditText>(R.id.et_enter_choices)

        // Register when user clicks on the add button
        view.findViewById<Button>(R.id.add_button).setOnClickListener{
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