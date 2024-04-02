package basic2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_9506_약수들의 합
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
public class Simple073 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
          while (true){
              ArrayList<Integer> arr = new ArrayList<>();
              int sum = 0;
              int a = scanner.nextInt();
              if (a == -1) {
                  break;
              }
              for (int i = 1; i <= a; i++) {
                  if (a % i == 0) {
                        arr.add(i);
                  }
              }

              for (int i = 0; i < arr.size()-1; i++) {
                  sum += arr.get(i);
              }

              if (sum == a) {
                  System.out.print(a + " = ");
                  for (int i = 0; i < arr.size()-1; i++) {
                      if (i == arr.size()-2) {
                          System.out.println(arr.get(i));
                      }else {
                          System.out.print(arr.get(i) + " + ");
                      }
                  }
              }else {
                  System.out.println(a + " is NOT perfect.");
              }

          }
    }
}
