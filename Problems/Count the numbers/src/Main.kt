import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val (a, b, n) = Array(3) { scanner.nextInt() }

    val first = if (a.rem(n) == 0) a else n * (a / n + 1)

    println((b - first) / n + 1)

}
