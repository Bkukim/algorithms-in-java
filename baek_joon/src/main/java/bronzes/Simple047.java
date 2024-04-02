package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_2530_인공지능 시계
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple047 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
         int A = scanner.nextInt();
         int B = scanner.nextInt();
         int C = scanner.nextInt();
         int D = scanner.nextInt();

         int plusMin = (C+D) / 60;
         int remainSec = (C+D) % 60;
         int resultMin = B + plusMin;

         int plusHour = resultMin / 60;
         int remainMin = resultMin % 60;
         int resultHour = A + plusHour;

         int remainHour = resultHour % 24;

        if (plusMin >= 1 && resultMin < 60) { // 분이 시간에 영향을 미치지 않는 경우
            System.out.println(A + " " + resultMin + " " + remainSec);
        } else if (resultMin >= 60 && resultHour < 24) {// 분이 시간에 영향을 미치지만 시간이 하루를 넘기지 않을 때
            System.out.println(resultHour + " " + remainMin + " " + remainSec);
        }else if ( resultHour >= 24) { // 하루를 넘길 때
            System.out.println(remainHour + " " + remainMin + " " + remainSec);
        }else { // 초가 60을 넘지 않을 때
            System.out.println(A + " " + B + " " + (C+D));
        }

    }
}
