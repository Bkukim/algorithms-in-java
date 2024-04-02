package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_9063_대지
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
public class Simple081 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        if (N <= 1) {
            System.out.println(0);
            System.exit(0);
        }
        int[] Xs = new int[N];
        int[] Ys = new int[N];

        int maxX = -100000;
        int maxY = -100000;

        int minX = 100000;
        int minY = 100000;
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            Xs[i] = X;
            Ys[i] = Y;
        }

        for (int i = 0; i < Xs.length; i++) {
            if (maxX < Xs[i]) {
                maxX = Xs[i];
            }
        }
        for (int i = 0; i < Ys.length; i++) {
            if (maxY < Ys[i]) {
                maxY = Ys[i];
            }
        }for (int i = 0; i < Xs.length; i++) {
            if (minX > Xs[i]) {
                minX = Xs[i];
            }
        }
        for (int i = 0; i < Xs.length; i++) {
            if (minY > Ys[i]) {
                minY = Ys[i];
            }
        }

        System.out.println(Math.abs(maxX-minX)*Math.abs(maxY-minY));
    }
}
