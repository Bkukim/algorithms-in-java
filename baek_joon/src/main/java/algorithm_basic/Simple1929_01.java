package algorithm_basic;

import java.io.*;

/**
 * packageName : algorithm_basic
 * fileName : Simple1929
 * author : PC
 * date : 2024-03-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08         PC          최초 생성
 */
public class Simple1929_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // 수 받기
        String[] num = br.readLine().split(" ");
        int start = Integer.parseInt(num[0]);
        int end = Integer.parseInt(num[1]);

        // 범위 숫자가 들어갈 배열 만들기
        int[] numArr = new int[1000001];

        // 배열에 숫자넣기
        for (int i = 2; i < 1000001; i++) {
            numArr[i] = i;
        }

        // 에라토스테네스의 체
        for (int i = 2; i <1000001 ; i++) {
            for (int j = i*2; j < 1000001; j+=i) {
                if (numArr[j] == 0)continue;
                numArr[j] = 0;
            }
        }
        
        // 출력
        for (int i = start; i < end; i++) {
            if (numArr[i] != 0) {
                sb.append(i + "\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
