fun hashMapUsage() {
    // 선언
    val map = mutableMapOf<String, Int>()

    // 삽입
    map["apple"] = 3

    // 삭제
    map.remove("apple")

    val hasApple = "apple" in map
    val hasThree = map.containsValue(3)

    // key에 대한 카운트 추가
    val key = "banana"
    map[key] = (map[key] ?: 0) + 1
    map.merge(key, 1, Int::plus)

    // 값 일괄 변경
    map.replaceAll { _, v -> v * 2 }

    // 순회
    for ((k, v) in map) {
        println("$k : $v")
    }

    // 크기 조회
    val size = map.size

    // 비어있는지 여부 조회
    val isEmpty = map.isEmpty()

    // 초기화
    map.clear()
}
