package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_1316_그룹 단어 체커
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple058 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int count=0;
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            String[] strArr = str.split(""); // 바로 전의 문자가 같은 문자가 아니면 배열에 추가
            List<String> list = new ArrayList<>();
            for (int j = 0; j < strArr.length; j++) {
                if (j == 0) {
                    list.add(strArr[j]);
                }else {
                    if (!strArr[j].equals(strArr[j-1])) {// 연속되는 단어는 하나만 남기고 다빼주기
                        list.add(strArr[j]);
                    }
                }
            }
            stop:
            for (int j = 0; j < list.size()-1; j++) {// 중복이 있으면 그룹단어가 아니다. 왜냐하면 연속되는 단어는 하나만 남기고 다빼줘서
                for (int k = j+1; k < list.size(); k++) {
                    if (list.get(j).equals(list.get(k))) {
                        count++;
                        break stop;
                    }
                }
            }
        }
        System.out.println(N-count);
    }

}

