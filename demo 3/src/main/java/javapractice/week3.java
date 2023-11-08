import java.util.Scanner;

public class week3 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        int N;

        while (true) {
            System.out.print("1부터 9 사이의 정수를 입력하세요: ");
            N = scanner.nextInt();

            if (N < 1 || N > 9) {
                System.out.println("1부터 9 사이의 정수를 입력하세요.");
                continue; // 범위를 벗어나면 다시 입력 요청
            } else {
                break; // 올바른 입력이 들어왔을 때 루프를 빠져나감
            }
        }

        // 증감식으로 i변수를 1부터 9까지 sout 9번 호출 호출하면서 N변수값 + sout 9번호출 *결과값 result 호출
        for (int i = 1; i <= 9; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }


    }
}