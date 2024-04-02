package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_0807_개수 세기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int arr[] = new int[x];
        int count = 0;

        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }
        int y = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == y) {
                count++;
            }
        }
        System.out.println(count);
    }
}