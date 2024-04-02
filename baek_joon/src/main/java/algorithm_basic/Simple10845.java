package algorithm_basic;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


/**
 * packageName : algorithm_basic
 * fileName : Simple1929
 * author : PC
 * date : 2024-03-08
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08         PC          최초 생성
 */
public class Simple10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // 스택
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            if (strArr[0].equals("push")) {
                queue.add(Integer.parseInt(strArr[1]));
            } else if (strArr[0].equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append(queue.poll() + "\n");
                }
            } else if (strArr[0].equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (strArr[0].equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1 + "\n");
                }else {
                    sb.append(0 + "\n");
                }
            }else if(strArr[0].equals("front")){
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append(queue.peek() + "\n");
                }
            }else if(strArr[0].equals("back")){
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append(((LinkedList<Integer>) queue).peekLast()+ "\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
