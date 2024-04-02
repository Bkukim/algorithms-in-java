package algorithm_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * packageName : algorithm_basic
 * fileName : Simple1874
 * author : PC
 * date : 2024-04-02
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-02         PC          최초 생성
 */
public class Simple1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int count=1; // 마지막에 들어온 수가 무엇인지 알리는 수. 이게 없으면 들어왔던 수가 또 들어올 수 있다.

        boolean yesOrNo = true;// 성립이 안된다는 것을 알리는 신호
        // 만약 반복문을 돌리다가 젤 위의 숫자보다 원하는 숫자가 작은 경우, 이 수열은 성립이 안되므로 no
        // 원하는 숫자가 크면 채운뒤 빼내면 되고, 같으면 바로 빼면됨. 근데 작으면 빼야하는데 빼자마자 수열이 틀려버림.

        stack.push(0); // 1이 빠져나오면 빈 스택이 되어서 첫 if문에서 emptystack에러가 남.
        stack.push(1); // 1을 미리 넣어놓자 시작할때 isEmpty 걸어놓기 귀찮으니까.
        sb.append("+" + "\n");

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (stack.peek() > num) { // 만약 반복문을 돌리다가 젤 위의 숫자보다 원하는 숫자가 작은 경우, 이 수열은 성립이 안되므로 no
                yesOrNo = false;
                break;
            } else if (stack.peek() == num) { // 같은 수이면 아무일도 일어나지 않고 반복문 마지막에 pop

            }else { // 큰 수이면 count보다 1큰수부터 num까지push
                for (int j = count + 1; j <= num; j++) {
                    stack.push(j);
                    count++;
                    sb.append("+" + "\n");
                }
            }
            stack.pop();
            sb.append("-" + "\n");
        }

        // count가 1이라는 것은 성립이 안된다는 것
        if (!yesOrNo) {
            System.out.println("NO");
        }else {
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}
