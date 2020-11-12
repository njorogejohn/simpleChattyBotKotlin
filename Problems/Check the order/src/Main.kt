import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val length = scanner.nextInt()
    val numbers = IntArray(length) { scanner.nextInt() }
    var message = "YES"

    numbers.forEachIndexed { index, value ->
        if (index + 1 != length && numbers[index + 1] < value) message = "NO"
    }

    println(message)
}