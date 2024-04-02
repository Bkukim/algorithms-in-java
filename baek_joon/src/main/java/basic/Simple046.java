package basic;


import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_10809_알파벳 찾기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */



public class Simple046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
       String str = scanner.next();
       String[] strArr = str.split("");// 배열에 들어온 단어를 집어넣기
       int[] result = new int[alpha.length];

        // 주어진 문자를 숫자로 바꾸자 ex aaffa = 00550

        // strArr에 없는 글자의 앞파벳자리에 자리에 -1넣기
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (!strArr[i].equals(alpha[j])) {
                    // resut에다가 입력된 문자가 몇번째 있는지 알파벳 순으로 넣기 "j번째 알파벳이 arr의 i번째에 있다."
                    result[j] = -1;
                }
            }
        }
        // str배열과 알파벳 배열에 같은 것이 있을때 들어오는 문자가 있는 자리를 알파벳 자리 배열에 넣기 - 대신 겹치는 문자가 있으면 마지막 문자가 들어온다...
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (strArr[i].equals(alpha[j])) {// todo 문자열을 비교할때 equals함수 사용해야한다.
                    // resut에다가 입력된 문자가 몇번째 있는지 알파벳 순으로 넣기 "j번째 알파벳이 arr의 i번째에 있다."
                    if (result[j] != -1) {

                    }else {
                        result[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
// 여기서 재일 힘들었던거 중복되는거 스킵하기 -> 이미 -1이 들어가있으면 실행문 없음.
// 키웨이 = 일단 먼저 result배열을 만들어서 strArr배열과 alpha배열이 겹치지 않는 자리에 -1을 다 넣고, 겹치는 곳에 그 알파벳이 strArr에서 몇번째인지를 넣어준다.
// 이때 주의할점이 중복되는 문자가 있을 경우 앞의 자리만 넣어주어야한다. -> if -1이 아니고 숫자가 이미 들어가 있을경우 아무일도 일어나지 않는다.를 해주면된다.