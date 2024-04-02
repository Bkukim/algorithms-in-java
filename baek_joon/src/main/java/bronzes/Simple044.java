package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_10039_평균 점수
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple044 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int sum = 0;
       int avg;
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            if (a < 40) {
                a = 40;
            }
            sum += a;
        }
        avg = (sum/5);
        System.out.println(avg);
    }
}
