package basic2;

import java.io.*;
import java.util.*;

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
public class Simple99 {
    // list로 받아서 set에 넣어주고 중복 없애기
    // 받아서 length로 길이를 주고 그 길이로 길이배열 만들어주기
    // 길이랑 문자랑 짝지어서 2차원 배열을 만들어서 넣어주고 길이랑 매치시키기
    // 매치되면 결과배열에 넣어주기

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        // 중복을 없애기위한 hash set
        HashSet set = new HashSet();
        // 중복을 없앤 set을 넣을 배열
        List<String> list = new ArrayList<>();



        int N = Integer.parseInt(br.readLine());

        // 들어오는 문자 set에 넣기
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // 중복을 없앤 친구들 list에 넣기
        list.addAll(set);

        // 배열의 값의 길이와 값 2차원 배열에 넣기
        String[][] length = new String[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            length[i][0] = String.valueOf(list.get(i).length());
            length[i][1] = list.get(i);
        }

        // 길이순으로 오름차순, 만약 같으면 알파벳순으로 오름차순
        Arrays.sort(length, Comparator.comparing((String[] a) -> Integer.parseInt(a[0]))// comparing 함수를 이용하여 정렬이 가능하다.
                // 정렬시 람다함수를 사용할 수 있는데, 2차원 배열일 경우 괄호안에 배열변수를 하나 넣어주고 화살표 뒤에 정렬기준이 될 값을 넣어주면된다.
                .thenComparing(a->a[1])); // 이 줄은 만약 앞의 배열의 값이 같을때 어떤 기준으로 정렬을 할 것인지를 정하는 함수이다.
                                // 앞의 a는 정렬할 배열을 변수로 받는 것이고, 뒤의 값은 기준이 될 배열이 몇번째인지를 정하는 것이다.

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length.length; i++) {
            sb.append(length[i][1] + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
