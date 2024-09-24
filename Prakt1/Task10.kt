package Prakt1

class Task10 {
    fun Ceasar(str: String, n: Int): String {
        val result = StringBuilder()
        val shift = n % 26

        for (char in str) {
            when {
                char.isLowerCase() -> {
                    val newChar = ((char - 'a' + shift + 26) % 26 + 'a'.toInt()).toChar()
                    result.append(newChar)
                }

                char.isUpperCase() -> {
                    val newChar = ((char - 'A' + shift + 26) % 26 + 'A'.toInt()).toChar()
                    result.append(newChar)
                }

                else -> {
                    result.append(char)
                }
            }

        }
        return result.toString()
    }
}
