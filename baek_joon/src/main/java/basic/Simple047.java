package basic;


import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_2675_문자열 반복
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] realResult = new String[T];

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String str = scanner.next();
            String[] strArr = str.split("");
            String[][] result = new String[strArr.length][R];
            for (int j = 0; j < strArr.length; j++) {
                for (int k = 0; k < R; k++) {
                    result[j][k] = strArr[j];
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < result[j].length; k++) {
                    sb.append(result[j][k]);
                }
            }
            realResult[i] = sb.toString();

        }
        for (int j = 0; j < realResult.length; j++) {
            System.out.println(realResult[j]);
        }
    }
}
