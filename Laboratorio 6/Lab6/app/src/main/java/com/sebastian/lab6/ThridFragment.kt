package com.sebastian.lab6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class ThridFragment : Fragment(R.layout.fragment_thrid) {
    private lateinit var addButton: ImageButton
    private lateinit var textCountView: TextView
    private var count: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addButton = view.findViewById(R.id.addButton)
        textCountView = view.findViewById(R.id.addTextView)
        setListener()
    }

    private fun setListener(){
        addButton.setOnClickListener{
            count++
            textCountView.text = count.toString()
        }
    }
}