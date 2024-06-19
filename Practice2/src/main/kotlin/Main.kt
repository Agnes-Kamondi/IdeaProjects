import java.util.*

fun main() {
    addition(30,24)
    var numArray = arrayOf(1,2,3,4,5,6,7,8)
    println(numArray[0])
    println(numArray[2])
    println(numArray[5])
    println(numArray.count())
    println(numArray.sum())
    println(numArray.minOrNull())
    println(numArray.maxOrNull())
    numArray[0] = 0
    println(numArray[0])


    var namesArray = arrayOf("Reign","Emily","Vincent","Tosh","Ian","Harry","Dan")
    println(namesArray[1])
    println(namesArray[0])
    println(namesArray[6])
    println(namesArray.get(4))
   namesArray.set(0,"Agnes")
    //set replaces a value in an array with another.
    println(namesArray[0])
    println(namesArray.count())
    var namesArray2 = namesArray.plus("Lilian")
    //plus add a value to an array but when another value is created arrays are fixed once created they cannot be made longer or shorter.
    println(namesArray2.count())
    println(namesArray2[7])
    namesArray.forEach {name ->
        println(name)

    }
    for (x in namesArray2){
        println(x)
    }
    var sortedNames = namesArray.sortedArray()
    println(Arrays.toString(sortedNames))
     var numArray2 = arrayOf(65,20,5,56,7,13,9,46,24,14,21)
    var sortedNum = numArray2.sortedArray()
    println(Arrays.toString(sortedNum))



    var country = arrayOf("Kenya",true,500000000000,0.97)
    println(country[1])
    println(country[3])
    println(country[0])
}
fun addition(num:Int,num1:Int){
    var num3 = num + num1
    println(num3)
}


