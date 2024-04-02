package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_1157_단어 공부
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple056 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.next();
        String[] strArr = str.split("");

//        System.out.println("strArr = " + Arrays.toString(strArr));

        // 알파벳 배열 만들기
        char[] big = new char[26];
        char[] small = new char[26];

        for (int i = 0; i < 26; i++) {
            small[i] = (char)('a' + i);
        }
        for (int i = 0; i < 26; i++) {
            big[i] = (char)('A' + i);
        }
        // 알파벳 배열 문자열 배열로 바꾸기
        String[] B = new String[26];
        String[] s = new String[26];
        for (int i = 0; i < 26; i++) {
            B[i] = Character.toString(big[i]);
        }
        for (int i = 0; i < 26; i++) {
            s[i] = Character.toString(small[i]);
        }

        int[] result = new int[26];

//        System.out.println("B = " + Arrays.toString(B));



        // 알파벳 대소문자 구분 안하기 배열두개 만들어서 이것도 배열의 자릿수 로 일치를 시켜주면됨. 즉 i로 비교



        // 중복되면 물음표 - 결과 배열에 문자가 나오는대로 그 자리에 +1을 해준다.
        // 그다음 최댓값을 정해주고 최댓값과 같은 값의 배열이 있으면 count
        // count가 1보다 크면 ?1이면 최댓값의 자리의 알파벳을 대문자로 출력

        // result 알파벳 자리에 갯수 숫자 넣어주기
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < big.length; j++) {
                if (strArr[i].equals(B[j]) || strArr[i].equals(s[j])) {
                        result[j] += 1;
                }
            }
        }
        //최댓값 구하기
        int max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
            }
        }
//        System.out.println("::" + Arrays.toString(result));
//        System.out.println("max = " + max);
        int count2 = 0;
//         최댓값이 중복되면 물음표 아니라면 B의 i번의 값 출력 -1
        for (int i = 0; i < result.length; i++) {
            if (max == result[i]) {
                count2++;
            }
        }
//        System.out.println("count2 = " + count2);
        //         최댓값이 중복되면 물음표 아니라면 B의 i번의 값 출력 -2
        if (count2 >= 2) {
            System.out.println("?");
        }else {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == max) {
                    System.out.println(B[i]);
                    break;
                }
            }
        }

    }
}
