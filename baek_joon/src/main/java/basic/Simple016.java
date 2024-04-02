package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2753_윤년
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 4 == 0 && a % 100 !=0 || a % 400 == 0) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
