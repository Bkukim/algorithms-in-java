package basic2;

import java.util.*;

/**
 * packageName : basic2
 * fileName : 백준_25305_커트라인
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
public class Simple093 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 1; // 최댓값이 사라지면 1씩 증가하고 count-1이 k와 같아지면 탈출
        List<Integer> scoreArr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int score = scanner.nextInt();
            scoreArr.add(score);
        }
        for (int i = 0; i < scoreArr.size(); i++) {
            if (count == k) {
                System.out.println(Collections.max(scoreArr));
                System.out.println(scoreArr);
                break;
            }
            scoreArr.remove(Collections.max(scoreArr));
            count++;
        }
    }
}
