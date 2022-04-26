package com.example.rouleate

import android.widget.EditText

// This is to communicate between fragments so they can pass information
interface Communicator {
    fun passDataCom(editTextInput: String)
}