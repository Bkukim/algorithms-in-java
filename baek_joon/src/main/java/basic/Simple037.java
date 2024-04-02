package basic;


import java.util.Scanner;


/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_5597_과제 안 내신 분..?
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple037 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
//     '배열을 만들고 값을 넣어 주지 않은 칸에는 0이다'라는 특성을 이용해야한다.
        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = scanner.nextInt();
            arr[n-1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}