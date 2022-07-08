fun main() {
    val fido = Dog("Fido")
    fido.bark()

    for (n in 1 until 10) {
        println(fibonacci(n))
    }

}

private fun fibonacci(n: Int): Int {
    var (a, b, temp) = arrayOf(0, 1, 0)

    for (i in 1 until n) {
        // a, b = b, a + b
        temp = a
        a = b
        b = a + temp
    }

    return b
}