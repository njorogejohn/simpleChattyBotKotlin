import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val length = scanner.nextInt()
    var result = 0
    for (i in 1..length) {
        result += scanner.nextInt()
    }
    println(result)

}