package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_9086_문자열
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] strArr2 = new String[T];

        for (int i = 0; i < T; i++) {
            String str = scanner.next();

            String[] strArr = str.split("");
            if (strArr.length != 1) {
               strArr2[i] = strArr[0] + "" + strArr[strArr.length-1];
            }else if (strArr.length == 1) {
               strArr2[i] = strArr[0] + "" + strArr[0];
            }
        }
        for (int i = 0; i < strArr2.length; i++) {
            System.out.println(strArr2[i]);
        }
    }
}
