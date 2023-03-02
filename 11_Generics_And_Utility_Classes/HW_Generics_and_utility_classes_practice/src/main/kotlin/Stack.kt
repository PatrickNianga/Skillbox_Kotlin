class Stack<T> {

    private val stackList= mutableListOf<T>()

    fun push(item: T) = stackList.add(item)
    fun pop(): T? {
        val item = stackList.lastOrNull()
        if (!isEmpty())
            stackList.removeAt(stackList.size - 1)
        return item
    }
    fun peek() : T? = stackList.lastOrNull()
    fun isEmpty() =  stackList.isEmpty()

    fun test() = println(stackList)

}