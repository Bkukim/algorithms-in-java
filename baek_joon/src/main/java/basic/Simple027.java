package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_11022_A+B - 8
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple027 {
    public static void main(String[] args) {
        // n을 8로 나눌때 나머지가 4이면 long을 n/8만큼 찍고 int 1개
        // 나머지가 0이면 n/8만큼 찍기
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            result += "Case #" + i + ": " + x + " + " + y + " = " +  (x+y) + "\n";

        }
        System.out.println(result);

    }
}