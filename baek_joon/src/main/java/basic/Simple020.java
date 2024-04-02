package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2480_주사위 세개
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3개의 수가 같은지 안 같은지를 구해야한다.
        // 같은 눈이 무엇인지 구해야한다.
        // 다 다르면 최댓값을 구해야한다.

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        if (X == Y && Y == Z){
            System.out.println(10000+X * 1000);
        } else if (X == Y) {
            System.out.println(1000+X*100);
        } else if (Z == Y) {
            System.out.println(1000+Z*100);
        }else if (Z == X) {
            System.out.println(1000+Z*100);
        }else {
            System.out.println(Math.max(Math.max(X,Y),Z)*100);
        }
    }
}
