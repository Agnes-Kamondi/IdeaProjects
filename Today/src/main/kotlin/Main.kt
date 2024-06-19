fun main() {
    createTwoLists(mutableListOf("ant","hoppers","violet","eggs","kayak","orange"))
    findTotal(
        listOf(
             Cart ("potatoes","groceries",100, 1),
            Cart("legumes","groceries", 150,2),
            Cart("sukumawiki","groceries",30,5),
            Cart("woofer","appliances",100000,1),
            Cart("blowdry","appliances",5000,1),
            Cart("cottonbuds","hygiene",50,2),
            Cart("cottonbuds","hygiene",50,2),
            Cart("furniture","general",1000000,1)
        )
    )
}
fun createTwoLists(random: List<String>): Pair<List<String>,List<String>>{
    val a = mutableListOf<String>()
    val b =  mutableListOf<String>()
    val vowels = mutableListOf('a','e','i','o','u')
    random.forEach { item ->

        val x = item [0]

        if (vowels.contains(x)){
            a.add(item)
        }

        else{
            b.add(item)
        }

    }

    println(a)
    println(b)
    return Pair(a,b)
}
  data class Cart(var name : String,var category:String ,var price :Int, var quantity :Int)

fun findTotal (product: List<Cart>){
    var total = 0
    product.forEach{ x ->
        total += x.price * x.quantity
    }
    println(total)

}

//        val potatoes = Cart ("potatoes","groceries",100, 1)
//    val legumes = Cart("legumes","groceries", 150,2)
//    val sukumaWiki = Cart("sukumawiki","groceries",30,5)
//    val totalGrocery = legumes.price * potatoes.quantity + potatoes.price*potatoes.quantity+ sukumaWiki.price
//    println (totalGrocery)
//
//    val woofer = Cart("woofer","appliances",100000,1)
//    val blowdry = Cart("blowdry","appliances",5000,1)
//    val totalAppliances = woofer.price* woofer.quantity + blowdry.price*blowdry.quantity
//    println(totalAppliances)
//
//    val tissues = Cart("tissues","hygiene",50,2)
//    val cottonBuds = Cart("cottonbuds","hygiene",50,2)
//    val totalHygiene = tissues.quantity*tissues.price + cottonBuds.quantity* cottonBuds.price
//    println(totalHygiene)
//
//    val furniture = Cart("furniture","general",1000000,1)
//    val totalGeneral = furniture.quantity * furniture.price
//
//
//   //   println(totalGeneral)



