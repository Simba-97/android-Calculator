package com.example.calculator

//import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.addButton).setOnClickListener {
            val numberOne = findViewById<EditText>(R.id.etFirstNum)
            val numberTwo = findViewById<EditText>(R.id.etSecondNum)
            val resultView = findViewById<TextView>(R.id.tvResult)

            val firstNum = numberOne.text.toString().toInt()
            val secondNum = numberTwo.text.toString().toInt()

            val result = firstNum + secondNum
            Log.d("main", "$firstNum and $secondNum")
            resultView.text = result.toString()
        }


        findViewById<Button>(R.id.minusButton).setOnClickListener {

            val numberOne = findViewById<EditText>(R.id.etFirstNum)
            val numberTwo = findViewById<EditText>(R.id.etSecondNum)
            val resultView = findViewById<TextView>(R.id.tvResult)

            val firstNum = numberOne.text.toString().toInt()
            val secondNum = numberTwo.text.toString().toInt()

            val result = firstNum - secondNum
            resultView.text = result.toString()
        }
//
        findViewById<Button>(R.id.multiplyButton).setOnClickListener {
            val numberOne = findViewById<EditText>(R.id.etFirstNum)
            val numberTwo = findViewById<EditText>(R.id.etSecondNum)
            val resultView = findViewById<TextView>(R.id.tvResult)

            val firstNum = numberOne.text.toString().toInt()
            val secondNum = numberTwo.text.toString().toInt()

            val result: Int = firstNum * secondNum
            resultView.text = result.toString()
        }
//
        findViewById<Button>(R.id.divisionButton).setOnClickListener {
            val numberOne = findViewById<EditText>(R.id.etFirstNum)
            val numberTwo = findViewById<EditText>(R.id.etSecondNum)
            val resultView = findViewById<TextView>(R.id.tvResult)

            val firstNum = numberOne.text.toString().toInt()
            val secondNum = numberTwo.text.toString().toInt()

            val result : Double = firstNum.toDouble() / secondNum.toDouble()
            resultView.text = result.toString()
        }
    }

}