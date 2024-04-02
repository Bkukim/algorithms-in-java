package basic2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
public class Simple097_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }
//        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });
//        for (int i = 0; i < arr.length; i++) { 여기서 첫 번째 값이 같으면 두번째값이 큰애가 앞으로 오게 만들어주었다. 그런데 결과가 바뀌지 않았다.
//            if (i < arr.length-1) {
//                if (arr[i] == arr[i+1] && arr[i][1] > arr[i+1][1]) {
//                    int temp = 0;
//                    temp = arr[i][1];
//                    arr[i][1] = arr[i+1][1];
//                    arr[i+1][1] = temp;
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
