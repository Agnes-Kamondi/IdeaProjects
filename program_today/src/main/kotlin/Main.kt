fun main() {
        val fabric = AnkaraFabric(30, "happy")
        println("Predicted design change: ${fabric.predictDesignChange()}")
}
class AnkaraFabric(var temperature: Int, var mood: String) {
    fun predictDesignChange(): String {
        return when {
            temperature > 25 && mood == "happy" -> "Vibrant floral pattern"
            temperature < 10 && mood == "calm" -> "Subtle geometric pattern"
            temperature < 0 && mood == "sad" -> "Plain design"
            else -> "Standard Ankara design"
        }
    }
}

