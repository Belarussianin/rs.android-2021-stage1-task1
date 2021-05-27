package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        var counter: Int
        var temp: Int
        val result = arrayListOf<String>()
        val signs = arrayOf('<', '>', '(', ')', '[', ']')

        for (i in 0..inputString.lastIndex) {
            for (sign in signs.indices step 2) {
                when (inputString[i]) {
                    signs[sign] -> {
                        counter = 0
                        temp = i + 1
                        for (k in i..inputString.lastIndex) {
                            if (inputString[k] == signs[sign]) {
                                counter += 1
                            }
                            if (inputString[k] == signs[sign + 1]) {
                                counter -= 1
                                if (counter == 0) {
                                    result.add(inputString.substring(temp until k))
                                    break
                                }
                            }
                        }
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
