public class practice2_4 {
    public static void main(String[] args){ /* -128 ~ 127 까지의범위만 포함하기때문에 에러가발생한다 */
        byte b = 127; /* 256을 127로 수정 */
        System.out.println(b);

        char c = 'a'; /* char 값은 문자형으로 공백은 포함되지않는다 공백을 a로 변경후 정상적으로 출력된다. */
        System.out.println(c);

        char answer = 'n';/*    작은따옴표 ' '는 문자만 포함하기떄문에 둘이상의 호출이 불가능하다.  */
        char answer1 = 'o';
        System.out.println(answer + answer1); /* 'n' 'o' 변수를 각각선언후 더한다면 하나의문자만 저장되기떄문에 아스키코드상 110+111로
                                                호출되게된다. 문자가아닌 문자열을 출력하려면 char 가 아닌 String 데이터타입을 사용해야한다. */
        /* char new_Answer = "no";   따라서 char(문자) 데이터방식에서 "no"와 같이 String 데이터방식을 사용하면 에러가 출력된다.
        System.out.println(new_Answer); */
        float f = 3.14f; /* f를 추가함 */
        System.out.println(f); /* float는 실수형에서 기본값으로 하고있지않아서 끝에 f혹은 F를 기입해줘야한다. 기본값은 double이다. */




    }
}
