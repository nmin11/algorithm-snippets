import java.util.Map;
import java.util.HashMap;

public void hashMapUsage {
    // 선언
    Map<String, Integer> map = new HashMap<>();

    // 삽입
    map.put("apple", 3);

    // 삭제
    map.remove("apple");

    boolean hasApple = map.containsKey("apple");
    boolean hasThree = map.containsValue(3);

    // key에 대한 카운트 추가
    String key = "banana";
    map.put(key, map.getOrDefault(key, 0) + 1);
    map.merge(key, 1, Integer::sum);

    // 값 일괄 변경
    map.replaceAll((k, v) -> v * 2);

    // 순회
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    // 크기 조회
    int size = map.size();

    // 비어있는지 여부 조회
    boolean isEmpty = map.isEmpty();

    // 초기화
    map.clear();
}
