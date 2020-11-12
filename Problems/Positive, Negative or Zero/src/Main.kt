import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number = scanner.nextInt()

    println(if (number == 0) "zero" else if (number < 0) "negative" else "positive")

}