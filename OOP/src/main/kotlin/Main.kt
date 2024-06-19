////OOP is a technique that is used to breakdown problems into small manageable parts called objects.Objects are things that have
////attributes and behaviours like in the real world to solve particular problems.Object is model that we use to break our program
//// into small manageable. In kotlin everything is an object which are in classes
////Find out what someone was thinking when they used a class to be called a template.
//fun main() {
//    var car = Car("Toyota","probox","KCD 334T",0)// A constractor is used to create objrcts
//    //out of a class. we declare it by wirtting the name of the class that pareameter.
//    var audi =Car("Audi","A4","KDG 105T",0)
//    // the Adi above is a Car data type when you create an object in a class the class takes up the function of br=euing the data
//    //type of the person when u want to sort it as an array u will use sortedwith()
//
//    //Always follow the convention of using small letters to create variables and capital lettter as the first letter
//    //assign class
//    car.start()
//    audi.start()// the dot notation is what we use to access the behaviours and attributes of objects in a class
//    println(car.make)
//    println(audi.make)
//    println(audi.speed)
//    audi.accelerate(56)
//    println(audi.speed)
//    audi.accelerate(34)// when implementing the acceleration function you can access the speed which is the
//    //property used
//    println(audi.speed)
//    audi.deccelerate(20)
//    println(audi.speed)
//    audi.hoot()
//    audi.stop()
//    println(audi.speed)
//    audi.model
//    println(audi.model)
//
//
////    val yellowBulb = LightBulb()
////    val blueBulb = LightBulb()
//}
//
//class Car( var make:String, var model:String,var registration:String,var speed:Int){
//    // we use var instead of val so that you can be able to access its attributes and also give the attributes other values.
//    fun start(){
//        println("chogiogiogiogio, vroooooom")
//    }
//
//    fun accelerate(acceleration:Int){
//       speed+=acceleration //speed = speed + acceleration
//        //var newSpeed = speed + acceleration -> this will not affect the printed result because its not part of
//        //property
//    }
//    fun deccelerate(decceleration:Int){
//        speed-=decceleration
//    }
//    fun hoot(){
//        println("beep")
//    }
//    fun stop(){
//        speed = 0
//        //deccelerate(speed)
//    }
//}
fun main() {

//    var human = Human("Agnes", 21, 61.6666666)
//    println(human.eat(10))
//    println(human.weight)
//    human.speak("Hello")
//    human.birthday()
    removeNumerics("agnes1232ajema")
}
//}
//class Human(var name:String,var age:Int,var weight:Double){
// fun eat(foodWeight:Int) {
//     println("I am eating $foodWeight kgs of food")
//     weight += foodWeight
// }
//    fun speak(speech:String){
//        println(speech)
//    }
//    fun birthday(){
//        println(++age)
//
//    }
//
//
//
//}

//data class EmplDetails(var name: String, var position: String, var salary:Double)
//class  Employee(var name: String, var position: String, var salary:Double){
//    fun addemployee(amount:Double, employee:List<Employee>){
//        for (employees in employee){
//            salary += amount
//        }
//        println(employees)
//    }
//}


