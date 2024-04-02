package basic;

import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple004
 * author : PC
 * date : 2024-01-24
 * description :백준_2525_오븐 시계
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-24         PC          최초 생성
 */
public class Simple019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int yz = Y + Z; // 원래 분에 더해진 분을 더한 값
        int yz60q = yz / 60; // 원래 분에 필요한 분을 더해서 60분으로 나눈뒤 몫을 구한것. 더해질 시간을 의미한다.
        int yz60w = yz % 60; // 원래 분에 필요한 분을 더해성 60분으로 나눈뒤 나머지를 구한것. 나타낼 분을 의미함.
        int xyz60q = X + yz60q; // 원래 시간에 더해진 시간을 의미
        int xyz60w = xyz60q % 24; // 24시간 이상이 될 경우 다음날의 시간을 의미
// 23시 가 아니고 22이여도 120분이 추가되면 24시가 됨

        if (yz < 60 ) {
            System.out.println(X + " " + yz);
        } else if (yz >= 60 && xyz60q >= 24){
            System.out.println(xyz60w + " " + yz60w);
        }else {
            System.out.println((X+yz60q) + " " + yz60w);
        }
    }
}
