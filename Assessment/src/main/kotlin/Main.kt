fun main() {
    var school =campus("Akirachix")
    print(school[0])
    print(school[2])
    println(school[3])
    school("AkiraChix")
    var fruit=word("banana")
    println(fruit.length)
}
fun campus(school:String):String{
    return school
}
fun school(name:String){
    println(name[0].toString()+name[2].toString()+name[3].toString())
}
fun add(a:Int,b:Int):Int{
    var sum = a + b
    return sum
}
fun word(fruit:String):String{
    return fruit

}

