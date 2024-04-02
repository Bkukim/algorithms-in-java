package bronzes;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-06
 * description :백준_17256_달달함이 넘쳐흘러
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06        PC          최초 생성
 */
public class Simple035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int az = scanner.nextInt();
        int cx = scanner.nextInt();
        int cy = scanner.nextInt();
        int cz = scanner.nextInt();

        int bx = cx-az;
        int by = cy/ay;
        int bz = cz-ax;

        System.out.println(bx + " " + by + " " + bz );
    }
}
