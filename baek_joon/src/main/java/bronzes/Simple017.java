package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_2338_긴자리 계산
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numA = scanner.nextBigInteger();
        BigInteger numB = scanner.nextBigInteger();
        System.out.println(numA.add(numB));
        System.out.println(numA.subtract(numB));
        System.out.println(numA.multiply(numB));

    }
}
