fun main(){
    var sum= add(20,50)
    println(sum)
    var what =sentence("My","name","is","Agnes Auma")
    println(what)
    var result=addition(40,50)
    println(result)
   var name= fullName("Agnes","Auma")
    println(name)
    var name2=condition("Agnes")
    if(name2 == "Agnes")
        println("That's me")
    else(name2!="Agnes")
    println("I don't know you!")

}
fun add(num1:Int,num2:Int):Int{
    var sum = num1+num2
    return sum
}
fun sentence (intro:String,second:String,third:String,forth:String):String{
    var what= intro + ""+ second + ""+ third +""+ forth
    return what
}
fun addition(nam1:Int,nam2:Int):Int {
    var result = nam1 + nam2
    return result
}
fun fullName(name1:String,name2:String):String{
    var name = name1 + name2
    return name

}
fun condition(name2:String):String{
    return name2

}
