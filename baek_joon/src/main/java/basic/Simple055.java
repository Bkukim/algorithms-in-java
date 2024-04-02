package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_10988_팰린드롬인지 확인하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple055 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            String str = scanner.next();
            String[] strArr = str.split("");
            int count = 0;
        for (int i = 0; i < strArr.length/2; i++) {
            if (strArr[i].equals(strArr[strArr.length-1-i])) {
                count++;
                if (i == strArr.length/2-1) {
                    break;
                }
            }else {

            }
        }
        if (count == strArr.length/2) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
