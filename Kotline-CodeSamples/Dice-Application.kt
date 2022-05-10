fun main() {
    val age = 4
    val layers = 6
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}
//there is comment added to this code 

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
          print(",")
    }    
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}


fun main() {
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: ${randomNumber}")
    repeat(diceRange.last()){
        println("Random number: ${randomNumber}")
        }
    println("max dicerange "+ diceRange.last())
}

//my version
fun main() {
    val myFirstDice = Dice(6)
   
    var myRoll = myFirstDice.roll()
     println("Your dice have "+ myFirstDice.numSides+" sides It rolled to "+myRoll)
         //myFirstDice.sides = 20
         myRoll = myFirstDice.roll()
     println("Your dice have "+ myFirstDice.numSides+" Sides. It rolled to "+myRoll)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
}

class Dice (val numSides: Int) {
    //var sides = 6
    fun roll(): Int {
       val randomNumber = (1..numSides).random()
       return randomNumber
    }
}

// Best practice below:
fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}