public class practice4_ex2 {
    public static void main(String[] args) {
        int x = 0;

        System.out.printf("x=%d 일 때, 참인 것은%n", x);

        if(x==0) System.out.println("x==0"); /* 만약 x = 0 이라면 이메시지를 출력한다.*/
        if(x!=0) System.out.println("x!=0"); /* 만약 x 가 0 이 아니라면 이 메시지를 출력한다 */
        if(!(x==0)) System.out.println("!(x==0)"); /* 만약 x가 x==0이 아니라면 이 메시지를 출력한다 */
        if(!(x!=0)) System.out.println("!(x!=0)");/* 만약 x가 0이 아닌게 아니라면(0이라면) 이 메시지 출력한다 */

        x = 1; /* x의 값을 1로 초기화 */

        System.out.println("x=%d 일때, 참인 것은%n , x"); /* %d 는 println시 출력문제가 생긴다 */

        if(x==0) System.out.println("x==0"); /* 만약 x가 x=0 이라면 이메시지를 출력한다 */
        if(x!=0) System.out.println("x!=0"); /* 만약 x가 x=0이 아니라면 이메시지를 출력한다 */
        if(!(x==0)) System.out.println("!(x==0)"); /* 만약 x==0이 아니라면  이 메시지를 출력한다 */
        if(!(x!=0)) System.out.println("!(x!=0"); /* 만약 x==0이 아닌게 아니라면 이 메시지를 출력한다 */
    }
}
