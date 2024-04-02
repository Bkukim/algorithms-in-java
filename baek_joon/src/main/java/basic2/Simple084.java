package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_24313_알고리즘 수업 - 점근적 표기 1
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
public class Simple084 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // n이 n0보다 크거나 같을때 a1*n + a0 <= c*n
        // 7n + 8 <= 9n

        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        int count = 0;
        for (int i = n0; i <= 100; i++) {
            if (a1*i + a0 <= c*i) {
                count++;
            }
        }
        if (count == 101 - n0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
