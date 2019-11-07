fun main(args: Array<String>){
    val first = firstImplement("Limpat Prananda", 29)
    val second = secondImplement("Limpat Prananda", 29)
    val third = thirdImplement("Limpat Prananda", 29)
    val fourth = fourthImplement("Limpat Prananda", 29, thirdImplement)
    val fourth2 = fourthImplement("Limpat Prananda", 29, ::secondImplement)
    val fourth3 = fourthImplement("Limpat Prananda", 29){
        name, age ->
        "Manually Implement  { name: $name | age: ${age.toString()} }"
    }
    val fifth = fifthImplement("Limpat Prananda", 29, thirdImplement, "Sidoarjo")
    val fifth2 = fifthImplement(age = 29, name = "Limpat Prananda", address = "Sidoarjo", operation = {
        name, age ->
        "Manually Implement  { name: $name | age: ${age.toString()} }"
    })

//    println(first)
//    println(second)
//    println(third)
//    println(fourth)
//    println(fourth2)
//    println(fourth3)
//    println(fifth)
    println(fifth2)
}

//normal function
fun firstImplement(name: String, age: Int): String{
    return "firstImplement { name: $name | age: ${age.toString()} }"
}

//singleline function
fun secondImplement(name: String, age: Int) = "secondImplement { name: $name | age: ${age.toString()} }"

//function as lamda
val thirdImplement: (name: String, age: Int) -> String = { s: String, i: Int ->
    "thirdImplement { name: $s | age: ${i.toString()} }"
}

fun fourthImplement(name: String, age: Int, operation: (name: String, age: Int) -> String): String{
    return "fourthImplement { name: $name | age: ${age.toString()} | ${operation(name, age)}}"
}

fun fifthImplement(name: String, age: Int, operation: (name: String, age: Int) -> String, address: String): String{
    return "fifthImplement { name: $name | age: ${age.toString()} | ${operation(name, age)} | address: $address}"
}