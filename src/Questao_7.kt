fun gcd(num_1: Int, num_2: Int): Int {

    if (num_2 == 0) {
        return num_1
    }

    return gcd(num_2, num_1 % num_2)
}

fun main() {
    val num_1 = 36
    val num_2 = 63
    val resultado = gcd(num_1, num_2)
    println(" $resultado")
}