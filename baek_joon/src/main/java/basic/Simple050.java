package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_5622_다이얼
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] alpha = {{"A", "B", "C" }, {"D", "E", "F" }, {"G", "H", "I" }, {"J", "K", "L" },
                {"M", "N", "O" }, {"P", "Q", "R", "S" }, {"T", "U", "V" }, {"W", "X", "Y", "Z" }};

        String str = scanner.next();
        String[] strArr = str.split("");

        int sum = 0;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                for (int k = 0; k < alpha[j].length; k++) {
                    if (strArr[i].equals(alpha[j][k])) {
                        sum += j+3;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
