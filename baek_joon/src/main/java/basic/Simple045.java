package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_11720_숫자의 합
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       String num = scanner.next();
       String[] str = num.split("");

       int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(str[i]);
            sum += a;
        }
        System.out.println(sum);
    }
}
