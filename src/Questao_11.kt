
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

fun <T> Tree<T>.leafValues(): List<T> = when (this) {
    is End -> emptyList()
    is Node<T> -> {
        if (left == End && right == End) {
            listOf(this.value)
        } else {

            left.leafValues() + right.leafValues()
        }
    }
}



fun main() {
    val treeExample = Node(
        "a",
        Node("b"),
        Node(
            "c",
            Node("d"),
            Node("e")
        )
    )

    val resultado = treeExample.leafValues()
    println("Árvore: $treeExample")

}