package Prakt1

class Task2 {
    private fun isPrime(n: Int):Boolean {
        if (n <= 1) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
    fun PrimarySum(): Int {
        var sum = 0
        var i = 2
        val ListOfNumbers: MutableList<Int> = mutableListOf()
        while (ListOfNumbers.size < 5) {
            if (isPrime(i)){
                ListOfNumbers.add(i)
                sum += i
            }
            i++
        }
        return sum
    }
}