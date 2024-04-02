package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_10101_삼각형 외우기
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
public class Simple082 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        if (X+Y+Z == 180) {
            if (X == 60 && Y == 60 && Z == 60) {
                System.out.println("Equilateral");
            } else if (X == Y || X == Z || Y == Z) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }else {
            System.out.println("Error");
        }
    }
}
