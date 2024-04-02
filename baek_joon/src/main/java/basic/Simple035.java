package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_10810_공 넣기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        // 입력 M번
        for (int i = 0; i < M; i++) {
        int I =scanner.nextInt(); // I번 바구니 부터
        int J =scanner.nextInt(); // X번 바구니 까지
        int K =scanner.nextInt(); // 번호 K의 공을 넣는다.

            for (int j = I-1; j < J ; j++) {
                arr[j] = K;
            }

        }

        // 출력 N번
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}