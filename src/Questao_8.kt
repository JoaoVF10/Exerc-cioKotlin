fun Int.isPrime(): Boolean {
    if (this <= 1) {
        return false
    }


    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

fun listPrimesInRange(range: IntRange): List<Int> {
    val primes = mutableListOf<Int>()
    for (number in range) {
        if (number.isPrime()) {
            primes.add(number)
        }
    }
    return primes
}

fun main() {
    val range = 7..31
    val resultado = listPrimesInRange(range)
    println(resultado)

}