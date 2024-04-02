package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_19532_수학은 비대면강의입니다
 * author : PC
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15        PC          최초 생성
 */
public class Simple087 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int x = 0;
        int y = 0;
        stop:
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a*i + b*j == c && d*i + e*j == f) {
                    x=i;
                    y=j;
                    break stop;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
