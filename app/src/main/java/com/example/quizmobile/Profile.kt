package com.example.quizmobile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class Profile : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnLogout = view.findViewById<Button>(R.id.btnLogout)
        btnLogout.setOnClickListener {
            // Handle Logout button click
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        val btnChangeName = view.findViewById<Button>(R.id.btnChangeName)
        btnChangeName.setOnClickListener {
            // Handle Change Name button click
            // For now, show a toast message as an example
            Toast.makeText(activity, "Change Name functionality will be implemented here.", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
