package com.example.calculatorkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private val btn_0= findViewById<TextView>(R.id.btn_0)
    private val btn_1= findViewById<TextView>(R.id.btn_1)
    private val btn_2= findViewById<TextView>(R.id.btn_2)
    private val btn_3= findViewById<TextView>(R.id.btn_3)
    private val btn_4= findViewById<TextView>(R.id.btn_4)
    private val btn_5= findViewById<TextView>(R.id.btn_5)
    private val btn_6= findViewById<TextView>(R.id.btn_6)
    private val btn_7= findViewById<TextView>(R.id.btn_7)
    private val btn_8= findViewById<TextView>(R.id.btn_8)
    private val btn_9= findViewById<TextView>(R.id.btn_9)
    private val minus_btn= findViewById<TextView>(R.id.minus_btn)
    private val plus_btn= findViewById<TextView>(R.id.plus_btn)
    private val div_btn= findViewById<TextView>(R.id.div_btn)
    private val btn_skobka1= findViewById<TextView>(R.id.btn_skobka1)
    private val btn_skobka2= findViewById<TextView>(R.id.btn_skobka2)
    private val clear_btn= findViewById<TextView>(R.id.clear_btn)
    private val math_operation = findViewById<TextView>(R.id.math_operation)
    private val result_text = findViewById<TextView>(R.id.result_text)
    private val back_btn = findViewById<TextView>(R.id.back_btn)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener{setTextFileds("0")}

        btn_1.setOnClickListener{setTextFileds("1")}

        btn_2.setOnClickListener{setTextFileds("2")}

        btn_3.setOnClickListener{setTextFileds("3")}

        btn_4.setOnClickListener{setTextFileds("4")}

        btn_5.setOnClickListener{setTextFileds("5")}

        btn_6.setOnClickListener{setTextFileds("6")}

        btn_7.setOnClickListener{setTextFileds("7")}

        btn_8.setOnClickListener{setTextFileds("8")}

        btn_9.setOnClickListener{setTextFileds("9")}

        minus_btn.setOnClickListener{setTextFileds("-")}

        plus_btn.setOnClickListener{setTextFileds("+")}

        div_btn.setOnClickListener{setTextFileds("/")}

        btn_skobka1.setOnClickListener{setTextFileds("(")}

        btn_skobka2.setOnClickListener{setTextFileds(")")}


        clear_btn.setOnClickListener{
            math_operation.text = ""
            result_text.text = ""
        }
        back_btn.setOnClickListener{
            val str = math_operation.text.toString()
            if (str.isNotEmpty())
                math_operation.text = str.substring(0, str.length - 1)
            result_text.text = ""
        }
    }
    @SuppressLint("MissingInflatedId")
    fun setTextFileds(str: String)
    {
        math_operation.append(str)
    }
}