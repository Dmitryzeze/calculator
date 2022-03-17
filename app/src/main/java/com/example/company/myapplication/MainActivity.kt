package com.example.company.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val integerChars = '0'..'9'
    private fun isInteger(input: String) = input.all { it in integerChars }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            if (isInteger(arg1.text.toString())&&isInteger(arg2.text.toString()))
            answer.text = (arg1.text.toString().toInt() + arg2.text.toString().toInt()).toString()
            else answer.text = "Input Error"
        }
        subtr.setOnClickListener {
            if (isInteger(arg1.text.toString())&&isInteger(arg2.text.toString()))
            answer.text = (arg1.text.toString().toInt() - arg2.text.toString().toInt()).toString()
            else answer.text = "Input Error"
        }
        mul.setOnClickListener {
            if (isInteger(arg1.text.toString())&&isInteger(arg2.text.toString())){
                if (arg2.text.toString().toInt()== 0)
                    answer.text = "Div by zero"
                else
            answer.text = (arg1.text.toString().toInt() * arg2.text.toString().toInt()).toString()}
            else answer.text = "Input Error"
        }
        divide.setOnClickListener {
            if (isInteger(arg1.text.toString())||isInteger(arg2.text.toString()))
            answer.text = (arg1.text.toString().toInt() / arg2.text.toString().toInt()).toString()
            else answer.text = "Input Error"
        }
    }
}
