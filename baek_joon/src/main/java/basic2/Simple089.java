package basic2;


import java.util.*;
import java.util.stream.Collectors;

/**
 * packageName : basic2
 * fileName : 백준_1436_영화감독 숌
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
public class Simple089 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> iStrArr = new ArrayList<>();
        // 666앞에 추가되는 숫자와 뒤에 추가되는 숫자 구할거다
        // 근데 규티

        for (int i = 0; i < 10; i++) {
            iStrArr.add("666"+i);
            for (int j = 0; j < 10; j++) {
                iStrArr.add("666"+i+j);
                for (int k = 0; k < 10; k++) {
                    iStrArr.add("666"+i+j+k);
                    for (int l = 0; l < 10; l++) {
                        iStrArr.add("666"+i+j+k+l);
                    }
                }
            }
        }

        // 숫자배열로 바꾸기
        List<Integer> integerList = iStrArr.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(integerList);
        List<Integer> integers = new ArrayList<>(set);

        Collections.sort(integers);

        System.out.println(integers);
        System.out.println(integers.get(N-1));

    }
}
