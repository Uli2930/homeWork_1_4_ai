package com.geeks.homework_1_4_ai.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.geeks.homework_1_4_ai.Email
import com.geeks.homework_1_4_ai.Keys
import com.geeks.homework_1_4_ai.R
import com.geeks.homework_1_4_ai.databinding.FragmentSecondBinding
import com.geeks.homework_1_4_ai.makeToast

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}