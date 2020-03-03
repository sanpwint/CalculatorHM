package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener{
            var num1: Int = text1.text.toString().toInt()
            var num2: Int = text2.text.toString().toInt()
            var result:Int = num1 + num2
            text3.text = result.toString()
        }
        btnMinus.setOnClickListener{
            var num1: Int = text1.text.toString().toInt()
            var num2: Int = text2.text.toString().toInt()
            var result:Int = num1 - num2
            text3.text = result.toString()
        }
        btnMul.setOnClickListener{
            var num1: Int = text1.text.toString().toInt()
            var num2: Int = text2.text.toString().toInt()
            var result:Int = num1 * num2
            text3.text = result.toString()
        }
        btnDiv.setOnClickListener{
            var num1: Double = text1.text.toString().toDouble()
            var num2: Double = text2.text.toString().toDouble()
            var result: Double =num1 / num2
            text3.text = result.toString()
        }
    }
}
