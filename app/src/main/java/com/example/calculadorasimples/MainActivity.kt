package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimples.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener { calculateNumbers() }
    }

    fun calculateNumbers() {
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
        }





        //FINALIZAR LÓGICA

        //val formattedCalculator = NumberFormat.getCurrencyInstance().format(tip)
        //binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }





}
private fun Unit.sum(number1: Float, number2: Float): Any {
    TODO("Not yet implemented")
}

private fun Unit.subtract(number1: Float, number2: Float): Any {
    TODO("Not yet implemented")
}

private fun Unit.multiply(number1: Float, number2: Float): Any {
    TODO("Not yet implemented")
}

private fun Unit.divide(number1: Float, number2: Float): Any {
    TODO("Not yet implemented")
}







