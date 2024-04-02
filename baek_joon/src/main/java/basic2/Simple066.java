package basic2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2720_세탁소 사장 동혁
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
public class Simple066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int T = scanner.nextInt();
       int[][] arr = new int[T][4];
        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt();
            // c가 25로 나뉘어서 나머지와 몫을 구한다.
            // 나머지를 10으로 나뉘어서 나머지와 몫을 구한다.
//            나머지를 5로 나워서 나머지와 몫을 구한다.
//            나머지 만큼 센트를 준다.

            int rest25 = C % 25;
            int ratio25 = C / 25;
            int rest10 = rest25 % 10;
            int ratio10 = rest25 / 10;
            int rest5 = rest10 % 5;
            int ratio5 = rest10 / 5;
            int rest1 = rest5 % 1;
            int ratio1 = rest5 / 1;

            int[] ratios = {ratio25, ratio10, ratio5, ratio1};


            for (int j = 0; j < 4; j++) {
               arr[i][j] = ratios[j];
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
