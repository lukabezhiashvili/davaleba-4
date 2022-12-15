package com.example.myapplicationd.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplicationd.R

class MyNetworkFragment : Fragment(R.layout.fragment_my_network){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.amountTextView).text =
            MyNetworkFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}
