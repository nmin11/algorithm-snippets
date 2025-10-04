fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[low]
    var i = low - 1
    var j = high + 1

    while (i < j) {
        do {
            i++
        } while (arr[i] < pivot)

        do {
            j--
        } while (arr[j] > pivot)

        if (i >= j) return j

        arr[i] = arr[j].also { arr[j] = arr[i] }
    }

    return j
}

fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pointer = partition(arr, low, high)

        quickSort(arr, low, pointer)
        quickSort(arr, pointer + 1, high)
    }
}
