package com.example.feature.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.feature.first.databinding.FragmentFirstBinding
import com.project.test.navigations.AppRoutes

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get () = _binding!!

    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener {
            navController.navigate(AppRoutes.FeatureSecond.Deeplink.FRAGMENT_SECOND)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}