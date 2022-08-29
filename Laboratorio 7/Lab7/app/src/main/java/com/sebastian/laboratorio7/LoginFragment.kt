package com.sebastian.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.findFragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import android.view.Gravity



class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var correo: EditText
    private lateinit var sesionIniciada: Button
    private lateinit var txtCliqueable: TextView

    private var ver: Boolean = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        correo = view.findViewById(R.id.EmailTextEdit)
        sesionIniciada = view.findViewById(R.id.inicioSesion)
        txtCliqueable = view.findViewById(R.id.TextoCliqueableRegister)

        setListener()
    }

    private fun setListener() {
        sesionIniciada.setOnClickListener {
            if (correo.getText().toString() == "jcdurini@uvg.edu.gt"){
                val action = LoginFragmentDirections.actionLoginFragment2ToUpdateFragment(correo.getText().toString())
                requireView().findNavController().navigate(action)
            }else{
                Toast.makeText(MainActivity(), "Correo Incorrecto", Toast.LENGTH_LONG).show()
            }
        }
        txtCliqueable.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragment2ToSingUpFragment()
            requireView().findNavController().navigate(action)
        }
    }

}