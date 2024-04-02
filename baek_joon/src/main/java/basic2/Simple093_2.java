package basic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
public class Simple093_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> scoreArr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int score = scanner.nextInt();
            scoreArr.add(score);
        }
        Collections.sort(scoreArr);
        System.out.println(scoreArr.get(scoreArr.size()-k));
    }
}
