public class practice3_ex4 {
    public static void main(String[] args){
        int i = -10;
        i = +i;
        System.out.println(i); /* '+' 부호는 실질적으로 하는일이 없다. */

        i = -10;
        i = -i;
        System.out.println(i); /* '-' 부호는 음양 값을 변환해준다. -10인 값은 -부호로 인해 +10으로 변환되어 출력된다 */
    }

}
