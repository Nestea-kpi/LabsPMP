package Prakt1

class Task3 {
    fun SumOnes(n: Int): Int{
        var sum = 0
        var Number = 0
        for (i in 1..n){
            Number = Number * 10 + 1
            sum+=Number
        }
        return sum
    }
}