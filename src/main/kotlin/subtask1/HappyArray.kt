package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        var sadArray2 = sadArray
        val newArray = arrayListOf(sadArray[0])
        var left: Int

        while (true) {
            left = 0
            for (i in 1 until sadArray2.lastIndex) {
                if (sadArray2[i] <= (sadArray2[left] + sadArray2[i + 1])) {
                    newArray.add(sadArray2[i])
                    left = i
                }
            }
            newArray.add(sadArray2[sadArray2.lastIndex])
            if (newArray.size < sadArray2.size) {
                sadArray2 = newArray.toIntArray()
                newArray.clear()
                newArray.add(sadArray2[0])
            } else {
                return newArray.toIntArray()
            }
        }
    }
}