package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_5073_삼각형과 세 변
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
public class Simple083 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // 조건문으로
        while (true){
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            if (X == 0 && Y == 0 && Z == 0) {
                break;
            }
            if (X > Y && X > Z && Y != Z && Y + Z > X) { // X가 최댓값이면서 삼각형 만족
                System.out.println("Scalene");
            } else if (Y > X && Y > Z && X != Z && X + Z > Y) {// Y가 최댓값이면서 삼각형 만족
                System.out.println("Scalene");
            } else if (Z > Y && Z > X && Y != X && Y + X > Z) {// Z가 최댓값이면서 삼각형 만족
                System.out.println("Scalene");
            } else if (X == Y && Y == Z) { // 다 같으면 무조건 삼각형
                System.out.println("Equilateral");
            } else if (X == Y && X+Y > Z) { // 이등변 삼각형
                System.out.println("Isosceles");
            } else if (Y == Z && Y+Z > X) { // 이등변 삼각형
                System.out.println("Isosceles");
            } else if (Z == X && Z+X > Y) { // 이등변 삼각형
                System.out.println("Isosceles");
            }else { // 나머지는 삼각형이 아님
                System.out.println("Invalid");
            }
        }
    }
}
