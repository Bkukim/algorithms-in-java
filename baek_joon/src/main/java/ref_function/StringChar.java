package ref_function;

/**
 * packageName : ref_function
 * fileName : StringChar
 * author : PC
 * date : 2024-01-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-25         PC          최초 생성
 */
public class StringChar {
    public static void main(String[] args) {
//        예제 : 주민번호 뒷자리에 첫 번째 글자가 1이면 남자입니다. 1이 아니면 여자입니다.
        String ssn = "010624-1230123";

        char gender = ssn.charAt(7);
        System.out.println(gender);
    }
}
