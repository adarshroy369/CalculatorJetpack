package com.example.calculatorapp

sealed class CalculatorOperation(val symbol : String){
    object Add:CalculatorOperation( " +")
    object subtract:CalculatorOperation( " -")
    object multiply:CalculatorOperation( " x")
    object Decimal:CalculatorOperation( " /")
    object Divide:CalculatorOperation( " %")
}
