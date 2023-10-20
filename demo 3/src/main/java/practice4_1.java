import java.util.Scanner; /* 다음의 문장을 조건식으로 표현하라 */

public class practice4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("숫자를 하나 입력하세요.>");

        // 사용자로부터 정수를 입력받음
        x = scanner.nextInt();

        if (x > 10 && x < 20) {
            System.out.println("10보다 크고 20보다 작습니다.");
        } else {
            System.out.println("10보다 크거나 20보다 작지 않습니다.");
        }
    }
}
