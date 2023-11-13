package javapractice;

import java.util.Scanner;

public class week4 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        int sum;

        while (true) {
            System.out.print("1부터 10000 사이의 정수를 입력하세요: ");
            sum = scanner.nextInt();

            if (sum < 1 || sum > 10000) {
                System.out.println("1부터 10000 사이의 정수를 입력하세요.");
                continue;  // 범위를 벗어나면 다시 입력 요청
            } else {
                break; // 올바른 입력이 들어왔을 때 루프를 빠져나감
            }
        }


        for (int i=1; i <= sum; i++) {
            sum += i;
            System.out.println("입력받은 값 : " + sum + "덧셈의 총합 : " + i );
        }


    }
}
