package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        val oldArray = sadArray.reversedArray()
        val newArray = arrayListOf(oldArray[0])
        var left = 0

        for (i in 1 until oldArray.lastIndex) {
            if (oldArray[i] <= (oldArray[left] + oldArray[i + 1])) {
                newArray.add(oldArray[i])
                left = i
            }
        }
        newArray.add(oldArray[oldArray.lastIndex])
        return newArray.toIntArray().reversedArray()
    }
}
