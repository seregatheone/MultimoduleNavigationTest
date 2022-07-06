package com.example.feature.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.feature.first.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding : FragmentFirstBinding? = null
    private val binding get () = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}