package com.geeks.homework_1_4_ai.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.geeks.homework_1_4_ai.Email
import com.geeks.homework_1_4_ai.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.btnSend.setOnClickListener {
           val login = binding.etLogin.text.toString()
           val password = binding.etPassword.text.toString()

            val email = Email(login, password)
            val action = MainFragmentDirections.actionMainFragmentToSecondFragment(email)
            findNavController().navigate(action )
        }
    }
}