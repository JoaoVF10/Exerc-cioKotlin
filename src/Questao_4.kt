fun <T> ContLetras(list: List<T>): List<Pair<Int, T>> {
    if (list.isEmpty()) {
        return emptyList()
    }

    val CodeList = mutableListOf<Pair<Int, T>>()
    var contador = 0
    var ElementInicial = list[0]

    for (element in list) {
        if (element == ElementInicial) {


        } else {

            CodeList.add(Pair(contador, ElementInicial))


            ElementInicial = element
            contador = 1
        }
    }


    CodeList.add(Pair(contador, ElementInicial))

    return CodeList
}

fun main() {
    val input = "aaaabccaadeeee".toList()
    val result = ContLetras(input)


    println(" $result ")


}

