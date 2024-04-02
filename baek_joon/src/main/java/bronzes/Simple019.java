package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_15964_이상한 기호
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple019 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();


        System.out.println((A.add(B)).multiply(A.subtract(B)));
    }
}
