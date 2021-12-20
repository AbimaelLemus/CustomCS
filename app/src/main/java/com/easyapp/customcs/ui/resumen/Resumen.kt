package com.easyapp.customcs.ui.resumen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.easyapp.customcs.R
import com.easyapp.customcs.adapters.AdapterResumen
import com.easyapp.customcs.databinding.FragmentResumenBinding
import com.easyapp.customcs.model.ModelEvidencias
import com.easyapp.customcs.util.DialogRegistro

class Resumen : Fragment() {

    private var _binding: FragmentResumenBinding? = null
    private val binding get() = _binding!!

    private val evidencias = AdapterResumen(
        listOf(
            ModelEvidencias(
                R.drawable.primera,
                "primera"
            ),
            ModelEvidencias(
                R.drawable.segunda,
                "segunda"
            ),
            ModelEvidencias(
                R.drawable.tercera,
                "tercera"
            ),
            ModelEvidencias(
                R.drawable.cuarta,
                "cuarta"
            )
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResumenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.viewPager.adapter = evidencias
        /*binding.viewPager.setCurrentItem(2)
        binding.viewPager.isUserInputEnabled = false*/
        setCurrentIndicador(0)

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicador(position + 1)
            }
        }
        )

        /*textViewTitulo.text = Text.getTypefaceSpannedString(
                "Toma una foto",
                requireContext(),
                R.font.avenirnext_bold
            )
            textViewTitulo.append(m1)
            textViewTitulo.append(
                Text.getTypefaceSpannedString(
                    m2,
                    requireContext(),
                    R.font.avenirnext_bold
                )
            )
            textViewTitulo.append(m3)*/

        binding.apply {
            ivCompartir.setOnClickListener {
                DialogRegistro().show(requireActivity().supportFragmentManager/* childFragmentManager supportFragmentManager*/, DialogRegistro::class.java.simpleName)
            }
        }

        return root
    }

    @SuppressLint("SetTextI18n")
    private fun setCurrentIndicador(position: Int) {
        binding.tvIndicador.text = "$position/4"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}