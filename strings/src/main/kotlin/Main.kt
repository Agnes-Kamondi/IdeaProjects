

fun main() {
   var bucket = "bird"
    bucket = "birds"
     print(bucket)
    var word = "c"
    word = "ca"
    word = "cam"
    word = "came"
    word = "camer"
    word = "camera"
 // Strings are immutable meaning they can not be reassigned. The original string can never change once it takes space
 // memory it cannot be changed or turned into a new value.
 //You can actually use the same variable but the string can never be replaced
 println(word)
  var fname = "Mary"
 var lname = "Auma"
 var fullName = "$fname $lname"
 // interpolation
 // concatenation can be written as ( "Mary "+ " "+" Auma ")
 println(fullName)
 var name = "Agnes"
 var age = 22
 var occupation = "Computer Scientist"
 var statement= "$name who is $age years old is a $occupation"
 println(statement)

 greeting("Angela")
 greeting( "Vincent")

 var fruit = "Mango"
 println(fruit[0])
 println(fruit[4])
 println(fruit[2])
 //index values index actually mean that strings in kotlin actually have a position.

 var pine = "apple"
 println(pine.first())
 println(pine.last())
 println(pine.indexOf( "p"))

 var nana = "banana"
 println(nana.indexOf("a"))
 println(nana.lastIndexOf("a"))

 var weight = 40.7
 println("$weight kgs is my weight ")
 //println( weight.string + " " + kgs is my weight)

 var city =" Nairobi"
 var city2 = "Kiambu"
 println(city.equals(city2))
 // println(city==city2)
 // In kotlin the (city==city2) is always preferred
 // used to compare if information is true or false.

 var province = "Siaya"
 var province2 = "Siaya"
 println(province.uppercase())
 println(province2.lowercase())

 var emptyString = ""
 var blankString = " "

 // white space is a character in kotlin.
 println(emptyString.isEmpty())
 println(blankString.isEmpty())

 println(emptyString.isBlank())
 println(blankString.isBlank())
 //the emptyString is blank because the makers of the language decided so

 var statemen = "good morning"
 println(statemen.indexOf("x"))
 // the result will be -1 because x does not exist in the above string.
 // you cannot access indices out of the size of the string

 val town = " Kitale "
 println(town)
 println(town.trimStart())
 println(town.trimEnd())
 println(town.trim())
 //.length gives you the length of a string

 var statements = "The blue car overtook the black car."
 println(statements.replace("car", "bike"))
 println(statements.startsWith("The"))
 // A prefix is used to check whether a string ends with a certain character or string.
 println(statements.endsWith("car"))
 println(statements.replace("a","e"))

 var days = "Friday is my most favourite day of the week"
 println(days.split(" "))

 var dateNow = "2024-02-28"
 println(dateNow.split("-"))

 var love ="Reign"
 println(love.length)

 var profession = "ComputerScientist"
 println(profession.split(""))



}
fun greeting(name:String){
 println("Hello $name")
}