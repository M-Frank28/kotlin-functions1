fun main (){
    println(birthdayGreeting("Rover",30))
    println(birthdayGreeting("Rex",25))
}

//Defining a function //passed name and age parameter
fun birthdayGreeting( name: String,age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
