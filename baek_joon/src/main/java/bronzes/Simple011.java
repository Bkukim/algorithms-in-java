package bronzes;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_2744대소문자 바꾸기
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strArr = str.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(strArr[i].toUpperCase())) {
                strArr[i] = strArr[i].toLowerCase();
            } else if (strArr[i].equals(strArr[i].toLowerCase())) {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}
