fun main() {
    val i = readLine()!!.toInt()
    val s = readLine()!!

    // 한줄에서 공백으로 구분된 정수 배열 받기
    val nums = readLine()!!.split(" ").map { it.toInt() }

    println(i)
    println(s)
}
