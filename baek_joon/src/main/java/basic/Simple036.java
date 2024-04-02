package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_10813_공 바꾸기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        // 배열에 공넣기 N개의 박스
        for (int i = 0; i < N; i++) {
        arr[i] = i+1;
        }

        // 공 M번 바꾸기
        for (int i = 0; i < M; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            int a = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = a;
        }

        // 출력 N번
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}