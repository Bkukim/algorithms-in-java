package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_1264_모음의 개수
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple050 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            int count = 0;
            if (str.equals("#")) {
                break;
            }
            String[] strArr = str.split("");
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("a") || strArr[i].equals("e") || strArr[i].equals("i") || strArr[i].equals("o") || strArr[i].equals("u")
||                strArr[i].equals("A") || strArr[i].equals("E") || strArr[i].equals("I") || strArr[i].equals("O") || strArr[i].equals("U")) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
