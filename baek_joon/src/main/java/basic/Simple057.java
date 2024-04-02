package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_2941_크로아티아 알파벳
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple057 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            // if 배열i = z && 배열i+1 = "="이면, 배열 i = "z="
            // if 배열i = s && 배열i+1 = "="이면, 배열 i = "s="
            // if 배열i = c && 배열i+1 = "="이면, 배열 i = "z="
            // if 배열i = l && 배열i+1 = "j"이면, 배열 i = "lj"
            // if 배열i = n && 배열i+1 = "j"이면, 배열 i = "nj"

            // 반복문을 한번 더 돌려서 if 배열i = n && 배열i+1 = "j"이면, 배열 i = "nj"
        String[] crL = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = scanner.next();
        String[] strArr = str.split("");
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length-1) {

            }else {
                if (strArr[i].equals("z") && strArr[i + 1].equals("=") ||
                        strArr[i].equals("s") && strArr[i + 1].equals("=") ||
                        strArr[i].equals("c") && strArr[i + 1].equals("=") ||
                        strArr[i].equals("l") && strArr[i + 1].equals("j") ||
                        strArr[i].equals("c") && strArr[i + 1].equals("-") ||
                        strArr[i].equals("d") && strArr[i + 1].equals("-") ||
                        strArr[i].equals("n") && strArr[i + 1].equals("j")) {
                    strArr[i] = strArr[i] + strArr[i + 1];
                    strArr[i + 1] = "";
                }
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length-1) {

            }else {
                if (strArr[i].equals("d") && strArr[i + 1].equals("z=")) {
                    strArr[i] = strArr[i] + strArr[i + 1];
                    strArr[i + 1] = "";
                }
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
