fun main() {
    // write your code here
    val inList = List(readln().toInt()) { readln().toInt() }
    val list = inList.sortedDescending()
    if (inList.size == 1) {
        println(list[0])
    } else {
        println(list[0] * list[1])
    }
}