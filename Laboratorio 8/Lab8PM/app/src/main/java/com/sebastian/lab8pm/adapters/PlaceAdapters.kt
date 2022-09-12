package com.sebastian.lab8pm.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.request.CachePolicy
import coil.transform.CircleCropTransformation
import com.sebastian.lab8pm.OptionCharacterFragment
import com.sebastian.lab8pm.OptionCharacterFragmentDirections
import com.sebastian.lab8pm.R
import com.sebastian.lab8pm.entities.Place
import org.w3c.dom.Text

class PlaceAdapters (
    private val dataSet: MutableList<Place>,
    private val listener:ReccyclerViewPlaceClickHandler
):RecyclerView.Adapter<PlaceAdapters.ViewHolder>(){

    class ViewHolder(
                private val view: View,
                private val listener: ReccyclerViewPlaceClickHandler
            ): RecyclerView.ViewHolder(view){
        private val imageType:ImageView = view.findViewById(R.id.item_listPlace) // imagen de item Recyclerview
        private val textName : TextView = view.findViewById(R.id.text_itemPlace) // Nombre de item RecyclerView
        private val infoText : TextView= view.findViewById(R.id.secondaryText_itemPlace) // info extra RecyclerView
        private val layoutPlace: ConstraintLayout = view.findViewById(R.id.layout_itemPlace)

        fun setData(place:Place){
            textName.text = place.name
            infoText.text = place.especie + " - " + place.Status
            imageType.load(place.imagen){
                crossfade(true)
                crossfade(2000)
                transformations(CircleCropTransformation())
                memoryCachePolicy(CachePolicy.DISABLED)
                diskCachePolicy(CachePolicy.DISABLED)
            }
            layoutPlace.setOnClickListener{
                listener.onPlaceClick(place)
            }
        }


    }

    interface ReccyclerViewPlaceClickHandler{
        fun onPlaceClick(place: Place)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_place, parent, false)
        return ViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(
            dataSet[position]
        )
    }

    override fun getItemCount() = dataSet.size
}