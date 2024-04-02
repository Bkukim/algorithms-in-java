package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_5717_상근이의 친구들
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            int M = scanner.nextInt();
            int F = scanner.nextInt();

            if (M == 0 && F == 0) {
                break;
            }
            System.out.println(M+F);
        }
    }
}
