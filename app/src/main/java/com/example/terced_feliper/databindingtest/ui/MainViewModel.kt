package com.example.terced_feliper.databindingtest.ui

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.terced_feliper.databindingtest.model.User

class MainViewModel : ViewModel() {
    var name = ObservableField("fieldd")

    fun changeName(user: User) {
        this.name.set(user.name)
    }
}
