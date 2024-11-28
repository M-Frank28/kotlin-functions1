fun main (){
//    println(birthdayGreeting(name = "Rover", age =33))
//    println(birthdayGreeting("Rex",25))

    //named argument
    val greeting = birthdayGreeting(name = "Rover", age =33)
    println(greeting)
}

//Defining a function //passed name and age parameter
fun birthdayGreeting( name: String,age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
