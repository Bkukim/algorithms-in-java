package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_25304_영수증
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int sort = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < sort; i++) {
            int price = scanner.nextInt();
            int quan = scanner.nextInt();

            result += price * quan;
        }
        if (result == total) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}