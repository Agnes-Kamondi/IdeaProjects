fun main() {
    val banker = Banker("Joseph", 26)
    banker.eat()
    banker.introduction()
//    banker.talk("Monetary policy")
//    banker.sleep()
//    banker.countMoney(arrayOf(50,100,200,100,200,50,100))

    val doctor = Doctor("Isaac", 32)
//    doctor.talk("Health records")
    doctor.eat()
    doctor.introduction()
//    doctor.treatPatient("Yvonne","malaria")

    val farmer = Farmer("Kevin", 52)
//    farmer.talk("farm produce")
    farmer.eat()
    farmer.introduction()
//    farmer.sleep()
//    farmer.cultivateLand()

    val musician = Musician("Dan", 20)
    musician.eat()
    musician.introduction()
    musician.concert()


    val mother = Mother("Emily", 40)
    mother.chores()
    mother.introduction()
    mother.sleep()

}
open class Person (var name:String,  age: Int){   //for u to inherit a class u must name it as open

    fun talk (words:String){
        println(words)
    }
   open fun eat(){ //to overide eat funtion you need to label it as open
        println("yum")
    }
    fun sleep(){
        println("zzzzzz")
    }
    open fun introduction(){
        println("Hi I am $name")
    }
}

class Banker( name:String,age: Int) : Person(name,age){ // the child class inherits the characters in the parent

    fun countMoney(notes:Array<Int>): Int{
        var sum = 0
        notes.forEach{ note ->
            sum += note

        }
        return sum
    }

}
class Doctor(name : String, age:Int) : Person(name,age,){

    fun treatPatient(patient: String, disease:String){
        println("treat $patient for $disease")
    }
    override fun introduction(){
        println("Hi I am Dr.$name")
    }

}
class Farmer (name:String,age: Int):Person(name,age){
    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() { //overide is a key funtion used to inherit
       // super.eat()//when u say super.eat u'll call it in the parents
        println("I am eating the food that I've grown")
    }
}
class Musician (name:String, age: Int): Person(name,age){
    fun concert(){
        println("Sing Sing Sing")
    }
    override fun eat (){
        println("Having breakfast in LA and dinner at NewYork")
    }
    override fun introduction(){
        println("Hi my name is $name and I know It'll sound wierd being the first time we've met but I like you")

    }

}
class Mother( name:String, age:Int): Person(name,age){
    fun chores(){
        println("Wash wash wash")
    }
}