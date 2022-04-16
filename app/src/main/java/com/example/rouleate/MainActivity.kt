package com.example.rouleate

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.rouleate.databinding.ActivityMainBinding
import com.example.rouleate.fragments.OurListFragment
import com.example.rouleate.fragments.UserListFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager

        findViewById<BottomNavigationView>(R.id.nav_view).setOnItemSelectedListener {
            item->

            var fragmentToShow: Fragment? = null
            when(item.itemId) {

                R.id.navigation_user_list -> {
                    fragmentToShow = UserListFragment()
                    Toast.makeText(this, "User List", Toast.LENGTH_SHORT).show()
                }

                R.id.navigation_our_list -> {
                    fragmentToShow = OurListFragment()
                    Toast.makeText(this, "Our List", Toast.LENGTH_SHORT).show()
                }

            }

            if(fragmentToShow!=null) {
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragmentToShow).commit()
            }

            true
        }

        // Set default selection
        findViewById<BottomNavigationView>(R.id.nav_view).selectedItemId = R.id.navigation_user_list
    }
}