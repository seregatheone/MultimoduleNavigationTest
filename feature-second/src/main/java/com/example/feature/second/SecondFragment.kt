package com.example.feature.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.feature.second.databinding.FragmentSecondBinding
import com.project.test.navigations.AppRoutes

class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding? = null
    private val binding get () = _binding!!

    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.first.setOnClickListener {
            navController.navigate(AppRoutes.FeatureFirst.Deeplink.FRAGMENT_FIRST)
        }
        super.onViewCreated(view, savedInstanceState)
    }

}