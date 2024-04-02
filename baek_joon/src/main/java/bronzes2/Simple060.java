package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_11945_뜨거운 붕어빵
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            String c = scanner.next();
            String[] d = c.split("");
            for (int j = 0; j < b/2; j++) {
                String e = d[j];
                d[j] = d[b-j-1];
                d[b-j-1] = e;
            }
            for (int j = 0; j < d.length; j++) {
                System.out.print(d[j]);
            }
            System.out.println();
        }
    }
}
