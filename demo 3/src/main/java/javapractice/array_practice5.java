package javapractice;

import java.util.Scanner;

public class array_practice5 {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char로 변환

            // 알맞은 코드를 넣어 완성하시오 char배열 question에 담긴 문자의 위치를 임의로 바꾼다



            // 알맞은 코드를 넣어 완성하시오 char배열 question에 담긴 문자의 위치를 임의로 바꾼다
            System.out.printf("Q%d. %s의 정답을 입력하시오.>",
                                                                    i + 1, new String(question));
            String answer = scanner.nextLine();

            //trim()으로 answer의 좌우공백을 제거한 후, equals로 words[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞앗습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");

        }

    }
}
