package basic2;


import java.util.Scanner;


/**
 * packageName : basic2
 * fileName : 백준_2869_달팽이는 올라가고 싶다
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
public class Simple070_simple {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();
            int dayMove = a - b;
            int day = v / dayMove;
            if((v % dayMove + dayMove) <= a){
                day -= a / dayMove;
                day += 1;
                System.out.println(day);
            }
            else if(v % dayMove == 0) {
                System.out.println(day);
            }
            //
            else {
                day += 1;
                System.out.println(day);
            }

    }
}
