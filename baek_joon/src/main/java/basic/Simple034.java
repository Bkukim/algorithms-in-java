package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2562_최댓값
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[9];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            count++;
            if (arr[i] == max) {
                break;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}