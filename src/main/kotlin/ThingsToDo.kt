fun main() {
    val mood = takeMood()
    println(whatShouldIDoToday(mood))
    println(whatShouldIDoToday(mood, temperature = 78))
    println(whatShouldIDoToday(mood))
    println(whatShouldIDoToday(mood, temperature = 54))
    println(whatShouldIDoToday(mood, weather = "Rainy"))
}

fun takeMood () : String {
    print("How are you feeling today: ")
    return readLine() ?: "happy"
}

fun isHappy (mood : String) : Boolean{
    return (mood == "happy" || mood == "Happy")
}

fun isSunny (weather : String) : Boolean{
    return (weather == "sunny" || weather == "Sunny")
}

fun isTooCold (temperature: Int) : Boolean{
    return (temperature <= 32)
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24) : String {
    return when {
        isHappy(mood) && isSunny(weather) && !isTooCold(temperature) -> "go for a walk"
        isTooCold(temperature) -> "have hot chocolate"
        else -> "Stay home and read."
    }
}