package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2884_알람시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int y = Y - 45;

        if (y < 0 && X > 0) {
            System.out.println((X - 1) + " " + (60 + y));
        } else if (y < 0 && X == 0) {
            System.out.println(23 + " " + (60 + y));
        }else {
            System.out.println(X + " " + y);
        }
    }
}
