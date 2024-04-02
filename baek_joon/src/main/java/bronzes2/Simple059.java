package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_24723_녹색거탑
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int multi = 1;
        for (int i = 0; i < a; i++) {
            multi *= 2;
        }
        System.out.println(multi);
    }
}
