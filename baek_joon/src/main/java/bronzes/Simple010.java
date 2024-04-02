package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-01
 * description :백준_1271_엄청난 부자2
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         PC          최초 생성
 */
public class Simple010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           BigInteger a = new BigInteger(scanner.next());
           BigInteger b = new BigInteger(scanner.next());


        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}
