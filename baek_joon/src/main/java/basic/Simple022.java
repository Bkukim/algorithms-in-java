package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_10950_A+B - 3
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        String result ="";
        for (int i = 0; i < z; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            result += (x + y) + "\n";
        }
        System.out.println(result);
    }
}