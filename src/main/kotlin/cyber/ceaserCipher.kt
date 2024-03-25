package cyber

fun main(args: Array<String>) {
    print("Enter the word to encode: ")
    val input = readlnOrNull()

    print("Enter the value to shift: ")
    val shift = readlnOrNull()?.toInt()

    val words = input?.split(" ")

//    val ceaserCipher = input?.map { ch ->
//        shift?.let {
//            (ch.code + shift).toChar()
//        } ?: println("Shift is null")
//    }?.joinToString("")

    var str = "Anastasia"
    println(str.substring(3))

    val ceaserCipher = words?.map {
        input.map { ch ->
            shift?.let {
                (ch.code + shift).toChar()
            } ?: println("Shift is null")
        }.joinToString("")
    }?.joinToString("")

    println("Encrypted word: $ceaserCipher")
}