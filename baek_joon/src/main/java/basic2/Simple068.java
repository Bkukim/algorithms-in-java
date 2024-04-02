package basic2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2292_벌집
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
public class Simple068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 구하고 싶은 수 = x.
        int i = 1;
        int result = 0;
        int N = scanner.nextInt();
        int n = N-1;// i*6-6(열마다 칸의 증가 규칙) 에 첫번째 1을 넣으면 0이된다. 근데 1을 빼줘야하므로 미리 N에 1을 빼준다.
        int count = 0;
            //무한루프로 돌렸다. 왜 돌렸냐 숫자가 몇이 나올지 모르니까...

        for (;true;) {
            if (n <= i*6-6) {// <=를 해줘야하는 이유는 만약에 <을 하고 8, 19같이 딱 맞아 떨어질때 탈출하지 않으면 i가 또 올라가고 n-1은 음수가 된다. 역설
                break;
            }//뺄수보다 빼는 수가 많으면 반복문 탈출
            n -= (i*6-6);// 계속 빼고 뺀 횟수가 우리가 구하려는 x
            i++;
        }
        System.out.println(i);
//        i=0 ->

    }
}
