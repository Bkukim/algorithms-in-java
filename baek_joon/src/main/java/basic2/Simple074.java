package basic2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_1978_소수 찾기
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
public class Simple074 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

       int N = scanner.nextInt();
       int count = 0;
        for (int i = 0; i < N; i++) {
            boolean find = true;
            int A = scanner.nextInt();
            if (A == 1) {
                find = false;
            }else{
                for (int j = 2; j < A; j++) {

                     if (A % j == 0) {
                         find = false;
                     }

                }
            }
            if (find == true) {
                count++;
            }
        }
        System.out.println(count);

    }
}
