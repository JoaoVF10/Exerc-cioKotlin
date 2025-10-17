fun last(list: List<Int>): Int{

    if (list.isEmpty()){
        throw NoSuchElementException("A lista está vazia")
    }
    val ultimonumero =list.size -1

    return list[ultimonumero]
}


fun main() {

    val lista = listOf(1, 1, 2, 3, 5, 8)

    val resultado = last(lista)

    println(resultado)
}