package com.sebastian.laboratorio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit


class MainActivity : AppCompatActivity() {
    private lateinit var fragmentoLgn: Fragment
    private lateinit var fragmentoSup: Fragment
    private lateinit var fragmentoUpdt: Fragment
    private lateinit var fragmentoPrfl: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentoLgn = LoginFragment()
        fragmentoSup = SingUpFragment()
        fragmentoUpdt = updateFragment()
        fragmentoPrfl = PerfilFragment()
        setFragment(LoginFragment());
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.commit{
            setReorderingAllowed(true)
            replace(R.id.ContainerFragment, fragment)
        }
    }
}