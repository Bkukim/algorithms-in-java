package basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2231_분해합
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
public class Simple086 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        int result = 0;

        // 반복문을 돌린다 N까지
        // i를 문자열로 바꿔서 split한 뒤 넣어준다
        // i + 각 자리숫자형태로 바꾸기 == N이면 break;
        stop:
        for (int i = 0; i < N; i++) { // 반복문을 돌린다 N까지
            String strI = String.valueOf(i);// i를 문자열로 바꿔서 split한 뒤 넣어준다
            String[] strIArr = strI.split("");
            for (int j = 0; j < strIArr.length; j++) {
                sum += Integer.parseInt(strIArr[j]);
            }
            if (sum + i == N) {
                result = i;
                break stop;
            }else {
                sum = 0;
            }
        }
        System.out.println(result);

    }
}
