fun main() {
    for(num in 1..30){
        if(num in 10..20){
            continue
        }
        else{
            println(num)
        }
    }
  printNationality("Zimbabwe")

    printNationality("France")
    calculate(6,9,"*")
   val places = arrayOf("Kigali","Kampala","Kahawa","Narok")
    for (place in places){
        println(place.reversed())
    }
    val language = "Giriama"

    language.forEach{letter ->
        println(letter.uppercase())
    }
    //printSquares()
    printSquares2()

    var num = 9
    do {
        println(num)
        num--
    }while(num>0)

    var nam = 15
    do{
        println(nam)
        nam --
    }while(nam>0)
    //while evaluates before printing do while evaluates after printing
//    while (num > 0){
//        println(num)// use it when as long as a condition is true , u want it to repeat a number of times untill it stops
//        num--
//    }
    countMoney(arrayOf(50,100,200,400,100,50,200,250))
    val people = (arrayOf("Jack","Jill","James","Jane","John"))
    for(person in people){
        if(person == "James"|| person =="Jane"){
            continue
        }
        else{
            println(person)
        }
    }
    oddNumbers()
   robot(4)
    robot(12)
    robot(70)

    numbers()

    names(arrayOf("Jack","Jill","James","Jane","John","Mitchell","Zipporah","Muhadiwawire"))
}


fun  printNationality(country:String){
    if(country == "Ethiopia"){
        println("Ethiopian")
    }else if(country =="Rwanda"){
        println("Rwandan")
    }else if(country == "Zimbabwe"){
        println("Zimbabwean")
    }
    else{
        println("Foreigner") //else is added when none of the conditions have been met
    }

}

fun printNationalityWhen(country: String){
    when(country){
        "Ethiopia" -> println("Ethiopian")
        "Rwanda" -> println("Rwandan")
        "Zimbabwe" -> println("Zimbwabwean")
        else -> println("Foreigner")
    }
}

fun calculate(x: Int, y:Int, sign:String):Int{
    var result = 0
    when(sign){
        "+" -> {
            result = x+y
            println(result)
        }
        "-","x","/",".","%","*" -> {
            result =x*y
            println(result)

        }
    }
        return result
}
//method1
//fun printSquares(){
//    for(num in 1..100){
//       // println(num*num)
//        val square = num*num   this method is insufficient because it will drain the users battery/contacts
//        if (square<1000) {
//            println(square)
//        }
//        }
//}
//method 2
fun printSquares2(){
    for(num in 1..100){
        // println(num*num)
        val square = num*num  //val is efficient for this method because it never needs to be reassigned
        if (square<1000) {
            println(square)
        }
        else{
            break  //with break the code will immediately leave that loop, this makes it more efficient than method 1
        }
    }
}
fun countMoney(notes :Array<Int>): Int{
    var sum = 0
    for (note in notes){
        sum+=note
    }
    println(sum)
    return sum
}
fun oddNumbers(){
    for(num in 1..100){
        if(num%2!=0){
            println(num)
        }
    }
}
fun robot(age:Int){
  when{
      age < 6 -> println("Glass of milk")
      age in 6..15 -> println("Fanta Orange")
      else -> println("Coca cola")

  }  }



fun numbers() {
    for (num in 1..100) {
//        when {
//            num%3 == 0 -> println("Fizz")
//            num%5 == 0 -> println("Buzz")
//            (num%3==0 && num%5 ==0) -> println("FizzBuzz")
//            else -> println(num)
//
//        }
//    }
        if (num % 3 == 0 && num % 5 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else if (num % 3 == 0) {
            println("FizzBuzz")
        } else {
            println("num")
        }
    }
}
fun names(namesArray: Array<String>): Int{
    var count = 0
    namesArray.forEach { name ->
        var arraSize = name.length
        if (arraSize > 5){
            count += 1
        }
    }
    println(count)
    return count
}