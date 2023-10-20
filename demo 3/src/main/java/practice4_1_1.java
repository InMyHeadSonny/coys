import java.util.Scanner;

public class practice4_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println("문자를 하나 입력하세요.>");

        // 사용자로부터 문자열을 입력받음
        String input = scanner.nextLine(); // nextLine() 메서드를 사용하여 공백을 포함한 문자열 입력을 허용

        if (input.length() >= 1) { // 길이가 1 이상이면
            ch = input.charAt(0);

            if (ch != ' ' && ch != '\t') {
                System.out.println("공백이나 탭이 아닙니다.");
            } else {
                System.out.println("공백이나 탭입니다.");
            }
        } else {
            System.out.println("하나 이상의 문자를 입력하세요.");
        }
    }
}
