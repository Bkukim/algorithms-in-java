package basic;
import java.util.Scanner;
/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-29
 * description : 백준_10811_바구니 뒤집기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-29         PC          최초 생성
 */
public class Simple039 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] arr = new int[N];
            int a = 0;
//      베열 에 1~N까지 담기
            for (int i = 1; i <= N; i++) {
                arr[i-1] = i;
            }
//        역순으로 숫자 바꾸기
            for (int i = 0; i < M; i++) {
                int I =scanner.nextInt();
                int J =scanner.nextInt();

                if ((J-I)%2 == 1) {// 사이의 숫자 갯수가 짝수일 경우
                    // j에서 i를 빼고 2를 나눈 뒤1을 더해준 숫자만큼 반복해서 배열 인덱스를 증감시키며 숫자교환
                    for (int j = 0; j < (J-I)/2+1; j++) {
                        // arr0 = arr3 - arr1=arr2
                        a= arr[I-1+j];
                        arr[I-1+j] = arr[J-1-j];
                        arr[J-1-j] = a;
                    }
                }else {// 사이의 숫자 갯수가 홀수
                    // j에서 i를 빼고 2를 나눈 숫자만큼 반복해서 배열 인덱스를 증감시키며 숫자교환
                    for (int j = 0; j < (J-I)/2; j++) {
                        // arr0 = arr3 - arr1=arr2
                        a= arr[I-1+j];
                        arr[I-1+j] = arr[J-1-j];
                        arr[J-1-j] = a;
                    }
                }
            }
//      결과 출력
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

    }
}
