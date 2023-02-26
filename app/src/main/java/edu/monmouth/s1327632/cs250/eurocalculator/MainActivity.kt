package edu.monmouth.s1327632.cs250.eurocalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.monmouth.s1327632.cs250.eurocalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val calcModel= Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // call showConvRate to show initial conversion factor
    }

    fun convert (view: View){
        try{
        val inputValue =binding.dollarAmount.text.toString().toDouble()
        val euros = calcModel.dollarToEuro(inputValue)
        binding.euroAmount.text = String.format("%.2f", euros)
        }catch (e: NumberFormatException){
            binding.euroAmount.text ="Enter valid Number"
        }
    }

    fun setRate (view: View){
        try{
        val inputExchange = binding.xchangeRate.text.toString().toDouble()
        val sRate = calcModel.setRate(inputExchange)
        } catch (e: NumberFormatException){
            binding.euroAmount.text ="Enter valid Number"
        }

    fun showConvRate(){
        val rate= calcModel.getRate()
        binding.xchangeRate.setText(String.format("%.5f", rate))
    }
    }

}