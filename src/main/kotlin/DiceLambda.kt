import java.util.*

fun main() {
    val rollDice = {sides : Int -> if (sides < 1) 0 else (1..sides).random()}
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    println(rollDice(8))
    println(rollDice2(8))
}