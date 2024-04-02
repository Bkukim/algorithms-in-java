package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_10156_과자
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple049 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < K*N) {
            System.out.println(-1*(M - (K*N)));
        }else {
            System.out.println(0);
        }
    }
}
