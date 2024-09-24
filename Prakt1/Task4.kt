package Prakt1

class Task4 {
    fun Fibonnachi (n: Int): Int{
        if (n == 0) return 0
        if (n == 1 ) return 1

        var x = 0
        var y = 1
        var f = 1

        for (i in 2..n){
            f = x + y
            x = y
            y = f
        }
        return f
    }
}