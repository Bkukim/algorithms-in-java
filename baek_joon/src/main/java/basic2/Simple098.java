package basic2;


import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


/**
 * packageName : basic2
 * fileName : 백준_11650_좌표 정렬하기
 * author : PC
 * date : 2024-02-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-26        PC          최초 생성
 */
public class Simple098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        String n = br.readLine();
        int N = Integer.parseInt(n);
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[1]);
            arr[i][0] = x;
            arr[i][1] = y;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    stringBuilder.append(arr[i][j]).append(" ");
                }else {
                    stringBuilder.append(arr[i][j]).append("\n");
                }

            }
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}
