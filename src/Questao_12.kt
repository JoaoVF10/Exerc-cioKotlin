
sealed interface Tree<out T>

data class Node<out T>(
    val value: T,
    val left: Tree<T> = End,
    val right: Tree<T> = End
) : Tree<T> {

    override fun toString(): String {
        val children = if (left == End && right == End) "" else " $left $right"
        return "T($value$children)"
    }
}

val End = object : Tree<Nothing>{
    override fun toString() = "."
}


fun <T> Tree<T>.convertToString(): String = when (this) {

    is End -> ""


    is Node<T> -> {

        val valor = this.value.toString()


        val esquerdo = this.left.convertToString()
        val direito = this.right.convertToString()


        if (esquerdo.isEmpty() && direito.isEmpty()) {
            valor
        }

        else {
            "$valor($esquerdo,$direito)"
        }
    }
}


fun main() {

    val treeExemplo = Node(
        "a",
        Node(
            "b",
            Node("d"),
            Node("e")
        ),
        Node(
            "c",
            End,
            Node(
                "f",
                Node("g"),
                End
            )
        )
    )

    val resultado = treeExemplo.convertToString()

    println(" ${treeExemplo}")
    println("$resultado")


}