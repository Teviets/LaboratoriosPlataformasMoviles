package com.sebastian.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    private lateinit var navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation = findViewById(R.id.NavigationBottom)
        navigation.setOnNavigationItemSelectedListener{item->
            when(item.itemId){
                R.id.menu_option_home -> setFragment(FirstFragment())
                R.id.menu_option_search -> setFragment(SecondFragment())
                R.id.menu_option_libreria -> setFragment(ThridFragment())
                else -> setFragment(FirstFragment())

            }
            true
        }

        //botonMomen = findViewById(R.id.bottom)

        //setListeners()
    }


    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainerView1,fragment)
        }
    }
}