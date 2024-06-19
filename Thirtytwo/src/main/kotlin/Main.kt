fun main() {
    campus("Akirachix")

    intro("Agnes",20)


   var fruit= favorite("Apple")

    great(20)

     fullName("Extravaganza")
    isEven("thirtytwo")
 var isNotKenyan : Boolean = true

    isEven(10)

    check("Agnes")

    temp(30.7)

   wes("Hello there")

    val fullName = "Agnes Auma"
    println(fullName)
    var age = 20
    println(age)
    var phonNumber = "+254115052075"
    println(phonNumber)
    var weightInKg = 60.0
    println(weightInKg)
    var notAKenyanCitizen : Boolean = true
    println(notAKenyanCitizen)

}
fun campus(school:String){
    println(school[0].toString()+school[2].toString()+school[3].toString())
}
fun intro(x:String, y:Int):String{
    var introduction = "Hi my name is $x and I am $y years old"
    println(introduction)
    return introduction
}
fun favorite (fruit:String): Int {
    println(fruit.length)
    return fruit.length
}
fun great(num:Int){
    if(num == 30){
        println("Good morning") }
    else{
        println("Good Evening")
    }
}
fun fullName(firstName:String) {
    println(firstName.slice(2..5))
    println(firstName.substring(2..5))
    println(firstName.substring(2,5))
    //the .. gives the range but the substring with a comma cuts the last index
}
fun isEven(num:String){
    println(num.substring(6,9))
}
fun isEven(x:Int){
    if(x%2==0){
        println(true)
    }
    else{
        println(false)
    }
}
fun check(name:String) {
    if (name == "Agnes"){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }

}
fun temp(temperature:Double){

    var message = "The temperature is $temperature degrees celcius"
    println(message)
}
fun wes(here: String){
    println(here.reversed())
}



