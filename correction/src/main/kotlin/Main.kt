fun main() {
    removeB("Barnie bakes brown bagels and buns")
    println(calculateSummary(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    calculateVolume(14)
    println(isPalindrome("Madam"))
    println(isPalindrome1("Pullup"))
    println(reverseString("Abadabkatan"))
    println(returnLast("This is Akirachix"))
    println(lengthOfLastWord("Watch out because it might hit you"))
    lastWordLength("the brown fox jumped quickly")
    printMultiple()
}
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun removeB(sen: String) {
    val sentence = sen.lowercase().split('b')// you can remove more than one letter
    // apart from removing the occurrences of a letter the split method creates a list.
    println(sentence)
}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
data class Summary(var sum: Int, var count: Int, var average: Double)

fun calculateSummary(numbers: Array<Int>): Summary {
    val sum = numbers.sum()
    val count = numbers.count()
    val average = numbers.average()
    return Summary(sum, count, average)
}
//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun calculateVolume(radius: Int) {
    val pi = 3.14159
    val num = 4.0 / 3  //when you divide two integers in kotlin u get an integer so if this was 4/3 it would not give
    //the accurate volume
    val volume = num * pi * radius * radius * radius
    println(volume.toInt())
}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word: String): Boolean {
    return word.lowercase() == word.lowercase().reversed()

}


//this method below is called the two pointer method
fun isPalindrome1(str: String): Boolean {
    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str.lowercase()[start] != str.lowercase()[end]) {   //str[start]!=str[end] when we are assuming the string
            //is not in title case
            return false
        }
        start++
        end--
    }
    return true
}

fun reverseString(word: String): String {
    var arrayOfChars = word.toCharArray()
    var left = 0
    var right = word.length - 1

    while (left < right) {
        val temp = arrayOfChars[left]
        arrayOfChars[left] = arrayOfChars[right]
        arrayOfChars[right] = temp
        left++
        right--
    }
    return String(arrayOfChars)
}

fun returnLast(sentence: String): Int {
    var words = sentence.split(" ").toTypedArray()
    var word = words.last()
    return word.length

    // var words = (sentence.trim()).split(" ")
    //var word = words[words [words.size()-1]
    //return word.length
}

fun lengthOfLastWord(s: String): Int { //this is more efficient than the one for splitting above
    var result = 0
    for (i in s.length - 1 downTo 0) {
        if ((s[i].toString() == " " && result == 0)) continue

        if (s[i].toString() == " " && result != 0) break
        result++
    }
    return result
}

fun lastWordLength(sentence :String): Int{
    var len = 0
    var idx = sentence.trim().lastIndex
    while (idx > 0){
        if(sentence[idx] != ' '){
            len ++
        }
    else{
        break
        }
    idx --
}
    return len

}
fun printMultiple(){
    for( num in 1..1000){
        if(num % 6 == 0 && num % 8 == 0){
            println("bingo")
        }
        else if (num % 6 == 0){
            println(num)
        }
        else if(num % 8 == 0){
            println(num)
        }
    }

}

data class Recipe(val name: String, val ingredients: List<String>, val instructions: List<String>)

class RecipeManager {
     val recipes = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    fun searchRecipe(recipeName: String) {
        val searchedRecipe  = recipes.find { it.name == recipeName }
         println(searchedRecipe)
}


data class Contact(val name: String, var phoneNumber: String)

class AddressBook {
    val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact) {
        contacts.add(contact)
        println("Contact added successfully.")
    }

    fun removeContact(name: String) {
        val contactToRemove = contacts.find { it.name == name }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove)
            println("Contact removed successfully.")
        } else {
            println("Contact not found.")
        }
    }






