package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_27866_문자와 문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i = scanner.nextInt();

        char char1 = str.charAt(i-1);

        System.out.println(char1);
    }
}
