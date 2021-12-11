package com.easyapp.customcs.ui.acercaDe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcercaDeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment acerca de..."
    }
    val text: LiveData<String> = _text

}