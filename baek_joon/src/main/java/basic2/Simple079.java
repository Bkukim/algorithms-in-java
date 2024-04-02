package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_3009_네 번째 점
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
public class Simple079 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] Xs = new int[3];
        int[] Ys = new int[3];

        int resultX = 0;
        int resultY = 0;
        for (int i = 0; i < 3; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            Xs[i] = X;
            Ys[i] = Y;
        }
        stop:
        for (int i = 0; i < 3; i++) {
            int countX = 0;
            for (int j = 0; j < 3; j++) {
                if (Xs[i] != Xs[j]) {

                    countX++;
                    if (countX == 2) {
                        resultX = Xs[i];
                        break stop;
                    }
                }
            }
        }
        stop2:
        for (int i = 0; i < 3; i++) {
            int countY = 0;
            for (int j = 0; j < 3; j++) {
                if (Ys[i] != Ys[j]) {

                    countY++;
                    if (countY == 2) {
                        resultY = Ys[i];
                        break stop2;
                    }
                }
            }
        }
        System.out.println(resultX + " " + resultY);
    }
}
