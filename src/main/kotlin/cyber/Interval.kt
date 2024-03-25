package cyber

fun main(args: Array<String>) {
    val str = "A-Y"
    val range = str.split("-")
    for (i in range[0].first().code..range[1].first().code) {
        print(Char(i) + " ")
    }
}