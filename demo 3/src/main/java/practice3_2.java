public class practice3_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; /* A = 65*/

        /* 다음연산의 결과를 적으시오 */

        System.out.println(y >= 5 || x < 0 && x > 2); /* y는 5랑같거나 그이상이상이고  x는 0이상 2이하 이다 */
        System.out.println(y += 10 - x++); /* 10 - 2(x값) 계산후 x에 1을더한다 y = 5+ 8 || x = 3 */
        System.out.println(x += 2); /* x에 2를 더한다 5  이전에 x는 1이 올라간상태여서 3이다  */
        System.out.println(!('A' <= c && c <= 'Z')); /* c = 'A'의 값은 A부터 Z까지의 알파벳에 들어가지않는다 들어가기떄문에 틀리다 */
        System.out.println('C' - c); /* 'C' - 'A' 문자형으로 문자코드로 치환되어 계산된다. A값이 65이므로 C의값은 67이다 . 따라서 2 */
        System.out.println('5' - '0'); /* '5' 의 문자코드는 53 '0' 문자코드는 48 절때 5-0이 아니다. 53-48 = 5 이다.*/
        System.out.println(c + 1); /* 65 + 1 =66 */
        System.out.println(++c); /* '65'에 1을 추가하고 그것을 출력 '66'*/
        System.out.println(c++); /* '66'을 출력하고 1을 저장 '67'저장값 */
        System.out.println(c); /* '67' = C */


    }
}
