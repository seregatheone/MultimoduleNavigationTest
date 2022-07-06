package com.example.feature.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.feature.second.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding : FragmentSecondBinding? = null
    private val binding get () = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}