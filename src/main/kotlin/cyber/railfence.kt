package cyber

fun main(args: Array<String>) {
    print("Enter the word to encode: ")
    val input = readlnOrNull()

    val oddLetters: String = input?.filterIndexed { index, c ->
        index % 2 == 0
    }.toString()

    val evenLetters: String = input?.filterIndexed { index, c ->
        index % 2 == 1
    }.toString()

    println("Encrypted word: ${oddLetters + evenLetters}")
}