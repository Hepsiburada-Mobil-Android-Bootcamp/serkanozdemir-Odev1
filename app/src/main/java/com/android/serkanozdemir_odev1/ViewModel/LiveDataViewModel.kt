package com.android.serkanozdemir_odev1.ViewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel:ViewModel(){

    val text = MutableLiveData<String>()
}