/**
 * Dutch National Flag Problem - Sort Colors (LeetCode 75)
 * 
 * 문제: 0, 1, 2로만 이루어진 배열을 한 번의 순회로 정렬
 * 알고리즘: 3개 포인터를 이용한 3-Way 분할
 * 
 * 시간복잡도: O(n) - 단일 순회
 * 공간복잡도: O(1) - 제자리 정렬
 * 
 * 핵심 아이디어:
 * - red: 0들의 경계 (왼쪽 영역)
 * - white: 현재 검사 중인 원소
 * - blue: 2들의 경계 (오른쪽 영역)
 * 
 * 동작 원리:
 * - nums[white] == 0: red와 교환, red와 white 모두 전진
 * - nums[white] == 1: white만 전진 (이미 올바른 위치)
 * - nums[white] == 2: blue와 교환, blue만 후진 (교환된 원소 재검사 필요)
 */

public void sortColors(int[] nums) {
    int red = 0;
    int white = 0;
    int blue = nums.length - 1;

    while (white <= blue) {
        if (nums[white] == 0) {
            int tmp = nums[red];
            nums[red++] = nums[white];
            nums[white++] = tmp;
        } else if (nums[white] == 1) {
            white++;
        } else {
            int tmp = nums[white];
            nums[white] = nums[blue];
            nums[blue--] = tmp;
        }
    }
}
