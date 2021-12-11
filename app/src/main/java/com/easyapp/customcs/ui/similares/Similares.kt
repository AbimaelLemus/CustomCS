package com.easyapp.customcs.ui.similares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.easyapp.customcs.R
import com.easyapp.customcs.adapters.AdapterSimilares
import com.easyapp.customcs.databinding.FragmentHomeBinding
import com.easyapp.customcs.databinding.FragmentSimilaresBinding
import com.easyapp.customcs.model.ModelSimilares

class Similares : Fragment() {
    private var _binding: FragmentSimilaresBinding? = null
    private val binding get() = _binding!!

    private val similares = AdapterSimilares(
        listOf(
            ModelSimilares(
                R.drawable.primera,
                "p Stream laptop 14-ax022r",
                "$ 3,899",
                "$ 3,699 MXN",
                "Desde $264 al mes",
                "Desde $264 al mes",
            ),
            ModelSimilares(
                R.drawable.cuarta,
                "laptop gamer dell inspiron",
                "$ 21,099",
                "$ 19,499 MXN",
                "Desde $1,390 al mes",
                "Desde $1,390 al mes",
            ),
            ModelSimilares(
                R.drawable.primera,
                "Toshiba satellite",
                "$ 7,999",
                "$ 4,999 MXN",
                "Desde $365 al mes",
                "Desde $365 al mes",
            ),
            ModelSimilares(
                R.drawable.segunda,
                "Laptop lenovo thinkpad",
                "$ 18,899",
                "$ 12,899 MXN",
                "Desde $920 al mes",
                "Desde $860 al mes",
            ),
            ModelSimilares(
                R.drawable.tercera,
                "Hp notebook celeron hom4 64",
                "$ 6,099 MXN",
                "",
                "Desde $435 al mes",
                "Desde $407 al mes",
            ),
            ModelSimilares(
                R.drawable.cuarta,
                "Hp chromebook 4 ram 64",
                "$ 7,399",
                "$ 6,999 MXN",
                "Desde $499 al mes",
                "Desde $467 al mes",
            ),
            ModelSimilares(
                R.drawable.segunda,
                "Macbook air 14",
                "$ 28,799",
                "$ 25,919 MXN -10%",
                "Desde $1,848 al mes",
                "Desde $1,728 al mes",
            ),
            ModelSimilares(
                R.drawable.primera,
                "Laptop dell",
                "$ 15,999",
                "$ 9,333 MXN -42%",
                "Desde $665 al mes",
                "Desde $622 al mes",
            ),
            ModelSimilares(
                R.drawable.cuarta,
                "Laptop hp chromebook chrome os",
                "$ 3,899",
                "$ 3,699 MXN",
                "Desde $264 al mes",
                "Desde $247 al mes",
            ),
            ModelSimilares(
                R.drawable.tercera,
                "Laptop hp core i5",
                "$ 15,499",
                "$ 13,999 MXN -10%",
                "Desde $998 al mes",
                "Desde $933 al mes",
            )
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSimilaresBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.apply {
            rvSimilares.layoutManager = LinearLayoutManager(context)
            rvSimilares.adapter = similares
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}