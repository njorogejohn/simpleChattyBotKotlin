import java.util.*

// write your function here
fun isVowel(letter: Char): Boolean = letter in "aeiou"

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter.toLowerCase()))
}