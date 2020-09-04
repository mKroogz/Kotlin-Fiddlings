fun main() {
    var fortune = ""
    var runs = 0
    while (runs < 10 && !fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        runs++
    }
}

fun getFortune(birthday : Int) : String {
    val fortune = listOf ("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    return when {
        birthday > 20000000 -> "Take it easy and enjoy life!"
        birthday == 19930323 -> "Keep your head up.  Good things will come. :)"
        else -> fortune[birthday.rem(7)]
    }
}

fun getBirthday() : Int {
    print("Enter your birthday(YYYYMMDD): ")
    return readLine()?.toIntOrNull() ?: 5
}