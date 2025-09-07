import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        String s = sc.next();

        // 한줄에서 공백으로 구분된 정수 배열 받기
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(i);
        System.out.println(s);
    }
}
