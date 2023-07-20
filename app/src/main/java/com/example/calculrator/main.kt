package com.example.calculrator

import com.example.calculator.AbstractOperation

fun main() {
    var num1: Double
    var num2: Double
    var operator: Char
    var result: Double

    println("숫자를 입력하세요")
    num1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("연산자를 입력하세요 (+, -, *, / 중 하나)")
    operator = readLine()?.getOrNull(0) ?: '+'

    println("두 번째 숫자를 입력하세요")
    num2 = readLine()?.toDoubleOrNull() ?: 0.0

    result = when (operator) {
        '+' -> AddOperation().operate(num1, num2)
        '-' -> SubtractOperation().operate(num1, num2)
        '*' -> MultiplyOperation().operate(num1, num2)
        '/' -> DivideOperation().operate(num1, num2)
        else -> throw IllegalArgumentException("잘못된 연산자입니다.")
    }

    println("결과: $result")
}