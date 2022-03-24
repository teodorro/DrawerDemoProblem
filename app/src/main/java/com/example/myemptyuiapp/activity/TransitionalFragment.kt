package com.example.myemptyuiapp.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myemptyuiapp.R
import com.example.myemptyuiapp.databinding.FragmentTransitionalBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransitionalFragment : Fragment() {
    private var _binding: FragmentTransitionalBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToWall.setOnClickListener {
            findNavController().navigate(R.id.action_transitionalFragment_to_WallFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTransitionalBinding.inflate(inflater, container, false)
        return binding.root
    }

}