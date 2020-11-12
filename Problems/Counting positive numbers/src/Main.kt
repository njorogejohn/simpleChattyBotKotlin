import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val length = scanner.nextInt()
    var count = 0
    repeat(length) {
        count += if (scanner.nextInt() > 0) 1 else 0
    }
    println(count)
}