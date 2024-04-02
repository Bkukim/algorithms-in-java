package algorithm_basic;

import java.io.*;
import java.util.Scanner;

/**
 * packageName : algorithm_basic
 * fileName : Simple1929
 * author : PC
 * date : 2024-03-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08         PC          최초 생성
 */
public class Simple9012_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // no 인지 yes 인지를 판별해줄 변수 sum, 0이면 yes 이고 0이 아니면 no
        int sum ;
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            String[] strArr = str.split("");
            sum = 0;

            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("(")) {
                    sum += 1;
                } else if (strArr[j].equals(")")) {
                    sum += -1;
                    if (sum == -1) {
                        System.out.println("NO");
                        break;
                    }
                }
                // -1이 되는 순가 )가 먼저 들어온거라 무조건 no
//                if (sum == -1) {
//                    return;
//                }
            }
            // 반복문이 다 돌고 sum이 만들어지면 no인지yes인지 판단
            if (sum == 0) {
                System.out.println("YES");
            }else if(sum == -1){// -1이면 이미  no가 출력되서 아무것도 안 출력되게 해야한다.

            }else {
                System.out.println("NO");
            }

        }
    }
}
