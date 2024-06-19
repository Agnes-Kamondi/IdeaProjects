fun main(){
    val strings = listOf("hello", "world", "python", "javascript", "kotlin")
    println(countVowels(strings))
    val integers = listOf(5, 2, 8, 3, 1, 6, 4)
    println(sortIntegers(integers))
    val numbers = intArrayOf(10, 5, 8, 20, 13)
    println("List: ${numbers.contentToString()}")
    println("Largest number: ${findLargest(numbers)}")
    println(removeDuplicates(mutableListOf(2,2,3,4,4,5,4,5,6,7,8,9,10)))
}
fun countVowels(strings: List<String>): List<Int> {
    val vowels = "aeiouAEIOU".toCharArray()
    val result = mutableListOf<Int>()
    for (s in strings) {
        var count = 0
        for (char in s.toCharArray()) {
            if (vowels.contains(char)) {
                count++
            }
        }
        result.add(count)
    }
    return result
}
fun sortIntegers(integers: List<Int>): List<Int> {
    val sortedIntegers = integers.toMutableList()
    sortedIntegers.sort()
    return sortedIntegers
}

fun findLargest(numbers: IntArray): Int {
    var largest = numbers[0]
    for (num in numbers) {
        if (num > largest) {
            largest = num
        }
    }
    return largest
}
fun removeDuplicates(list: MutableList<Int>): List<Int>{
    var newList = mutableListOf<Int>()
    for(num in list){
        if(!newList.contains(num)){
            newList.add(num)
        }
    }
    return newList
}


