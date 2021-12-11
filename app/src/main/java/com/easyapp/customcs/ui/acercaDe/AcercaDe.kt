package com.easyapp.customcs.ui.acercaDe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.easyapp.customcs.databinding.FragmentAcercaDeBinding

class AcercaDe : Fragment() {

    private lateinit var viewModel: AcercaDeViewModel
    private var _binding: FragmentAcercaDeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this).get(AcercaDeViewModel::class.java)

        _binding = FragmentAcercaDeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tvNombre
        viewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}