package com.sebastian.lab8pm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sebastian.lab8pm.DataBases.DataBase
import com.sebastian.lab8pm.adapters.PlaceAdapters
import com.sebastian.lab8pm.entities.Place
import okhttp3.internal.notify


class OptionCharacterFragment : Fragment(R.layout.fragment_option_character), PlaceAdapters.ReccyclerViewPlaceClickHandler{

    private lateinit var recyclerView: RecyclerView
    private lateinit var placeList: MutableList<Place>

    private lateinit var botonAZ: Button
    private lateinit var botonZA:Button

    private lateinit var adapter: PlaceAdapters

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_placeList)
        botonAZ = view.findViewById(R.id.buttonAZ)
        botonZA = view.findViewById(R.id.buttonZA)

        setUpRecycler()
        setupListeners()
    }

    private fun setupListeners() {
        botonAZ.setOnClickListener {
            placeList.sortBy { place -> place.name }
            adapter.notifyDataSetChanged()
        }
        botonZA.setOnClickListener {
            placeList.sortByDescending { place -> place.name }
            adapter.notifyDataSetChanged()
        }
    }

    private fun setUpRecycler() {
        placeList = DataBase.getPlaces()
        adapter  = PlaceAdapters(placeList, this)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    override fun onPlaceClick(place: Place) {
        val action = OptionCharacterFragmentDirections.actionOptionCharacterFragmentToCharacterProfileFragment(
            place
        )
        requireView().findNavController().navigate(action)
    }
}