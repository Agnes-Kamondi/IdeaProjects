fun main(args: Array<String>) {

    val builder = StringBuilder()
// Append some text to the strin
    builder.append("Hello ")
// Insert some text at a specifi
    builder.insert(6, "world")
// Delete some text from the str
    builder.delete(6, 11)
// Convert the StringBuilder to
    val str = builder.toString()
// Print the final string
    println(str)  // Output: Hello
}
