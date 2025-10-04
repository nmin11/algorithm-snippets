fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    val leftSize = mid - left + 1
    val rightSize = right - mid

    val leftArr = IntArray(leftSize)
    val rightArr = IntArray(rightSize)

    for (i in 0 until leftSize) leftArr[i] = arr[left + i]
    for (i in 0 until rightSize) rightArr[i] = arr[mid + 1 + i]

    var i = 0
    var j = 0
    var k = left
    while (i < leftSize && j < rightSize) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k] = leftArr[i]
            i++
        } else {
            arr[k] = rightArr[j]
            j++
        }

        k++
    }

    while (i < leftSize) {
        arr[k] = leftArr[i]
        i++
        k++
    }

    while (j < rightSize) {
        arr[k] = rightArr[j]
        j++
        k++
    }
}

fun mergeSort(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val mid = left + (right - left) / 2

        mergeSort(arr, left, mid)
        mergeSort(arr, mid + 1, right)

        merge(arr, left, mid, right)
    }
}
