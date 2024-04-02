package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2588_곱셈
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple0010 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String strb = String.valueOf(B);
        String[] strB = strb.split("");
        int first = Integer.parseInt(strB[0]);
        int second = Integer.parseInt(strB[1]);
        int third = Integer.parseInt(strB[2]);
        System.out.println(A*third);
        System.out.println(A*second);
        System.out.println(A*first);
        System.out.println(A*B);


    }
}
