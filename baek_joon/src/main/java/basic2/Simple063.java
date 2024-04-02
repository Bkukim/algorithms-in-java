package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2563_색종이
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
public class Simple063 {
    public static void main(String[] args) {
        // 100*100의 배열을 만든다
        // 숫자가 들어오는 x=i y=j 자리에 1을 넣고 그위로 10개씩 넣는다.
        // 마지막에 배열에 1의 개수를 세어주면 끝


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[100][100];
        int count = 0;

        // 들어오는 숫자부터 +10까지의 자리에 1넣기
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        // 배열에서 1의 갯수 구하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
