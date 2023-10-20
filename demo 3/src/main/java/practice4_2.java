public class practice4_2 { /* 1부터 20까지의 정수 중에서 2또는 3의배수가 아닌 수의 총합을 구하시오 */
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 20) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.printf("2또는 3의 배수가 아닌 수의 총합은 %d 입니다.", sum);
    }
}
