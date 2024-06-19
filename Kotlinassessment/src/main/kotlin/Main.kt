fun main() {
passingMark(10)
    calculate(3)
    println(countCharacters("extraganza"))
    check(11)
    number(-9)
    isPalindrome("Phenomenal")
    findAverage(listOf(10,20,30,40,50,60,70,80))
    val product = Product("Name",100.00)
    println(product.name)
    product.discount()
    println(product.price)
    val account = Account(1000000.00,"Agnes")
    account.deposit(10000.00)
    println(account.balance)
    account.withdraw(1000.00)
    println(account.balance)
    guess(100)
}
fun passingMark(score:Int){
    if(score>= 60){
     println("passed exams")
    }
    else{
        println("not passed exams")
    }
}
fun calculate(weight:Int){
    if (weight in 3..5){
        println("cost is $10")
    }
    else if(weight > 5){
         println("cost is $15")
    }
    else if(weight >= 2){
        println("cost is $5")
    }
    else{
        println("weight not in the range")
    }
}
fun countCharacters(input:String):Map<Char,Int>{
    val inputWord = mutableMapOf<Char,Int>()
    for(char in input){
        inputWord[char] = inputWord.getOrDefault(char,0)+1
    }
    return inputWord
}
fun check(num:Int){
    if (num%2 !=0){
        println("odd number")
    }
    else{
        println("even number")
    }
}
fun number(namba:Int){
    if(namba > 0){
        println("positive number")
    }
    else if(namba < 0){
        println("negative number")
    }
    else{
        println("zero")
    }
}
fun isPalindrome(word:String){
    val words = word.reversed()
    if(words == word){
        println("is palindrome")
    }
    else{
        println("is not palindrome")
    }
}
fun findAverage(input : List<Int>){
    val average = input.average()
    println(average)
}
class Product(var name: String,var price:Double){
    fun discount(){
        val discountedPrice = 0.1 * price
        price+=discountedPrice
    }
}
class Account (var balance: Double,var ownersOwner: String){
    fun deposit(depositAmount:Double){
        balance+= depositAmount
    }
    fun withdraw(money:Double){
        balance-= money
    }
}
fun guess(num: Int){
    println("Enter number between 1 and 100")
    val correctNum = 60
    while(num in 1..100){
        if(num == correctNum){
            println("congratulation")
            break;
        }
        else if(num < correctNum){
            println("too low keep trying")
            break;
        }
        else{
            println("too high keep trying")
            break;
        }
    }
}
