fun main() {
    // put your code here
    val start = readln().toInt()
    val finish = readln().toInt()

    for (i in start..finish) {
        println(
            when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i
            }
        )
    }
}
