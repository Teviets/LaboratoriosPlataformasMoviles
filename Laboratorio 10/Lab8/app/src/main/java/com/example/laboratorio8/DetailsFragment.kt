package com.example.laboratorio8

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.request.CachePolicy
import coil.transform.CircleCropTransformation

class DetailsFragment: Fragment(R.layout.details_fragment) {
    private lateinit var nameCharacterProfile: TextView
    private lateinit var specieCharacter: TextView
    private lateinit var statusCharacter: TextView
    private lateinit var genderCharacter: TextView
    private lateinit var imageCharacter: ImageView

    private val args: DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameCharacterProfile = view.findViewById(R.id.text_View_NameProfile)
        specieCharacter = view.findViewById(R.id.text_View_Specietype)
        statusCharacter = view.findViewById(R.id.text_View_StatusType)
        genderCharacter = view.findViewById(R.id.text_View_GenderType)
        imageCharacter = view.findViewById(R.id.Image_Character_Profile)

        nameCharacterProfile.text = args.place.name
        specieCharacter.text = args.place.especie
        statusCharacter.text = args.place.status.toString()
        genderCharacter.text = args.place.genero.toString()

        imageCharacter.load(args.place.imagen){
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
            memoryCachePolicy(CachePolicy.ENABLED)
            diskCachePolicy(CachePolicy.ENABLED)
        }
    }
}