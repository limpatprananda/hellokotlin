import java.util.*

fun main(args: Array<String>){
    println("Hello ${args[0]}")

    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {
    var food = "fasting"
    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "granules"
        "Thursday" -> food = "mosquitos"
        "Friday" -> food = "plankton"
        else -> food = "fasting"
    }
    return food
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}