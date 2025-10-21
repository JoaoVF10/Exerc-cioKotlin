
sealed interface Tree<out T>

data class Node<out T>(val value: T, val left: Tree<T> = End, val right: Tree<T> = End) : Tree<T> {
    override fun toString(): String {
        val children = if (left == End && right == End) "" else " $left $right"
        return "T($value$children)"
    }
}

val End = object : Tree<Nothing>{
    override fun toString() = "."
}


fun <T : Comparable<T>> Tree<T>.insert(newValue: T): Tree<T> = when (this) {

    is End -> Node(newValue)


    is Node<T> -> {
        if (newValue < this.value) {

            Node(this.value, left.insert(newValue), this.right)
        } else if (newValue > this.value) {

            Node(this.value, this.left, right.insert(newValue))
        } else {

            this
        }
    }
}


fun main() {
    var bst: Tree<Int> = End
    bst = bst.insert(50)
    bst = bst.insert(30)
    bst = bst.insert(70)
    bst = bst.insert(20)
    bst = bst.insert(40)
    println(bst)

}