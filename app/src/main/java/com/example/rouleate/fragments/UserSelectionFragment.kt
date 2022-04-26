package com.example.rouleate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.rouleate.R


class UserSelectionFragment : Fragment() {

    var displaySelection : String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_selection, container, false)

        displaySelection = arguments?.getString("message")

        // WHAT IS THE displayMessage?
        view.findViewById<TextView>(R.id.displaySelection).text = displaySelection

        return view
    }

}