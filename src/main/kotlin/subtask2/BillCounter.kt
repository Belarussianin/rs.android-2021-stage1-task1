package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annaBill = (bill.sum() - bill[k]) / 2
        return if (annaBill == b) {
            "Bon Appetit"
        } else {
            if (annaBill >= b) {
                "${annaBill - b}"
            } else {
                "${b - annaBill}"
            }
        }
    }
}
