package com.example.terced_feliper.databindingtest.ui

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var name = ObservableField("fieldd")
}
