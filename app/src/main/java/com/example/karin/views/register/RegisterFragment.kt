package com.example.karin.views.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.karin.R
import com.example.karin.databinding.FragmentLoginBinding
import com.example.karin.databinding.FragmentRegisterBinding
import com.example.karin.isEmpty

class RegisterFragment : Fragment() {

    lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        setListener()
        return binding.root
    }

    private fun setListener() {
        with(binding){
            btnRegister.setOnClickListener {
                etName.isEmpty()
                etEmail.isEmpty()
                etPassword.isEmpty()
                if (!etName.isEmpty() && !etEmail.isEmpty() && !etPassword.isEmpty())
                    Toast.makeText(context,"Login Successful",Toast.LENGTH_SHORT).show()
            }
            }
        }
    }


