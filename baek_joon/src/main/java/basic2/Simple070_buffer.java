package basic2;

import java.io.*;



/**
 * packageName : basic2
 * fileName : 백준_2869_달팽이는 올라가고 싶다
 * author : PC
 * date : 2024-01-31
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31         PC          최초 생성
 */
public class Simple070_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(); //String
        String[] str = a.split(" ");
        int A = Integer.parseInt(str[0]); //Int
        int B = Integer.parseInt(str[1]); //Int
        int V = Integer.parseInt(str[2]); //Int

        int sum = 0;

        int i =1;
        while (true){
            sum += A;

            if (sum >= V) {
                break;
            }
            sum -= B;
            i++;

        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = Integer.toString(i);   //출력할 문자열
        bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음

    }
}
