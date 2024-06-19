//class Car {
  //  var brand = ""
   // var model = ""
   // var year = 0
//}

//fun main() {
    //val c1 = Car()
   // c1.brand = "Ford"
   // c1.model = "Mustang"
    //c1.year = 1969

   // val c2 = Car()
   // c2.brand = "BMW"
   // c2.model = "X5"
  //  c2.year = 1999

   // println(c1.brand)
   // println(c1.model)
   // println(c1.year)

    //println(c2.brand)
    //println(c2.model)
    //println(c2.year)
//}
  //  class Car(var brand: String, var model: String, var year: Int)

//fun main() {
   // val c1 = Car("Ford", "Mustang", 1969)
   // println(c1.brand)
//}
//class Car(var brand: String, var model: String, var year: Int)

//fun main() {
   // val c1 = Car("Ford", "Mustang", 1969)
   // val c2 = Car("BMW", "X5", 1999)
    //val c3 = Car("Tesla", "Model S", 2020)

   // println(c1.model)
    //println(c2.year)
    //println(c3.brand)
//}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)

    // Call the function
    c1.drive()
}
class Car(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }
}
