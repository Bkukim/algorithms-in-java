package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_2752_세수정렬
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple046 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        if (arr[0] > arr[1]) {
            int a = arr[0];
            arr[0] = arr[1];
            arr[1] = a;
        }if (arr[1] > arr[2]) {
            int a = arr[1];
            arr[1] = arr[2];
            arr[2] = a;
        }if (arr[0] > arr[1]) {
            int a = arr[0];
            arr[0] = arr[1];
            arr[1] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
