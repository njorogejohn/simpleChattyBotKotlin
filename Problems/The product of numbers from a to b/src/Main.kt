import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val (a, b) = Array(2) { scanner.nextInt() }
    var product: Long = 1
    for (i in a until b) {
        product *= i
    }
    println(product)
}