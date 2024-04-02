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



public class Simple054 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i ; j++) {
                if (i == 0) {

                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        } for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-1-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-2-i; j++) {
                if (i == n-2) {

                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
