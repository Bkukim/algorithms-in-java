package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         PC          최초 생성
 */
public class Simple009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;true;) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b == 0 && a == 0) {
                scanner.close();
                break;
            }

            if (a > b) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


    }
}
