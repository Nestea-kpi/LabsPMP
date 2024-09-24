package Prakt1

class Task1 {
    fun even_odd(x: Int?): String{
        return when {
            x == null -> ""
            x % 2 ==0 -> "x = $x is even"
            else -> "x = $x is odd"
        }
    }
}