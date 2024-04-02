package basic2;

import java.io.*;
import java.util.Arrays;
/**
 * packageName : basic2
 * fileName : 백준_2751_수 정렬하기 2
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
public class Simple094 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter
                = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));
        // 원래 scanner을 사용하다가 buffered로 바꾸니까 시간초과가 더 이상 나오지 않는다.
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] NArr = new int[N];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            NArr[i] = n;
        }
        Arrays.sort(NArr);
        StringBuilder stringBuilder  = new StringBuilder();
        for (Integer i : NArr) {
            stringBuilder.append(i + "\n");
            // 여기서도 바로 반복문으로 출력하지 않고 stringBuilder로 쌓아서 반복문 밖에서 한번에 출력하는게 더 성능이 좋다.
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
