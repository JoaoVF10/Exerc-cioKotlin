fun <T> decodeLetras(encodedList: List<Pair<Int, T>>): List<T> {
    val decodedList = mutableListOf<T>()

    for ((contador, element) in encodedList) {

        repeat(contador) {
            decodedList.add(element)
        }
    }

    return decodedList
}
fun main() {
    val input = listOf(
        Pair(4, 'a'),
        Pair(1, 'b'),
        Pair(2, 'c'),
        Pair(2, 'a'),
        Pair(1, 'd'),
        Pair(4, 'e')
    )
    val result = decodeLetras(input)


    println(" $result")


}