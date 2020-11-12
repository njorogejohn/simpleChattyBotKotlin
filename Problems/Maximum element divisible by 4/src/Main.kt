import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val length = scanner.nextInt()
    var result = 0
    repeat(length) {
        val number = scanner.nextInt()
        result = if (number.rem(4) == 0) max(result, number) else result
    }
    println(result)
}