package Prakt1

class Task9 {
    fun isPolidrom(str: String): Boolean{
       val cleanstr = str.lowercase().replace(" ","")


     return cleanstr == cleanstr.reversed()
    }
}