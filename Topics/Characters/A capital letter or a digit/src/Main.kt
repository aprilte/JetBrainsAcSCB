fun main() {
    // write your code here
    val inChar = readln().first().toChar()
    println(inChar in 'A'..'Z' || inChar in '1'..'9')
}