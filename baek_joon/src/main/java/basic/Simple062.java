package basic;


import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_10798_세로읽기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple062 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[][] strArr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String str = scanner.next();
            String[] strArr1 = str.split("");
            for (int j = 0; j < strArr1.length; j++) {
                strArr[i][j] = strArr1[j];
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (strArr[j][i] == null) {
                    System.out.print("");
                }else {System.out.print(strArr[j][i]);}
            }
        }
    }
}
