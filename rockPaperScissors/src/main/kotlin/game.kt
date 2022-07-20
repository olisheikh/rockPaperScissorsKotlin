fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice.capitalize(), gameChoice)
}

fun getGameChoice(optionParam: Array<String>) =
    optionParam[(Math.random() * optionParam.size).toInt()]

fun getUserChoice(optionParam: Array<String>): String{
    var isValid = false
    var userChoice = ""

    while (!isValid){
        println("Enter one of the following: ")
        for (item in optionParam)
            print(" $item")
        print(".")

        val userInput = readLine()!!
        if (userInput != null){
            isValid = true
            userChoice = userInput
        }else
            print("Choose the valid option.")
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    var result = ""

    if (userChoice == gameChoice)
        result = "tie"
    else if (userChoice == "Paper" && gameChoice == "Rock" ||
             userChoice == "Scissors" && gameChoice == "Paper" ||
             userChoice == "Rock" && gameChoice == "Scissors")
        result = "You win!"
    else
        result = "You lose!"

    println("You choose $userChoice. I choose $gameChoice. $result")
}