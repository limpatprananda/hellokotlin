import java.util.*

fun main(args: Array<String>){
    println("Hello ${args[0]}")

    feedTheFish()
}

fun shouldChangedWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean{
    return when{
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangedWater(day, 50, 30)
    shouldChangedWater(day)

    if(shouldChangedWater(day)){
        println("Change the water today")
    }
}

fun fishFood(day: String): String {
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitos"
        "Friday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}