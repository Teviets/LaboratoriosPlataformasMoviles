package com.sebastian.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class updateFragment : Fragment(R.layout.fragment_update) {
    private lateinit var actualizarText : TextView
    private lateinit var botonUpdate: Button
    private val arg: updateFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actualizarText = view.findViewById(R.id.txtPrincipalBD)
        botonUpdate = view.findViewById(R.id.butonUpdate)
        val email = arg.email
        actualizarText.setText("Hola $email, necesitamos que actualices tu perfil!")

        setListener()


    }

    private fun setListener() {
        botonUpdate.setOnClickListener {
            val action = updateFragmentDirections.actionUpdateFragmentToPerfilFragment(arg.email)
        }
    }

}