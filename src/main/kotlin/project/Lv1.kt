package project

fun main() {
    var num1 = readLine()!!.toInt()
    var operator = readLine()!!
    var num2 = readLine()!!.toInt()



    if(operator=="+"){
        println(num1+num2)
    }
    else if(operator=="-"){
        println(num1-num2)
    }
    else if(operator=="*"){
        println(num1*num2)
    }
    else if(operator=="/"){
        println(num1/num2)
    }
    else{
        println("다시 입력해주세요")
    }
}



//package lv3
//
//class Calculator {
//    fun calc(num1: Int, operator: String, num2: Int): Any {
//        return when (operator) {
//            "+" -> AddOperation().operate(num1, num2)
//            "-" -> SubtractOperation().operate(num1, num2)
//            "*" -> MultiplyOperation().operate(num1, num2)
//            "/" -> DivideOperation().operate(num1, num2)
//            else -> "잘못된 연산자 입니다. "
//        }
//    }
//}
//
//
//class AddOperation {
//    fun operate(num1: Int, num2: Int): Any {
//        return num1.toDouble() + num2.toDouble() }
//}
//
//class SubtractOperation {
//    fun operate(num1: Int, num2: Int): Any {
//        return num1.toDouble() - num2.toDouble()
//    }
//}
//
//
//class MultiplyOperation {
//    fun operate(num1: Int, num2: Int): Any {
//        return num1.toDouble() * num2.toDouble()
//    }
//}
//
//class DivideOperation {
//    fun operate(num1: Int, num2: Int): Any {
//        return if (num2 != 0) {
//            num1.toDouble() / num2.toDouble()
//        } else {
//            "0으로 나눌 수 없습니다. "
//        }
//    }
//}
//
//
//
//
//
//fun main() {
//    println("첫 번째 숫자를 입력하세요 :  ")
//    var num1 = readln().toInt()
//    println("연산 기호를 입력하세요: ( +, -, *, / ) ")
//    var operator = readln()
//    println("두 번째 숫자를 입력하세요: ")
//    var num2 = readln().toInt()
//    var calculator = Calculator()
//    var result: Any  = calculator.calc(num1, operator, num2)
//    println("결과: $result")
//}