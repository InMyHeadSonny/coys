public class practice2_4 {
    public static void main(String[] args){ /* -128 ~ 127 까지의범위만 포함하기때문에 에러가발생한다 */
        byte b = 127; /* 256을 127로 수정 */
        System.out.println(b);

        char c = 'a'; /* char 값은 문자형으로 공백은 포함되지않는다 공백을 a로 변경후 정상적으로 출력된다. */
        System.out.println(c);




    }
}
