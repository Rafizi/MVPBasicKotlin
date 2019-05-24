package com.example.kalkulator.Presenter

import com.example.kalkulator.View.MainView

class presenterCalculator(var view: MainView.View) : MainView.Presenter {
    override fun actionHitung(input1: String, input2: String, operator: String) {

        if (input1.isNotEmpty() && input2.isNotEmpty()) {
            val conv1 = input1.toDouble()
            val conv2 = input2.toDouble()

            when (operator) {
                "+" -> view.onSucces((conv1 + conv2).toString())
                "-" -> view.onSucces((conv1 - conv2).toString())
                "X" -> view.onSucces((conv1 * conv2).toString())
                ":" -> view.onSucces((conv1 / conv2).toString())
                else -> view.onError("Data tidak ada")
            }
        } else {
            view.onError("Tidak Boleh Kosong")
        }

    }

}