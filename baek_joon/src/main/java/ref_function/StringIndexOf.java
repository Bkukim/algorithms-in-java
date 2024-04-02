package ref_function;

/**
 * packageName : ref_function
 * fileName : StringIndexOf
 * author : PC
 * date : 2024-02-01
 * description : 문자열에서 특정 문자의 위치 찾기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-01         PC          최초 생성
 */
public class StringIndexOf {
    public static void main(String[] args) {
        String str = "abcde";
        int pos = str.indexOf("c");
        System.out.println(pos);

        // 못 찾을 경우 -1이 출력된다.

        int pos2 = str.indexOf("Z");
        System.out.println(pos2);
    }
}
