package basic;



import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_2908_상수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        String[] strA = a.split("");
        String[] strB = b.split("");

        String c = "";
        c = strA[0];
        strA[0] = strA[2];
        strA[2] = c;

        c = "";
        c = strB[0];
        strB[0] = strB[2];
        strB[2] = c;

        String resultA = "";
        String resultB = "";
        for (int i = 0; i < strA.length; i++) {
            resultA += strA[i];
        }for (int i = 0; i < strB.length; i++) {
            resultB += strB[i];
        }

        int finalA = Integer.parseInt(resultA);
        int finalB = Integer.parseInt(resultB);

        if (finalB > finalA) {
            System.out.println(finalB);
        }else {
            System.out.println(finalA);
        }
    }
}
