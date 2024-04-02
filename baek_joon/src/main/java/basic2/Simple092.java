package basic2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2587_대표값2
 * author : PC
 * date : 2024-02-15
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-15        PC          최초 생성
 */
public class Simple092 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] arr = {a,b,c,d,e};
        int avg = (a+b+c+d+e)/5;
        Arrays.sort(arr);
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}
