package basic;


import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_2566_최댓값
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple061 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int x = scanner.nextInt();
                arr[i][j] = x;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (max < arr[i][j]) {
                    max = arr[i][j];
                    a=i+1;
                    b=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(a+ " " + b);
    }
}
