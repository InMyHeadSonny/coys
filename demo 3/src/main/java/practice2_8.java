public class practice2_8 {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
        int temp = x;
        /* 알맞은 코드를 넣어 완성하시오 */
        temp = x; /* x변수의 1을 temp 로 돌린다 */
        x = y; /* x변수에 y값인 2를 넣는다 */


        /* 중간결과 temp = 1 | x = 2 | y = 2 | z = 3 */



        y = z; /* y변수에 z값인 3을 넣는다 */
        z = temp; /* 처음 x변수1값을 저장해둔 temp를 z로 넘겨준다 */



        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        /* 결과 x=2 y=3 z=1 */
    }
}
