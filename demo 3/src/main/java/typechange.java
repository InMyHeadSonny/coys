public class typechange {
    public static void main(String args[]) {
        String str = "3"; /* 문자열을 str에 기입 */

        System.out.println(str.charAt(0)); /* 문자열을 charAt(0)을 사용해 문자로 변환 */
        System.out.println('3' - '0' + 1); /* 문자를 '0'를 사용해 뺼셈으로 숫자로 변환 후 1을 더함 */
        System.out.println(Integer.parseInt("3") + 1);/* 문자열을 숫자로 전환 숫자를 감싸고있는 " " 를 지워준다 */
        System.out.println("3" + 1); /* 숫자 1을 문자열에 포함시킨다 */
        System.out.println((char) (3 + '0')); /* 숫자를 문자로 변환 - (char) + '0'을 더한다 */

    }
}
