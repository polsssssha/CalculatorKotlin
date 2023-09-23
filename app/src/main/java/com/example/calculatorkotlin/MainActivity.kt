package com.example.calculatorkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_0= findViewById<TextView>(R.id.btn_0)
        val btn_1= findViewById<TextView>(R.id.btn_1)
        val btn_2= findViewById<TextView>(R.id.btn_2)
        val btn_3= findViewById<TextView>(R.id.btn_3)
        val btn_4= findViewById<TextView>(R.id.btn_4)
        val btn_5= findViewById<TextView>(R.id.btn_5)
        val btn_6= findViewById<TextView>(R.id.btn_6)
        val btn_7= findViewById<TextView>(R.id.btn_7)
        val btn_8= findViewById<TextView>(R.id.btn_8)
        val btn_9= findViewById<TextView>(R.id.btn_9)
        val minus_btn= findViewById<TextView>(R.id.minus_btn)
        val plus_btn= findViewById<TextView>(R.id.plus_btn)
        val div_btn= findViewById<TextView>(R.id.div_btn)
        val mult_btn= findViewById<TextView>(R.id.mult_btn)
        val btn_skobka1= findViewById<TextView>(R.id.btn_skobka1)
        val btn_skobka2= findViewById<TextView>(R.id.btn_skobka2)
        val clear_btn= findViewById<TextView>(R.id.clear_btn)
        val math_operation = findViewById<TextView>(R.id.math_operation)
        val result_text = findViewById<TextView>(R.id.result_text)
        val back_btn = findViewById<TextView>(R.id.back_btn)
        val equal_btn = findViewById<TextView>(R.id.equal_btn)

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

        mult_btn.setOnClickListener{setTextFileds("*")}

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
        equal_btn.setOnClickListener{
            try {
                val ex = ExpressionBuilder(math_operation.text.toString()).build()
                val result = ex.evaluate()
                val longRes = result.toLong()
                if(result == longRes.toDouble())
                    result_text.text = longRes.toString()
                else
                    result_text.text =  result.toString()
            }catch (e:Exception){
                Log.d("Ошибка","сообщение:${e.message}")

            }
        }
    }
    fun setTextFileds(str: String)
    {
        val result_text = findViewById<TextView>(R.id.result_text)
        val math_operation = findViewById<TextView>(R.id.math_operation)
        if(result_text.text != "")
        {
            math_operation.text = result_text.text
            result_text.text = ""
        }

        math_operation.append(str)
    }
}