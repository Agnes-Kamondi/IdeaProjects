import jdk.incubator.vector.VectorSpecies
import java.text.FieldPosition

fun main() {
    var snacks = listOf("crisps", "cake", "donut", "popcorn", "pizza")// immutable list
    println(snacks) // you cannot add or remove elements on the above list it acts as an array
    println(snacks.sorted())
    snacks = snacks.sorted()
    println(snacks)

    val friends = mutableListOf("Elijah", "Moses", "Daniel", "Susan", "Canary")
    friends.add("Laura")
    friends.add("Terry")
    println(friends)
    friends.remove("Laura")
    friends.removeAt(4)
    println(friends)
    println(friends[4])
    println(friends)
//    friends.addAll(listOf("Peter","James","Samson"))// u can add an array or any list but it will add at the end
    println(friends)
    friends.addAll(2, listOf("Peter", "James", "Samson")) //to add elements at a particular index specify the index
    println(friends)
    friends.add(3, "Mary") //adds an element at a particular index
    println(friends)
    println(friends.sorted())
    createLIstFromString("Mombasa","Kisumu","Nairobi")
    createListFromStrings2("Mombasa","Kisumu","Nairobi","Kitengela","Narok")
    createListFromInt(mutableListOf(10,20,30,40,50))
    createListInt(mutableListOf(12,4,7,8,9,10,24,54,54))
    createListInt1(mutableListOf(12,4,7,8,9,10,24,54,54))
    createListInt2(mutableListOf(12,4,7,8,9,10,24,54,54))

    val phone = Product("Samsung Galaxy",0.15,5000.0)
    val milk = Product("Tuzo",0.5,65.0)
    val bread = Product("Supaloaf",0.4,55.0)

    var myCart = listOf(phone,milk,bread)
    myCart = myCart.sortedByDescending{product -> product.weight}// or u can use sortedBy
    println(myCart.sortedBy{product -> product.price  })
//    myCart = myCart.filter {product -> product.price>60 }
//    myCart = myCart.filterIndexed{ index, product -> product.price }
    println(myCart)

    createTwoLists(mutableListOf("ant","hoppers","violet","eggs","kayak","orange"))

    listNumber(mutableListOf(10,20,30,40,50,60,70,80,90,100))

    val cars = listOf(
        Car("Toyota", "Prado"),
        Car("Mazda", "Atenza"),
        Car("Subaru", "Legacy"),
        Car("Jeep", "Wrangler")
    )
    val sortedCars = cars.sortedBy { car -> car.make }
    println(sortedCars)
    val descendingSortedCars = cars.sortedByDescending { car -> car.model }
    println(descendingSortedCars)

    randomWords(listOf("Toyota", "Pam", "Oncology", "Neurobiology", "Mango"))

    val people =
        listOf(
            Person("Jane", 14),
            Person("Paul", 32),
            Person("Adrian", 16),
            Person("Muthoni", 25)
        )
    val adults = people.filter { person -> person.age >= 18 }
    println(adults)

    var animal = Animal("Dog","mammal")
    animal.addAnimal("Lion","Mammal")

}
fun createLIstFromString(city1:String,city2:String,city3:String):List<String>{// mutableList
    return listOf(city1,city2,city3)
}

fun createListFromStrings2(vararg cities: String):MutableList<String>{
    val result = mutableListOf<String>()
    cities.forEach{ city -> result.add(city)}
    println(result)
    return result
}

fun createListFromInt(integers:MutableList<Int>):Int{
    val sum = integers[1]+integers[3]
    println(sum)
    return sum

}
// sum of all the odd numbers in a string
fun createListInt(contain:MutableList<Int>):Int {
    var sum = 0
    contain.forEachIndexed { index, item ->
        if(index % 2 != 0)
            sum += item
    }
    println(sum)
    return sum

}
fun createListInt1(contain:MutableList<Int>):Int {
    var sum = 0
    var idx = 1
    while (idx < contain.lastIndex){
        sum+=contain[idx]
        idx+=2
    }
    println(sum)
    return sum
}
fun createListInt2(contain:MutableList<Int>):Int {
    var sum = 0
    for(x in contain){
        var index = contain.indexOf(x)
        if(index%2 != 0)
            sum+= x
    }
    println(sum)
    return sum
}


data class Product(
    var name: String,
    var weight: Double,
    var price :Double
){

}
fun listNumber(num: MutableList<Int>){
    println(num.count())
    println(num.max())
    println(num.sum())
    println(num.average())
    println(num.first())
    println(num.last())
    println(num[0])
    println(num.get(5))
    println(num.indexOf(100))
    println(num.lastIndex)
    for (a in num){
        println(a)
    }
    num.forEach{
     nam -> println(nam)
    }
    println(num.sorted())
    println(num.reversed())
    println(num.sortedDescending())
    println(num.contains(20))
    num.add(110)
    println(num)
    num.remove(110)
    println(num)
}
data class Car(var make: String, var model: String)

fun randomWords(names:List<String>){
    val longNames = names.filter{ name -> name.length>5}
    println(longNames)
}
data class Person(var name: String, var age: Int)

fun createTwoLists(random: List<String>): Pair<List<String>,List<String>>{ // the mpos efficient method is using a data class 
    val a = mutableListOf<String>()
    val b =  mutableListOf<String>()
    val vowels = mutableListOf('a','e','i','o','u')
   for(x in random){
       for (y in vowels){
           if (x.first() == y)
               a.add(x)
           else{
               b.add(x)
           }
       }

   }
    println(a)
    println(b)
    return Pair(a,b)
}
class Animal(var name: String, var species: String){
    fun addAnimal (name:String,species: String){
        var animals = mutableListOf<Map<String,String>>()
        var newAnimal = mapOf(name to(name),species to (species))
        animals.add(newAnimal)
        for(animal in animals){
            println(animals)
        }
    }
}








