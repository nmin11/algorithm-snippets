import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 단일 값 입력
    int i = Integer.parseInt(br.readLine());
    String s = br.readLine();

    // 한줄에 공백으로 구분된 정수 배열 받기
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] nums = new int[n];
    for (int j = 0; j < n; j++) {
        nums[j] = Integer.parseInt(st.nextToken());
    }

    br.close();
}
