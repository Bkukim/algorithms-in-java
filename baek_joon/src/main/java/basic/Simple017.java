package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_14681_사분면 고르기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
    }
}
