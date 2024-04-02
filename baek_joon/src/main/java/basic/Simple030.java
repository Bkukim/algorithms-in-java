package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_10952_A+B - 5
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple030 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result ="";
        while (true){

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            result += (x+y) + "\n";

        }
        System.out.println(result);


    }
}