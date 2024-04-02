package retry;

import java.util.Scanner;

/**
 * packageName : retry
 * fileName : Re2525
 * author : PC
 * date : 2024-01-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-27         PC          최초 생성
 */
public class Re2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int plusM = scanner.nextInt();

        int afterM = m + plusM;
        int restM = afterM % 60;
        int plusH = afterM / 60;
        int restH = (h+plusH) % 24;

        if (afterM >= 60 && h+plusH <= 23) {
            System.out.println((h+plusH) + " " + restM);
        } else if (afterM >= 60 && h+plusH >= 24) {
            System.out.println(restH + " " + restM);
        }else {
            System.out.println(h + " " + (m+plusM));
        }
    }
}
