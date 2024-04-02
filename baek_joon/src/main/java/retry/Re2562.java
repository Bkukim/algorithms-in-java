package retry;

import java.util.Scanner;

/**
 * packageName : retry
 * fileName : Re10807
 * author : PC
 * date : 2024-01-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-27         PC          최초 생성
 */
public class Re2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            arr[i] = X;
        }

        int V = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            if (arr[i] == V) {
                count++;
            }
        }
        System.out.println(count);
    }

}
