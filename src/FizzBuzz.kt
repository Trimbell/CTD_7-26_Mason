fun main() {
    for (i in 1..100) {
        println(when {
            (i % 15 == 0) -> "FizzBuzz"
            (i % 5 == 0) -> "Buzz"
            (i % 3 == 0) -> "Fizz"
            else -> i
        })
    }
}
