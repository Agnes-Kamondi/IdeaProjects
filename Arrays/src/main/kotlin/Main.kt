fun main(){
//    val friends: Array<String> = arrayOf("Agnes","Dan","Reign","Terry","Vincent","Ian","Emily")
//    println(friends[2])
//    println(friends[3])
//    println(friends.contentToString())
//    println(friends.get(4))
//    println(friends.indexOf("Dan"))
//    friends.set(1,"Harry")
//    println(friends.contentToString())
//    friends[1] = "Dan"
//    println(friends.contentToString())
//    friends.indexOf("Dan")
//    println(friends.indexOf("Agnes"))
//
//    val sortedNames :Array<String>  = friends.sortedArray()
//    println(sortedNames.contentToString())
//    println(sortedNames.lastIndexOf("Agnes"))
//
//    val friends2 = sortedNames.plus("Tosh")
//    println(friends2.contentToString())
//
//    val friends3 = sortedNames.plus(arrayOf("Warren","Wences"))
//    println(friends3.contentToString())
//    println(friends3.size)
//    println(friends3.count())
//
//
//    val numArray = arrayOf(23,45,14,20,40,50,54,21,24,25,42,64)
//    println(numArray.sum())
//    println(numArray.size)
//    println(numArray.average().toInt())
//    println(numArray.average())
//    println(numArray.minOrNull())
//    println(numArray.maxOrNull())
//
//    for(x in numArray) {
//        println(x * x)
//    }
//    numArray.sortDescending()
//    println(numArray.contentToString())
//    numArray.sort()
//    println(numArray.contentToString())
//
//    val nums = arrayOf(34,45,54,11,14,2,65,75,80)
//    square(nums)
//
//    val number =arrayOf(45,55,75,35,65,15,25,85,95)
//    addition(number)

    takes("Agnes","Reign","Ian","Vincent")

    cityNames(arrayOf("harare","mumbai","dodoma","jakarta"))

   numbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))



}
//fun square(nums:Array<Int>) :Array<Int> {
//    val squares = Array(nums.size){0}
//    println(squares.contentToString())
//    nums.forEachIndexed { index,num->
//        val sq = num*num
//        squares[index] = sq
//    }
//    println(squares.contentToString())
//    return squares
//}
//fun addition(number:Array<Int>):Array<Int>{
//    val adds = Array(number.size){0}
//    println(adds.contentToString())
//    number.forEachIndexed{ x,number ->
//        val add = number+5
//        adds[x] = add
//
//    }
//    println(adds.contentToString())
//    return adds

fun takes(nam:String,nam1:String,nam2:String,nam3:String){
    val stringName = arrayOf(nam,nam1,nam2,nam3,)
    println(stringName.contentToString())

}
fun cityNames(cities: Array<String>){
    val grammatical = arrayOf<String>()
    println(grammatical.contentToString())

}
fun numbers(number: Array<Int>){
  println(number[1]+(number[4]))
    println(number.indexOf(158))
    var sortedNumber = number.sortedArray()
    println(sortedNumber.contentToString())


}