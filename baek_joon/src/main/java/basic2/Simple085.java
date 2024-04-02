package basic2;

import java.util.*;

/**
 * packageName : basic2
 * fileName : 백준_2798_블랙잭
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
public class Simple085 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // 주어진 수중에서 3개를 더해서 최댓값을 구하는데 M을 넘어선 안된다.
        // 만들어지는 경우의 수중 M을 넘지 않는애들을 배열2에 다 넣는다.
        // 배열2 를 돌리면서 최댓값을 찾는다.
        // stream 을 이용해서 문제를 풀어보자.

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int max = 0;
        List<Integer> numArr = new ArrayList<>();
        List<Integer> numArr2 = new ArrayList<>();

        for (int i = 0; i < N; i++) { // 들어오는 수 배열에 넣기
            int num = scanner.nextInt();
            numArr.add(num);
        }

        for (int i = 0; i < numArr.size()-2; i++) { // 첫번째부터 마지막의 2번째 전까지 반복
            for (int j = i+1; j < numArr.size()-1; j++) { // 첫자리보다 한칸씩 앞에서 반복
                for (int k = j+1; k < numArr.size(); k++) {// 첫자리보 두 칸씩 앞에서 반복 함으로 같은 수가 두번 더해지는 것을 없앤다.
                    numArr2.add(numArr.get(i)+numArr.get(j)+numArr.get(k));
                }
            }
        }
        for (int i = 0; i < numArr2.size(); i++) {
            if (max < numArr2.get(i) && numArr2.get(i) <= M) {
                max = numArr2.get(i);
            }
        }
        System.out.println(max);
    }
}
