import kotlin.system.exitProcess

fun main() {
    var num1 = readln().toInt()
    var operator = readln()
    var num2 = readln().toInt()

    var calc = Calculator()
     calc.cal(num1,operator,num2)
//     calc.addcal(Add(),num1,"+",num2)

}

class Calculator {
//    fun addcal(addclass:Add,num1: Int, operator:String, num2: Int){
//        println(addclass.add(num1,num2))
//    }
fun cal(num1: Int, operator:String, num2: Int){
    return  if(operator=="+"){
        println(Add().add(num1,num2))
    }
    else if(operator=="-"){
        println(Minus().minus(num1,num2))
    }
    else if(operator=="*"){
        println(Multi().multi(num1,num2))
    }
    else if(operator=="/"){
        println(Divide().divide(num1,num2).toDouble())

    }
    else if(operator=="%"){
        println(Mod().mod(num1,num2))
    }
    else{
        println("다시 입력해주세요")
    }
}

}

class Add {
    fun add(num1: Int, num2: Int): Int {
       return num1 + num2
   }
}
class Minus {
    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}
class Multi {
    fun multi(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}
class Divide {
    fun divide(num1: Int, num2: Int): Double {
        if(num2==0) exitProcess(0)
        return num1.toDouble() / num2.toDouble()
    }
}
class Mod {
    fun mod(num1: Int, num2: Int): Int {
        if(num2==0) exitProcess(0)
        return num1 % num2
    }
}