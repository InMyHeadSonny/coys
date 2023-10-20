import java.util.Scanner; /* Scanner 클래스를 사용하기위해 import */
public class practice4_ex3 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요");
        Scanner scanner = new Scanner(System.in); /* Scanner 클래스에 scanner = new 키워드생성 후 System.in으로 초기화 */
        int input = scanner.nextInt();

        if(input==0) {
            System.out.println("입력한 값은 0입니다.");
        }
        else {
            System.out.println("0이 아닙니다.");
        }

    }
}
