package com.example.quizmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class Home : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val cardViewProfileFintiSalsabila = view.findViewById<CardView>(R.id.cardViewProfileFintiSalsabila)
        cardViewProfileFintiSalsabila.setOnClickListener {
            val intent = Intent(activity, Halaman2::class.java)
            startActivity(intent)
        }

        val cardViewProfileAldi = view.findViewById<CardView>(R.id.cardViewProfileAldi)
        cardViewProfileAldi.setOnClickListener {
            val intent = Intent(activity, Halaman1::class.java)
            startActivity(intent)
        }

        val cardViewProfilePriti = view.findViewById<CardView>(R.id.cardViewProfilePriti)
        cardViewProfilePriti.setOnClickListener {
            val intent = Intent(activity, Halaman3::class.java)
            startActivity(intent)
        }


        return view
    }

}