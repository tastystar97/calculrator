package com.example.calculrator

import com.example.calculator.AbstractOperation

class AddOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double = (num1 + num2).toDouble()
}
