package project

import kotlin.system.exitProcess

fun main() {
    var num1 = readln().toInt()
    var operator = readln()
    var num2 = readln().toInt()

    var cal = Calculator()


    if(operator=="+"){
        println(cal.add(num1,num2))
    }
    else if(operator=="-"){
        println(cal.minus(num1,num2))
    }
    else if(operator=="*"){
        println(cal.multi(num1,num2))
    }
    else if(operator=="/"){
        println(cal.divide(num1,num2).toDouble())
    }
    else if(operator=="%"){
        println(cal.mod(num1,num2))
    }
    else{
        println("다시 입력해주세요")
    }
}

class Calculator() {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun multi(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun divide(num1: Int, num2: Int): Double {
      if(num2==0){
          println("0으로 나눌 수 없습니다")
          exitProcess(0)
      }
       return num1.toDouble() / num2.toDouble()
    }
    fun mod (num1: Int, num2: Int): Int {
        if(num2==0){
            println("0으로 나눌 수 없습니다")
            exitProcess(0)
        }
        return num1 % num2
    }
}