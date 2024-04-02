package basic;


import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_2738_행렬 덧셈
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple060 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int N = scanner.nextInt();
       int M = scanner.nextInt();
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] AB = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int x = scanner.nextInt();
                A[i][j] = x;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int x = scanner.nextInt();
                B[i][j] = x;
            }
        }
//        System.out.println(":::" + Arrays.deepToString(A));

        for (int i = 0; i < AB.length; i++) {
            for (int j = 0; j < AB[i].length; j++) {
                AB[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < AB.length; i++) {
            for (int j = 0; j < AB[i].length; j++) {
                System.out.print(AB[i][j] + " ");
            }
            System.out.println();
        }

    }
}
