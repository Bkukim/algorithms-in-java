package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_14581_팬들에게 둘러싸인 홍준
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.next();

        System.out.println(":fan::fan::fan:\n" +
                ":fan::"+ id +"::fan:\n" +
                ":fan::fan::fan:");
    }
}
