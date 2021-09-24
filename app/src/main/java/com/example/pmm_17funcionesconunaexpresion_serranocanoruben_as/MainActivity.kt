package com.example.pmm_17funcionesconunaexpresion_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult10)
        val etNumber = findViewById<EditText>(R.id.etNumber10)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate10)

        btnCalculate.setOnClickListener {
            val side = etNumber.text.toString().toInt()
            val string= "The perimeter is: "
            tvResult.text = string.plus(getSquarePerimeter(side).toString())
        }
    }

    fun getSquarePerimeter(side:Int) = side*4
}