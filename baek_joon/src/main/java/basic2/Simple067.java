package basic2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2903_중앙 이동 알고리즘
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
public class Simple067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        arrayList.add(2);
        // 배열 2개 만들고 1번엔 제곱해줄 숫자를 넣는다.
        // 2번 배열에는 결과를 넣는데, 제곱한 숫자를 넣고 결과 출력
        int n = scanner.nextInt();
//        arrayList에 *2 -1 한 숫자 넣기
        for (int i = 0; i < n; i++) {
            arrayList.add(arrayList.get(i)*2-1);
        }
//        result에 제곱해서 넣기
        for (int i = 0; i < arrayList.size(); i++) {
            result.add(arrayList.get(i)*arrayList.get(i));
        }
        System.out.println(result.get(n));
    }
}
