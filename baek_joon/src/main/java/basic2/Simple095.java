package basic2;

import java.io.*;

import java.util.Arrays;


/**
 * packageName : basic2
 * fileName : 백준_10989_수 정렬하기 3
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
public class Simple095 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter
                = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));
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
        }
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
