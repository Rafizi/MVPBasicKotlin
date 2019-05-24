package com.example.kalkulator.View

interface MainView {
    interface View {
        fun onSucces(result: String)
        fun onError(error: String)
    }

    interface Presenter {
        fun actionHitung(input1: String, input2: String, operator: String)
    }
}