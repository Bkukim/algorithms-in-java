package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_25311_UCPC에서 가장 쉬운 문제 번호는?
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple039 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            int a = str.length();
            if (a <= 9 && a >= 6) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
