package basic;



import java.util.Scanner;

/**
 * packageName : basic
 * fileName : Simple039
 * author : PC
 * date : 2024-01-30
 * description : 백준_1152_단어의 개수
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-30         PC          최초 생성
 */



public class Simple048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        String[] splitWords = str.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
            if (!splitWords[i].equals("")) {
                count++;
            }
        }
        System.out.println(count);


    }
}
