package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_27433_팩토리얼 2
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger sum = new BigInteger("1");
        if (A.equals("0")) {
            System.out.println(1);
        }else {
            for (int i = 1; i <= A.intValue(); i++) {
                BigInteger I = new BigInteger(String.valueOf(i));
                sum = sum.multiply(I) ;
            }
            System.out.println(sum);
        }

    }
}
