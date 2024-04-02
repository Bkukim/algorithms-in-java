package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_3052_나머지
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 숫자를 받고 이거를 반복해서 나머지를 구한다. 조건문에서 하나씩 같은 수가 있는 지를 비교한다.
        int[] arr = new int[10];
        int count = 0;
        int[] arr42 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            arr42[i] = a % 42;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr42[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            arr[i] = arr42[i];
        }
        System.out.println(10-count);
    }
}