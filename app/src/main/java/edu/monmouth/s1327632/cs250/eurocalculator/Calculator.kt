package edu.monmouth.s1327632.cs250.eurocalculator

class Calculator {
    private var conversionFactor  = getRate()

    fun setRate(rate:Double): Double {
        return rate
    }
    fun getRate(rate:Double): Double{
        return rate
    }

    fun dollarToEuro (amount: Double) : Double {
        return amount * conversionFactor
    }
}