package basic2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_1427_소트인사이드
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
public class Simple096 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String num = scanner.next();
        String[] numArr = num.split("");
        Long[] longArr = new Long[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            longArr[i] = Long.parseLong(numArr[i]);
        }
        Arrays.sort(longArr, Collections.reverseOrder());
        for (long l : longArr) {
            System.out.print(l);
        }
    }
}
