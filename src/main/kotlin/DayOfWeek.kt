import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    var dayNum = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when
    {
        dayNum == 1 -> println("Sunday")
        dayNum == 2 -> println("Monday")
        dayNum == 3 -> println("Tuesday")
        dayNum == 4 -> println("Wednesday")
        dayNum == 5 -> println("Thursday")
        dayNum == 6 -> println("Friday")
        else -> println("Saturday")
    }
}