package basic2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * packageName : basic2
 * fileName : 백준_1181_단어 정렬
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
public class Simple99_01 {
    // list로 받아서 set에 넣어주고 중복 없애기
    // 받아서 length로 길이를 주고 그 길이로 길이배열 만들어주기
    // 길이랑 문자랑 짝지어서 2차원 배열을 만들어서 넣어주고 길이랑 매치시키기
    // 매치되면 결과배열에 넣어주기

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 중복제거를 위한 set
        HashSet set = new HashSet();
        // 중복 제거한 값을 담을 list
        ArrayList<String> arrayList = new ArrayList<>();
        // 입력받을 단어갯수
        int N = Integer.parseInt(br.readLine());

        // 중복을 없애기 위해 SET에, 들어오는 값 넣기
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // set을 다시 배열로 만들기
        arrayList.addAll(set);
//        System.out.println(arrayList);
        // 배열의 자릿수 배열로 만들기
        String[][] length = new String[arrayList.size()][2];
        for (int i = 0; i < arrayList.size(); i++) {
            length[i][0] = String.valueOf(arrayList.get(i).length());
            length[i][1] = arrayList.get(i);
        }
        System.out.println(Arrays.deepToString(length));
        // 오름차순 정렬
        Arrays.sort(length, Comparator.comparing((String[] a) -> Integer.parseInt(a[0]))
                .thenComparing(a -> a[1])); // 이렇게 하면 숫자를 문자로 인식해서 만약 11이 나온다면 1과 1의 문자열로 인식해서 1N이 2보다 우선으로 오게 만든다.

//        System.out.println(Arrays.deepToString(length));
        // 출력
        for (int i = 0; i < length.length; i++) {
            sb.append(length[i][1] + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
