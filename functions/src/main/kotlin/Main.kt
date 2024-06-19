fun main() {
    printFullName("Arthur","Holland")
   var result = add( 24,87)
     println(result)

   var word = getStringLength("Air Freshner")
    println(word)

    legalName()
   var x = division(20.0,4)
    println(x)
    var y=area(3.142,14)
    println(y)

}
fun printFullName(firstName:String,lastName: String){
    var fullName = firstName + "" + lastName
    println(fullName)

}
fun add( num1: Int , num2: Int): Int{
    var result = num1 + num2
    return result


}

fun getStringLength(word: String) : Int{
    return word.length
}
fun legalName(){
    var firstName = "Agnes"
    var secondName = "Auma"
    var legalName = firstName + "" + secondName
    println(legalName)
}
fun division(num1:Double, num2:Int): Double{
    var result = num1/num2
   return result
}
fun area(pi:Double,diameter:Int): Double{
    var result= pi * diameter/2 *diameter/2
    return result

}

