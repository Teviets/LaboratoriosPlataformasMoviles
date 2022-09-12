package com.sebastian.lab8pm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class CharacterProfileFragment : Fragment(R.layout.fragment_character_profile) {
    private lateinit var nameProfileText: TextView
    private lateinit var specieCharText: TextView
    private lateinit var statusCharText: TextView
    private lateinit var genderCharText: TextView

    val args: CharacterProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameProfileText = view.findViewById(R.id.NameProfile)
        specieCharText = view.findViewById(R.id.SpecieInput)
        statusCharText = view.findViewById(R.id.StatusInput)
        genderCharText = view.findViewById(R.id.GenderInput)

        nameProfileText.text = args.place.name
        specieCharText.text = args.place.especie
        statusCharText.text = args.place.Status.toString()
        genderCharText.text = args.place.genero.toString()

    }

}