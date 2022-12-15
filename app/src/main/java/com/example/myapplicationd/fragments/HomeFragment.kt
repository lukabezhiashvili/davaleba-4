package com.example.myapplicationd.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.example.myapplicationd.R

class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val amountEditText = view.findViewById<EditText>(R.id.homeEditText)
        val sendButton = view.findViewById<Button>(R.id.sendButton)
        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val amount = amountEditText.text.toString()
            if (amount.isEmpty()){
                return@setOnClickListener
            }
            val amount2 = amount.toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToMyNetworkFragment(amount2)

            navController.navigate(action)

        }

    }
}
