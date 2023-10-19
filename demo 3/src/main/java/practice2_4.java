public class practice2_4 {
    public static void main(String[] args){ /* -128 ~ 127 까지의범위만 포함하기때문에 에러가발생한다 */
        byte b = 127; /* 256을 127로 수정 */
        System.out.println(b);
    }
}
