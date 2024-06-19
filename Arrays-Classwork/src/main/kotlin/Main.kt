

//fun main() {
   // val friends = arrayOf("Mary", "Beth", "Steve", "Beth")
//    println(friends[2])
//    println(friends[3])
//    println(friends.toString())// toString() is a  function that converts any data type to a string
//    // eg age = 56  to add this to 57 u can say age++ or age +=1
//    //println(age.toString() + "years")
//   // ++before a variable is pre-increment and ++after a variable is post increment
//    //println(friends.contentToString())
//
//    val num: Array<Int> = arrayOf(1,2,3,4)
//
//    val rwanda: Array<Any> = arrayOf(13000000,"Paul Kagame",66.77,true)
//    println(rwanda.contentToString())
//
//}
//fun printFriends(friends: Array<String>){
//    println(friends.contentToString())
//}
//println(friends.get(1))//gives value at index 1
//    println(friends[1])// gives value at index1
//    friends.set(1,"Peter")
//    friends[3] = "Martha"
//    friends.indexOf("Diana") //-1 because it does'nt exist
//    friends.indexOf("Martha")
//    println(friends.contentToString())
//}
   // println(friends.lastIndexOf("Beth"))
   // var x : Int? =5 // a question mark here means x is a nullable integer meaning it can accept intergers or null
    //u can do this to any data type
   // x = null

   // var phoneNumber:String? = null
    //phoneNumber = "0115052075"
 //var friends : Array<String?> = arrayOf("Mary","Beth","Steve","Beth")
    //a question mark makes an array either a data type and a null or a null depending on where you'll be placing it
    // in the above case when u write <string>? will mean that all the elements of the array are all nulls.
   // friends[3] = null

   // friends = arrayOf("Mary","Beth","Steve","Peter","Diana")// here we created the second array using the same label as
    //the first array when we try to get it from the memory u will just be able to access the second array you created
    //they are two different arrays. In kotlin declaring and reassigning are two different things.
    //the arrayOf function is used to return an array/create an array no matter the size
    // but the equal sign is used to assign the array to memory
    //println(friends.contentToString())
//}
//fun main (){
     //var friends = arrayOf("Mary","Beth","Steve","Peter")

       //friends = friends.plus("Diana")
      // friends = friends.plus(arrayOf("Glory","Kuria"))
       // what is actually happening here is we are creating another space in memory for another array
       //plus function returns the current array and adds it to the initial array and returns all of it as one array.
       //plus creates a new array without using the function array of but copy of which is saved in the kotlin database
       // that we don't even know its classified as abstraction.
       //there are two variants of the plus function one allows u to add element but in another form allows you to add
       // another array.this is called polymorphism

       //println(friends.contentToString())
//}
//fun main(){
//    var friends = arrayOf("Mary","Beth","Steve","Peter")
//
//    var nums = arrayOf(23,14,156,78,5,35,24,768,78)
////           println(nums.sum())
////           println(nums.count())
////           println(nums.size)// count and size have the same function they will give the same result
////           //count and size will work on different array types
////           println(nums.sum().toDouble()/nums.count()) //.toDouble has been used to get the exact average
////           println(nums.average())//the other method that is used to get the average easily
////           println(nums.minOrNull())
////           println(nums.max())
////           println(nums.maxOrNull())
////           friends.sort()
////               nums.sort()
////           friends.sortDescending()
////           nums.sortDescending()
////
////           println(friends.contentToString())
////           println(nums.contentToString())
//
//           friends = friends.sortedArray() //sorted array will create a spece in momemory for the initial copy
//           // and then create a new copy
//           nums = nums.sortedArray()
//
//           println(friends.contentToString())
//           println(nums.contentToString())

//}
//fun main (){
//    var nums: Array<Int?> = arrayOf(23,14,156,78,5,null,35,24,768,78)
//    nums.sort() / you cannot sort a null array.
//}
//fun main(){
//    var friends = arrayOf("Mary","Beth","Steve","Peter")
//    var nums = arrayOf(23,14,156,78,5,35,24,768,78)
//
////    friends.forEach{ x->// this means in the array take one element before the other. this is a form of looping .
////        println(x)
////    }
////    friends.forEach{ friend->
////        println(friend) // you can use any variable name for this
////    }
////    for (x in friends ){
////        println(x)//write a function that takes in the nums array above and prints out the square of each element
////    }
//    for (x in nums){
//        println(x*x)
//    }
//}
//fun main(){
//    var nums = arrayOf(23,14,156,78,5,35,24,768,78)
//     square(nums)
//
//    //write a function that takes in the nums array above and prints out the square of each element
//
//}
//fun square(nums:Array<Int>) {
//    for (x in nums) {
//        println(x * x)
//    }

//}
//fun main(){
//    square(number = arrayOf (23,14,156,78,5,35,24,768,78))
//}
//fun square(number:Array<Int>){
//    number.forEach{ y->
//        println(y * y)
//
//    }
//
//
//fun main(){
//    var nums = arrayOf(23,14,156,78,5,35,24,768,78)
//   square(nums)
//}
//fun square(nums:Array<Int>) :Array<Int> {
//    val squares = Array(nums.size){0} //when creating a blank array you can use any default values but zero is always the
//    //one to use.
//    println(squares.contentToString())
//    nums.forEachIndexed { index,num-> // in a string we can use i/ index is just a variable name here
//        val sq = num*num
//        squares[index] = sq
//    }
//    println(squares.contentToString())
//    return squares
//}
//fun squareprint(number:Array<Int>) {
//    number.forEach { y ->
//        println(y * y)
//    }
//}
fun main(){
   val friends = arrayOf("Kelvin","Wade","Mercy","Victoria")
    bess(friends)

    val indexes = arrayOf(20,30,50,70,80,90)
    number(indexes)


}
fun bess(friends:Array<String>){  //this counld be Array<Any> with any data type, Array<String>
    println(friends[2])
    println(friends[3])
    friends.set(1,"Reign")
    friends[3] = "Myself"
    friends[1] = "Dan"
    friends.plus(arrayOf("Van", "Diesel"))
    println(friends.contentToString())
    var sortedBess = friends.sortedArray()
    println(sortedBess)
    var printFriends = friends.sortDescending()
    println(printFriends)
    friends.forEach { friend ->
        println(friend.uppercase())

    }
}
fun number(indexes: Array<Int>){
    print(indexes.sum())
    print(indexes.count())
    print(indexes.size)
    println(indexes.average())
    println(indexes.minOrNull())
    println(indexes.maxOrNull())
    println(indexes.sort())
    println(indexes.sortedArray())
    println(indexes.sortDescending())
    for (x in indexes){
        println(x*x)
    }
}
//The things that have not been printed out should have variable







