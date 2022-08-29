package com.sebastian.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class SingUpFragment : Fragment(R.layout.fragment_sing_up) {
    private lateinit var cor: EditText
    private lateinit var botonReg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cor = requireView().findViewById(R.id.textEditEmailNu)
        botonReg = requireView().findViewById(R.id.CreacionAccount)

        setListener()

    }

    private fun setListener() {
        botonReg.setOnClickListener {
            val action = SingUpFragmentDirections.actionSingUpFragmentToPerfilFragment(cor.getText().toString())
            requireView().findNavController().navigate(action)
        }
    }
}