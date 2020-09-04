import java.util.*

fun main() {
    println("Hello")
    feedTheFish()
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun canAddFish (tankSize : Double, currentFish : List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true){
    when {
        hasDecorations -> println((currentFish.sum() + fishSize)  <= tankSize * 0.8)
        else -> println((currentFish.sum() + fishSize) <= tankSize)
    }
}