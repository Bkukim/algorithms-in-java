package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_25314_코딩은 체육과목 입니다
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple025 {
    public static void main(String[] args) {
        // n을 8로 나눌때 나머지가 4이면 long을 n/8만큼 찍고 int 1개
        // 나머지가 0이면 n/8만큼 찍기
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


            for (int i = 0; i < (n/4); i++) {
                System.out.print("long ");
            }
            System.out.println("int");


    }
}