package basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_11653_소인수분해
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
public class Simple076 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int a = N; // 인수로 계속 나눠줘야하니까 일단은 N으로 해놓고 반복문에서 a /= i를 해준다.

        stop: //다끝나면 밖으로 탈출해야함 todo 여기는 콜론을 써야함
        while (true){
            if (a == 1) {
                break ; // 잘 나눠져서 a가 1까지 나눠지면 탈출
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0) { // 소인수분해가 된다는 거니 출력
                    System.out.println(i);
                    a /= i;// a 를 i 로 나누고 a에 넣어준다. 그러면 다음a는 인수로 나눠진 몫으로 반복문을 들어옴
                    break;
                }
                if (i == a - 1){ // a-1이 됐는데도 탈출을 못했다 = 이 a는 마지막 인수인 소수이다.
                    System.out.println(a);
                    break stop;// 대탈출
                }
            }
        }

    }
}
