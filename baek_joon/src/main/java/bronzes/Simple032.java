package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_13277_큰 수 곱셈
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.multiply(B));
    }
}
