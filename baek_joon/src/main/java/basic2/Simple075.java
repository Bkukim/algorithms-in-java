package basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2581_소수
 * author : PC
 * date : 2024-02-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         PC          최초 생성
 */
public class Simple075 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>(); // 소수가 아닌 수들의 배열
        List<Integer> list2 = new ArrayList<>(); // 자연수 배열

        int sum = 0;
        int min = N+1;
        // 소수가 아닌 수들 배열에 넣기
        for (int i = M; i <= N; i++) {
            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    list1.add(i);
                    break;
                }
            }
        }
//        // 소수가 없으면 -1출력하고 프로그램 종료
//        if (list1.size() == N-M+1) {
//            System.out.println(-1);
//            System.exit(0);
//        }
        // 모든 자연수 넣기
        for (int i = M; i <= N; i++) {
            list2.add(i);
            }
        // 자연수 배열에서 소수인 애들 빼기
        for (int i = 0; i < list1.size(); i++) {
            list2.remove(list1.get(i));
        }
        // 1 없애기
        if (list2.contains(1)) {
            int one = 1;
            list2.remove(Integer.valueOf(1)); // remove에 1을 바로 넣으면 index값으로 알아들어서 1번째 값을 지운다.
            //그래서 값으로 인식하게 하려면 객체에 1을 반환하게 해야한다. 그래서 Integer.valueOf로 1을 객체로 만들어 넣어준다.
        }

        //소수의 합 구하기
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            if (min > list2.get(i)) {
                min = list2.get(i);
            }
        }
        if (list2.isEmpty() || sum == 1) {
            System.out.println(-1);
        }else {
        System.out.println(sum);
        System.out.println(min);
        }
    }
}
