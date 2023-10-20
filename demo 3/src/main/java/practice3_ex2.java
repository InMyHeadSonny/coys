public class practice3_ex2 {
    public static void main(String [] args){
        int i=5, j=0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i +", j=" + j); /* j는 i의 과거값을 받고 i는 최신값을받는다 */

        i = 5;  //결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j = 0;

        j = ++i;
        System.out.println("j=++i 실행 후, i =" + i + ". j=" + j); /* j와 i 모두 최신값을 받는다 */


    }
}
