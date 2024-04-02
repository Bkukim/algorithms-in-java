package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_10987_모음의 개수
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String str = scanner.next();
       String[] strArr = str.split("");
       int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("a") ||
                    strArr[i].equals("e") ||
                    strArr[i].equals("o") ||
                    strArr[i].equals("i") ||
                    strArr[i].equals("u") ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
