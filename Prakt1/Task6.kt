package Prakt1

class Task6 {
    fun Factorial(x: Int):Int{
        if (x == 1 ) return 1
        if (x == 2) return 2
        var Fact = 1
        for (i in 2..x){
            Fact *= i
        }
        return Fact
    }

}