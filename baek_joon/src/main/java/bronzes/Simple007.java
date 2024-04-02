package bronzes;


import java.util.Date;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-01
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         PC          최초 생성
 */
public class Simple007 {
    public static void main(String[] args) {
        Date date = new Date();
        int a = date.getYear();
        int b = date.getDate();
        int c = date.getDay();

        System.out.println(a + " - " + b + " - " + c);
    }
}
