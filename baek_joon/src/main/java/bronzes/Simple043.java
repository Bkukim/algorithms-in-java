package bronzes;


import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_10808_알파벳 개수
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple043 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       String str = scanner.next();
       String[] strArr = str.split(""); // 들어오는 문자 배열
       int[] alphabet = new int[26]; // 알파벳 개수 배열
       char[] small = new char[26]; // 알파벳 배열
        String[] alphabet2 = new String[26]; // 알파벳 문자열 배열
        // 배열에 알파벳 넣기
        for (int i = 0; i < 26; i++) {
            small[i] = (char) ('a'+i);
        }
        // char을 String으로 바꾸기
        for (int i = 0; i < small.length; i++) {
            alphabet2[i] = String.valueOf(small[i]);
        }
        // 알파벳 개수만큼 배열에 숫자 넣기
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < small.length; j++) {
                if (strArr[i].equals(alphabet2[j])) {
                    alphabet[j] += 1;
                }
            }
        }
        // 결과 출력
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
