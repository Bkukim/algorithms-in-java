package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple059
 * author : PC
 * date : 2024-01-31
 * description :백준_25206_너의 평점은
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         PC          최초 생성
 */
public class Simple059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] gradeArr = new double[20];
        String[] scoreArr = new String[20];
        double sum = 0;
        double gradeSum = 0;

        double[] sg = new double[20];

        for (int i = 0; i < 20; i++) {

            String object = scanner.next();
            double grade = scanner.nextDouble();
            String score = scanner.next();

            gradeArr[i] = grade;
            scoreArr[i] = score;
            if (scoreArr[i].equals("P")) {

            }else {
                gradeSum += gradeArr[i];
            }
        }

        for (int i = 0; i < sg.length; i++) {
            if (scoreArr[i].equals("A+")) {
                sg[i] = gradeArr[i] * 4.5;
            }else if (scoreArr[i].equals("A0")) {
                sg[i] = gradeArr[i] * 4.0;
            }else if (scoreArr[i].equals("B+")) {
                sg[i] = gradeArr[i] * 3.5;
            }else if (scoreArr[i].equals("B0")) {
                sg[i] = gradeArr[i] * 3.0;
            }else if (scoreArr[i].equals("C+")) {
                sg[i] = gradeArr[i] * 2.5;
            }else if (scoreArr[i].equals("C0")) {
                sg[i] = gradeArr[i] * 2.0;
            }else if (scoreArr[i].equals("D+")) {
                sg[i] = gradeArr[i] * 1.5;
            }else if (scoreArr[i].equals("D0")) {
                sg[i] = gradeArr[i] * 1.0;
            }else if (scoreArr[i].equals("F")) {
                sg[i] = gradeArr[i] * 0.0;
            }else if (scoreArr[i].equals("P")) {
                sg[i] = gradeArr[i] * 0.0;
            }
        }
//        System.out.println("sg 배열" + Arrays.toString(sg));
        for (int i = 0; i < sg.length; i++) {
            sum += sg[i];
        }

        System.out.println(sum/(gradeSum));
        // grede배열에서 p인거 빼기
    }
}
