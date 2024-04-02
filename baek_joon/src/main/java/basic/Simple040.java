package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_1546_평균
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tnt
        int N =scanner.nextInt();
        int M = 0;
        int[] arr = new int[N];
        double[] arr1 = new double[N];
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            // 배열에 들어오는 수 집어넣기
            arr[i] = X;
//            최댓값 만들기
            if (M < X) {
                M = X;
            }
        }
        for (int i = 0; i < N; i++) {
            arr1[i] = ((double)arr[i]) / M * 100;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr1[i];
        }
        double avg = (double) sum / N;
        System.out.println(avg);
    }
}
