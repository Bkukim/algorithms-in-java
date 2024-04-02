package bronzes2;


import java.util.Scanner;

/**
 * packageName : bronzes
 * fileName : Simple001
 * author : PC
 * date : 2024-02-08
 * description :백준_11365_!밀비 급일
 * 요약 : BigInteger
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08        PC          최초 생성
 */
public class Simple053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      while (true){
          String str = scanner.nextLine();
          if (str.equals("END") ) {
              break;
          }
          String[] strArr = str.split("");

              for (int i = 0; i < strArr.length/2; i++) {
                  String a = strArr[i];
                  strArr[i] = strArr[strArr.length -1 - i];
                  strArr[strArr.length -1 - i] = a ;
              }
          for (int i = 0; i < strArr.length; i++) {
              System.out.print(strArr[i]);
          }
          System.out.println();
      }
    }
}
