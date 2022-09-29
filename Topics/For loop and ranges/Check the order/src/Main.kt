fun main() {
    // write your code here
    val qty = readln().toInt()
    val inArr = arrayListOf<Int>()
    repeat(qty) {
        inArr.add(readln().toInt())
    }

    if (inArr == inArr.sorted()) {
        println("YES")
    } else {
        println("NO")
    }
}
