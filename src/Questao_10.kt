
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


fun <T> Tree<T>.leafCount(): Int = when (this) {

    is End -> 0


    is Node<T> -> {

        if (left == End && right == End) {
            1
        } else {

            left.leafCount() + right.leafCount()
        }
    }
}


fun main() {

    val tree1 = Node("x", Node("y"), End)

    println(" ${tree1.leafCount()}")


}