package basic2;

import java.util.Scanner;

/**
 * packageName : basic2
 * fileName : 백준_2839_설탕 배달
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
public class Simple090 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String N = scanner.next(); // 마지막 수 구하기 쉽게 문자로 받기
        String[] NArr = N.split(""); // 배열에 한자리씩 넣기
        int lastNum = Integer.parseInt(NArr[NArr.length-1]); // 마지막 수 빼오기
        if(Integer.parseInt(N) == 1 ||
                Integer.parseInt(N) == 2 ||
                Integer.parseInt(N) == 4 ||
                Integer.parseInt(N) == 7) // 1,2,4,7 은 방법이 없음
        {
            System.out.println(-1);
            System.exit(0);
        }
        if (Integer.parseInt(N) % 5 == 0) {
            System.out.println(Integer.parseInt(N) / 5);
        }else if (lastNum == 1 || lastNum == 6){ // 1이나 6으로 끝나는 애들은 3으로 2번 나눠줘야 떨어짐. 그래서 6을 빼주고 5로 나눈뒤 6/3=2를 더해준다.
            System.out.println(((Integer.parseInt(N)-6) / 5) + 2);
        }else if (lastNum == 2 || lastNum == 7){ // 2이나 7으로 끝나는 애들은 3으로 4번 나눠줘야 떨어짐. 그래서 12를 빼주고 5로 나눈뒤 12/3=4를 더해준다.
            System.out.println(((Integer.parseInt(N)-12) / 5) + 4);
        }else if (lastNum == 3 || lastNum == 8){ // 3이나 8으로 끝나는 애들은 3으로 1번 나눠줘야 떨어짐. 그래서 3을 빼주고 5로 나눈뒤 3/3=1를 더해준다.
            System.out.println(((Integer.parseInt(N)-3) / 5) + 1);
        }else if (lastNum == 4 || lastNum == 9){ // 4이나 9으로 끝나는 애들은 3으로 3번 나눠줘야 떨어짐. 그래서 9를 빼주고 5로 나눈뒤 9/3=3를 더해준다.
            System.out.println(((Integer.parseInt(N)-9) / 5) + 3);
        }else { // 혹시 모르니 나머지는 이렇게
            System.out.println(-1);
        }
    }
}
