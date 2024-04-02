package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_5086_배수와 약수
 * author : PC
 * date : 2024-01-31
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         PC          최초 생성
 */
public class Simple071 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
//                scanner.close();
                break;
            }
            if (a > b && a % b == 0) {
                System.out.println("multiple");
            } else if (b > a && b % a == 0) {
                System.out.println("factor");
            }else {
                System.out.println("neither");
            }
        }
    }
}
