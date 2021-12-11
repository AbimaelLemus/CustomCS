package com.easyapp.customcs.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.easyapp.customcs.ui.home.Home
import com.easyapp.customcs.ui.resumen.Resumen
import com.easyapp.customcs.ui.similares.Similares

class AdapterHome (fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Resumen()
            1 -> return Similares()
        }
        return Resumen()
    }
}