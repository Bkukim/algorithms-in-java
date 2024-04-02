package basic2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2750_수 정렬하기
 * author : PC
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15        PC          최초 생성
 */
public class Simple091 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int[] aArr = new int[N];
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            aArr[i] = a;
        }
        Arrays.sort(aArr);
        for (int i : aArr) {
            System.out.println(i);
        }
    }
}
