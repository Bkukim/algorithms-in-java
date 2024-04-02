package basic2;


import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName : basic2
 * fileName : 백준_10814_나이순 정렬
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
public class Simple100_01 {
    // 숫자만 오름차순으로 정렬한 다음 그 숫자랑 같은 값이 있는 배열을 결과배열에 넣는다.
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        // 들어오는 문자들 담을 배열 만들기
        String[][] arr = new String[N][2];
        // 결과배열
//        String[][] arrResult = new String[N][2];
        // 숫자배열
//        int[] arrAge = new int[N];

        // 배열에 들어오는 값들 담고 숫자배열에 나이 넣기
        for (int i = 0; i < N; i++) {
            String x = br.readLine();
            String[] xArr = x.split(" ");
            arr[i][0] = xArr[0];
            arr[i][1] = xArr[1];
        }
        // 나이배열 오름차순 정리
        Arrays.sort(arr, Comparator.comparing((String[] a) -> Integer.parseInt(a[0])));

        // 나이배열과 일치하는 숫자를 가지면 결과배열에 넣고 탈출,
        // 어차피 가입순으로 되어있어서 가입순은 신경 안 써도 됨
        // 똑같은거 비교하면 안되니 비교한 애는 0으로 바꿔주기
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arrAge[i] == Integer.parseInt(arr[j][0])) {
//                    arrResult[i][0] = arr[j][0];
//                    arrResult[i][1] = arr[j][1];
//                    arr[j][0] = "0";
//                    break;
//                }
//            }
//        }
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
