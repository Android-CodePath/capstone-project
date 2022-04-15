package com.example.rouleate.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rouleate.R
import com.example.rouleate.databinding.FragmentHomeBinding

class HomeFragment : Fragment()  {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    /*
    * 4/14/2022:
    * This function will load the add_choices_activity layout
    * Need a button widget in the fragment_home layout that activates the transition
    * Maybe this is not the correct place to have this transition because
    * setContentView is needed, and this function is not part of the fragment class
    * */
    fun loadAddChoicesLayout(v: View){
        // TODO: define function, add a button widget
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}