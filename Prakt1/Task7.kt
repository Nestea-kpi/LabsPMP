package Prakt1

class Task7 {
    fun AnalysOfStroke(str: String): Map<Char,Int>{
        val Count = mutableMapOf<Char, Int>()

        for (char in str){
            Count[char] = Count.getOrDefault(char, 0) + 1
        }
    return Count
    }
    fun getJsonOutput(str: String): String {
        val occurrences = AnalysOfStroke(str)
        return occurrences.entries.joinToString(prefix = "{", postfix = "}") {
            "\"${it.key}\": ${it.value}"
        }
    }
}