fun <T> ListaIsPalindroma(list: List<T>): Boolean {

    val tamanho = list.size
    for(i in 0 until tamanho / 2){
        if(list[i] != list[tamanho - 1 - i]){
            return false
        }

    }
    return true
}

fun main(){
    val lista = listOf(1, 2, 3, 2, 1)
    println("isPalindrome(${lista}): ${ListaIsPalindroma(lista)}")
}