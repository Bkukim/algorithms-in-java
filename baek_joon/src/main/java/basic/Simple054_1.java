package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_2444_별 찍기 - 7
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple054_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("*");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (i)*4; j+=2) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
