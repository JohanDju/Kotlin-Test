// Test av main-funksjon

fun main(args: Array<String>) {
    println("Hello world from Kotlin!")

    val a : Int = 4
    val b : Int = 13

    val c : Int = sum(a, b)

    println("The sum of $a and $b is $c")
}

fun sum(a: Int, b: Int) : Int {
    return a + b
}