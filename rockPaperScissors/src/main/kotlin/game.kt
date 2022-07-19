fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)

    options.forEach {print(it)}
}

fun getGameChoice(optionParam: Array<String>): () -> Unit = {
    //optionParam[(Math.random() * optionParam.size).toInt()]
    optionParam[2] = "Knife"
}