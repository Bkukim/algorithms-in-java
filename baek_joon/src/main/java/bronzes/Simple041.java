package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_27959_초코바
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple041 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int N = scanner.nextInt();
       int M = scanner.nextInt();

        if (N*100 >= M) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
