package com.easyapp.customcs.ui.similares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.easyapp.customcs.R
import com.easyapp.customcs.databinding.FragmentHomeBinding
import com.easyapp.customcs.databinding.FragmentSimilaresBinding

class Similares : Fragment() {
    private var _binding: FragmentSimilaresBinding? = null
    private val binding get() =  _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSimilaresBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}