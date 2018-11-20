package com.codechacha.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class LondonScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_london_screen, container, false)

        view.findViewById<Button>(R.id.to_paris_from_london).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_london_screen_to_paris_screen)
        }
        view.findViewById<Button>(R.id.to_italy_from_london).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_london_screen_to_italy_screen)
        }

        return view
    }
}
