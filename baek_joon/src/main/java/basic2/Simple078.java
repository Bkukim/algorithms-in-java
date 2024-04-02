package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_21085_직사각형에서 탈출
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
public class Simple078 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int wDev2 = w/2;
        int hDev2 = h/2;

        int min1 = w-x;
        int min2 = h-y;

        //2로 나눈거보다 w,h가 크면 x,y와 비교 작으면 0,0과 비교

        if (wDev2 >= x && hDev2 >= y) {// x,y가 2로 나눈거보다 작을경우 x와y중 작은 값을 출력(0,0과 비교하므로 x아니면 y가 최솟값)
            if (x >= y) {
                System.out.println(y);
            }else {
                System.out.println(x);
            }
        }else if (wDev2 >= x) {// x는 2로 나눈거보다 작고 y는 클경우 x가 min2보다 크면 min2출력 아니면 x출력
            if (x >= min2) {
                System.out.println(min2);
            }else {
                System.out.println(x);
            }
        }else if (hDev2 >= y) {// y는 2로 나눈거보다 작고 x는 클경우 y가 min1보다 크면 min1출력 아니면 y출력
            if (y >= min1) {
                System.out.println(min1);
            }else {
                System.out.println(y);
            }
        }else { // 둘다 클 경우 min1,2중 ㅈㄱ은 값 출력
            if (min1 >= min2) {
                System.out.println(min2);
            }else {
                System.out.println(min1);
            }
        }
    }
}
