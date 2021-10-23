package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimples.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener { calculateNumbers() }
    }

    class calculateNumbers {
        fun options_sum(n1: Float, n2: Float): Float {
            var soma = n1 + n2
            return(soma)
        }

        fun options_subtract(n1: Float, n2: Float): Float{
            var subtrair = n1 - n2
            return(subtrair)
        }

        fun options_multiply(n1: Float, n2: Float): Float{
            var multiply = n1 * n2
            return(multiply)
        }

        fun options_divide(n1: Float, n2: Float): Float{
            var divide = n1 / n2
            return(divide)
        }
    }


    /*fun calculateNumbers() {
        val stringInTextField = binding.insertNumber.text.toString()
        val stringInTextField2 = binding.insertNumber2.text.toString()
        val number1 = stringInTextField.toFloat()
        val number2 = stringInTextField2.toFloat()
        val selectedId = binding.calcOptions.checkedRadioButtonId
        var numberCalculate = when (selectedId) {
            R.id.options_sum -> calculateNumbers().sum(number1, number2)
            R.id.options_subtract -> calculateNumbers().subtract(number1, number2)
            R.id.options_multiply -> calculateNumbers().multiply(number1, number2)
            else -> calculateNumbers().divide(number1, number2)
        }*/





        //FINALIZAR LÓGICA

        //val formattedCalculator = NumberFormat.getCurrencyInstance().format(tip)
        //binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }







