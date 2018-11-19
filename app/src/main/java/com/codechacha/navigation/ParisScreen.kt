package com.codechacha.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class ParisScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_paris_screen, container, false)

        view.findViewById<Button>(R.id.to_italy_from_paris).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_go_to_italy_from_paris)
        }
        view.findViewById<Button>(R.id.to_london_from_paris).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_go_to_london_from_paris)
        }

        return view
    }
}
