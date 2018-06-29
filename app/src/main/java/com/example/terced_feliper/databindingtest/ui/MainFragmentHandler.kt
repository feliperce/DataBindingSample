package com.example.terced_feliper.databindingtest.ui

import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.main_fragment.view.*

class MainFragmentHandler {
    fun nameButtonClick(view: View) {
        view.nameEditText.setText("s")
        Log.d("ddd", "popopop")
    }
}