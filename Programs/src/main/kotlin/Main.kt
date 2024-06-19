data class Workout(
    val id: Int,
    val type: String,
    val caloriesBurned: Int,
    val durationMinutes: Int
)

class WorkoutSystem {
    private val workouts = mutableListOf<Workout>()
    private var nextId = 0 // or 1 or use post increment
    fun addWorkout(type: String, caloriesBurned: Int, durationMinutes: Int) {
        val workout = Workout(++nextId, type, caloriesBurned, durationMinutes)
        workouts.add(workout)
        println("Workout added successfully.")
    }

    fun searchWorkoutByType(type: String): Workout? {
        return workouts.find { it.type.lowercase() == type.lowercase()}
        //you can use .filter in this
    }

    fun showAllWorkouts() {
        if (workouts.isEmpty()) {
            println("No workouts in the system.")
        } else {
//            workouts.forEach {
//                println("ID: ${it.id}, Type: ${it.type}, Calories Burned: ${it.caloriesBurned}, Duration: ${it.durationMinutes} minutes")
//            }
            println(workouts)
        }
    }

    fun removeWorkout(id: Int) {
        val workout = workouts.find { it.id == id }
//        println(workout)
        if (workout != null) {
            workouts.remove(workout)
            println("Workout with ID $id removed successfully.")
        } else {
            println("Workout with ID $id not found.")
        }
    }

    fun calculateTotalCaloriesBurned(): Int {
//        return workouts.sumOf { it.caloriesBurned }
        var sum = 0
        for (i in workouts){
            sum+=i.caloriesBurned
        }
        return sum
    }
}
data class Product(
    val name : String,
    val price : Double,
    val quantity : Int,
    val category : String
)
class Cart{
    private val products = mutableListOf<Product>()
    fun addNewProducts(name: String, price: Double,quantity:Int,category:String){
        val product = Product(name, price, quantity, category)
        products.add(product)
        println("Workout added successfully")
    }
    fun calculateTotalCost():Double{
     return products.sumOf{ it.price}
    }
    fun getAllProducts(){
        if(products.isEmpty()){
            println("No products found")
        }
        else{
        products.forEach{
            println("name : ${it.name},price : ${it.price}, quantity: ${it.quantity},category : ${it.category}")
        }
        }
    }

}
fun main() {
    val workoutSystem = WorkoutSystem()

    // Adding some sample workouts
    workoutSystem.addWorkout("Running", 300, 30)
    workoutSystem.addWorkout("Cycling", 200, 45)
    workoutSystem.addWorkout("Jumping", 600, 35)
    workoutSystem.addWorkout("Pushups", 1400, 25)



    // Displaying all workouts
    println("All Workouts:")
    workoutSystem.showAllWorkouts()

    // Searching for a workout by ID
    val searchType = "running"
    val searchedWorkout = workoutSystem.searchWorkoutByType(searchType)
    println(searchedWorkout)
    if (searchedWorkout != null) {
        println("\nFound Workout:")
        println("ID: ${searchedWorkout.id}, Type: ${searchedWorkout.type}, Calories Burned: ${searchedWorkout.caloriesBurned}, Duration: ${searchedWorkout.durationMinutes} minutes")
    } else {
        println("\nWorkout type $searchType not found.")
    }

    // Removing a workout
//    val removeId = 9
    workoutSystem.removeWorkout(9)

    // Displaying all workouts after removal
    println("\nAll Workouts After Removal:")
    workoutSystem.showAllWorkouts()

    // Calculating total calories burned
    val totalCaloriesBurned = workoutSystem.calculateTotalCaloriesBurned()
    println("\nTotal Calories Burned: $totalCaloriesBurned")

    val cart = Cart()
    cart.addNewProducts("Amplifier",3000.00,1,"Amplifier")
    cart.addNewProducts("BodyShaper",5000.00,5,"Clothes")
    cart.addNewProducts("Body Sculpter",300000.00,4,"Selfcare")

    println("All products: ")
    cart.getAllProducts()

    println(cart.calculateTotalCost())
}



