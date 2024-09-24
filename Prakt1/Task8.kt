package Prakt1

class Task8 {
    fun FindMinimal(list: List<Int>): Int {
        var minimal = list[0]
        for (i in list) {
            if (i < minimal) {
               minimal = i
            }
        }
        return minimal
    }
}