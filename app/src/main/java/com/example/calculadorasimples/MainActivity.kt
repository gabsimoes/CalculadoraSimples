package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadorasimples.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener {
            val toast = Toast.makeText(this, "Sucesso no cálculo!", Toast.LENGTH_SHORT).show()
            calculateNumbers() }
    }

    fun calculateNumbers(){
        val num1 = binding.insertNumber.text.toString().toFloat()
        val num2 = binding.insertNumber2.text.toString().toFloat()
        val optionSet = binding.calcOptions.checkedRadioButtonId
        val resultNumber = when (optionSet) {
            R.id.options_sum -> calculate().options_sum(num1, num2)
            R.id.options_subtract -> calculate().options_subtract(num1, num2)
            R.id.options_multiply -> calculate().options_multiply(num1, num2)
            else -> calculate().options_divide(num1, num2)
        }

        binding.result.text = resultNumber.toString()
    }
}
    class calculate {
        fun options_sum(n1: Float, n2: Float): Float {
            var soma = n1 + n2
            return (soma)
        }

        fun options_subtract(n1: Float, n2: Float): Float {
            var subtrair = n1 - n2
            return (subtrair)
        }

        fun options_multiply(n1: Float, n2: Float): Float {
            var multiply = n1 * n2
            return (multiply)
        }

        fun options_divide(n1: Float, n2: Float): Float {
            var divide = n1 / n2
            return (divide)
        }
    }










