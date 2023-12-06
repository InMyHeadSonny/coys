package javapractice;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

// 첫째 줄에 다음 세 가지 중 하나를 출력한다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.

/* 내 생각 : A와 B에 입력 값을 넣어 변수를 초기화한다 => 조건식을 추가하여 문제해결 */

import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        Scanner input_A = new Scanner(System.in);
        Scanner input_B = new Scanner(System.in);

        do {
            System.out.println("1~10000중 A에 들어갈 숫자를 입력하시오");
            A = input_A.nextInt();

            if (A < 1 || A > 10000) {
                System.out.println("입력값이 범위를 벗어납니다. 다시 입력하세요");
                continue;
            }

            System.out.println("1~10000중 B에 들어갈 숫자를 입력하시오");
            B = input_B.nextInt();

            if (B < 1 || B > 10000) {
                System.out.println("입력값이 범위를 벗어납니다. 다시 입력하세요");
                continue;
            }

            if (A < B) {
                System.out.println("<");
                break;
            } else if (A > B) {
                System.out.println(">");
                break;
            } else {
                System.out.println("==");
                break;
            }
        } while (A != B);

    }
}


/* 궁금한점 : A < 1 || A > 10000 검증을 하지않고 변수선언으로 범위제한을 나타낼수있는가?

            ex = input < 1 || input > 10000

            ex라는 변수호출하여  if (A = ex) 조건식이 호출되게할수있나 */
