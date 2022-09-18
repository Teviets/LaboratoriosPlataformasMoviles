package com.sebastian.lab8pm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import coil.load
import coil.request.CachePolicy
import coil.transform.CircleCropTransformation

class CharacterProfileFragment : Fragment(R.layout.fragment_character_profile) {
    private lateinit var nameProfileText: TextView
    private lateinit var specieCharText: TextView
    private lateinit var statusCharText: TextView
    private lateinit var genderCharText: TextView
    private lateinit var imgProfileChar: ImageView

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

        imgProfileChar.load(args.place.imagen){
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
            memoryCachePolicy(CachePolicy.ENABLED)
            diskCachePolicy(CachePolicy.ENABLED)
        }

    }

}