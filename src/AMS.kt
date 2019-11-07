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
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

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