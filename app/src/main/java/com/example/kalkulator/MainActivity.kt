package com.example.kalkulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.example.kalkulator.Presenter.presenterCalculator
import com.example.kalkulator.View.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView.View {
    var mainPresenter : presenterCalculator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = presenterCalculator(this@MainActivity)

        buttonTambah.setOnClickListener {
            mainPresenter?.actionHitung(editText.text.toString(),editText2.text.toString(),"+")
        }
        buttonKurang.setOnClickListener {
            mainPresenter?.actionHitung(editText.text.toString(),editText2.text.toString(),"-")
        }
        buttonKali.setOnClickListener {
            mainPresenter?.actionHitung(editText.text.toString(),editText2.text.toString(),"X")
        }
        buttonBagi.setOnClickListener {
            mainPresenter?.actionHitung(editText.text.toString(),editText2.text.toString(),":")
        }
    }

    override fun onSucces(result: String) {
        textView.text = result
    }

    override fun onError(error: String) {
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Warning !!")
        alert.setMessage(error)

    }


}
