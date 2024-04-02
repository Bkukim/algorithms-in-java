package bronzes;


import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_16170_오늘의 날짜는?
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple033 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Month month = now.getMonth();
        System.out.println(now.getYear());
        System.out.println(month.getValue());
        System.out.println(now.getDayOfMonth());
    }
}
