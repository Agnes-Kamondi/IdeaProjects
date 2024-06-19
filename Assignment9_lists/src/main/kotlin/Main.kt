//1. Given a list of 10 strings, write a function that returns a list of the strings at
// even indices i.e index 2,4,6 etc                    (2 points)
fun main() {
    createString(mutableListOf("Agnes","Mishel","Rachel","Adhiambo","Peter","Martha", "Obama","Trevor","Dan","Reign"))
    evenStrings(mutableListOf("Agnes","Mishel","Rachel","Adhiambo","Peter","Martha", "Obama","Trevor","Dan","Reign"))
    println(peoplesHeight(mutableListOf(1.777,1.876,1.234,1.236,1.567,1.90)))
    println(height(mutableListOf(10,21,15,15,17,41)))
    val woman = Person("Agnes",21,1.7778, 60.2)
    val man = Person("Dan",21,1.2224,75.100)
    val child = Person("Reign",2, 0.0100, 20.540)
    val persons = listOf(man,woman,child)
    val x = persons.sortedBy {person ->  person.age }
    println(x)



}
fun createString(name: MutableList<String>): MutableList<String>{
 val names = mutableListOf<String>()
    name.forEachIndexed { index, x->
        if(index % 2 == 0)
            names.add(x)
    }
    println(names)
    return names
}
fun evenStrings(example:List<String>){
    var new = example.filterIndexed { index, s ->
        index%2==0
    }
    println(new)

}

//2. Given a list of people's heights in metres. Write a function that
// returns the average height and the total height                (2 points

data class People (var average :Int , var total :Double)

    fun peoplesHeight(height: MutableList<Double>):People {
        val average = height.average().toInt()
        val total = height.sum()
        return People(average, total)


}
fun height(numbers:List<Int>): Pair<Int, Double> {
    val total = numbers.sum()
    val average = numbers.average()
    return Pair(total, average)
}
//3. Given a list of Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age   (2 points)

class Person(var name:String, var age: Int, var height: Double , var weight: Double)

    fun addPeopleToList(peopleList: MutableList<Person>) {
}