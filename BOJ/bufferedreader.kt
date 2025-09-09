import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 단일 값 입력
    val i = br.readLine().toInt()
    val s = br.readLine()

    // 한줄에 공백으로 구분된 정수 배열 받기
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())
    val nums = IntArray(n) { st.nextToken().toInt() }
}
