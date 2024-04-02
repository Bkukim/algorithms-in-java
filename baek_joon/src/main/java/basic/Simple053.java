package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_3003_킹, 퀸, 룩, 비숍, 나이트, 폰
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple053 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] shouldBe = {1,1,2,2,2,8};
        int[] quan = new int[6];
        int[] result = new int[6]; //
        for (int i = 0; i < 6; i++) {
            int N = scanner.nextInt();
            quan[i] = N;
        }
        for (int i = 0; i < 6; i++) {
            if (quan[i] == shouldBe[i]) {
                result[i] = 0;
            }else{
                result[i] = shouldBe[i] - quan[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
