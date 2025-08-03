import java.util.PriorityQueue;

public class PriorityQueueUsage {
    // 최소 힙 선언
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    // 최대 힙 선언
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    // 요소 삽입, add와 offer는 같은 동작
    minHeap.add(1);
    minHeap.add(2);
    minHeap.add(3);
    minHeap.add(4);
    minHeap.add(5);

    maxHeap.offer(1);
    maxHeap.offer(2);
    maxHeap.offer(3);
    maxHeap.offer(4);
    maxHeap.offer(5);

    minHeap.poll();         // 최소값 꺼내기 (삭제됨)
    minHeap.peek();         // 최소값 꺼내기 (삭제되지 않음)

    maxHeap.poll();         // 최대값 꺼내기 (삭제됨)
    maxHeap.peek();         // 최대값 꺼내기 (삭제되지 않음)

    minHeap.size();         // 큐 크기
    minHeap.remove(3);      // 특정 요소 삭제
    minHeap.contains(4);    // 특정 요소 포함 여부 확인
    minHeap.clear();        // 큐 비우기
    minHeap.toArray();      // 배열 변환
}
