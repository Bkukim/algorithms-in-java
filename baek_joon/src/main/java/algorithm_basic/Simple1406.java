package algorithm_basic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
public class Simple1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();

        // 커서의 위치를 나타낼 count
        int count;
        String str = br.readLine();
        // 들어온 문자열 배열에 넣기
        String[] strArr = str.split("");

        count = strArr.length;

        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i]);
        }
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String order = br.readLine();
            if (order.length() > 1) {
                char c = order.charAt(2);
                list.add(count,String.valueOf(c));
                count += 1;
            }else if (order.equals("L")) { // 커서를 왼쪽으로 옮겨야하므로 count를 하나 줄여준다.
                if (count != 0) {
                    count -= 1;
                }

            }else if (order.equals("D")) { // 커서를 오른쪽으로 옮겨야하므로 count를 하나 늘려준다.
                if (count != list.size()) {
                    count += 1;
                }
            } else if (order.equals("B")) {
                if (count != 0) {
                    list.remove(count-1);
                    count -=1;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
