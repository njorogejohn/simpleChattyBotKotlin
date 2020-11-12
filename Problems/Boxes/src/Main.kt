import java.util.*
import kotlin.math.min
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val (x1,y1,z1) = Array(3) { scanner.nextInt() }.sortedArrayDescending()
    val (x2,y2,z2) = Array(3) { scanner.nextInt() }.sortedArrayDescending()

    println(
        if (x1*y1*z1 == x2*y2*z2) "Box 1 = Box 2"
        else if (x1 >= x2 && y1 >= y2 && z1 >= z2) "Box 1 > Box 2"
        else if (x1 <= x2 && y1 <= y2 && z1 <= z2) "Box 1 < Box 2"
        else "Incomparable"
    )
}