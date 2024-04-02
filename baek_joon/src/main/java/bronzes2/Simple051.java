package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_25596_시험 점수
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        int a6 = scanner.nextInt();
        int a7 = scanner.nextInt();

        int sum = a + a1 + a2 + a3;
        int sum2 = a4 + a5 + a6 + a7;


        if (sum >= sum2) {
            System.out.println(sum);
        }else {
            System.out.println(sum2);
        }
    }
}
