package com.sebastian.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText

class PerfilFragment : Fragment(R.layout.fragment_perfil) {

    private lateinit var textFieldCorreo: EditText
    private val arg: PerfilFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textFieldCorreo = requireView().findViewById(R.id.textEditEmail2)
        textFieldCorreo.setHint(arg.email)



    }



}