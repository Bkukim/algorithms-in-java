package basic2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2501_약수 구하기
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
public class Simple072 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            int N = scanner.nextInt();
            int K = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr.add(i) ;
                //[1,2,3,6]
            }
        }
        if(arr.size() < K) {
            System.out.println(0);
        }else {
            System.out.println(arr.get(K-1));
        }
    }
}
