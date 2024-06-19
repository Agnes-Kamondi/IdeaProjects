fun main() {
    val human = Human("Agnes",20,61.66666)
    human.eat(1)
    print(human.weight)
    print(human.speak("Hey"))
    human.age
}
class Human (var name:String,var age :Int, var weight:Double){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech :String){
    }
    fun birthday(){
        var newAge = ++age
    }
}