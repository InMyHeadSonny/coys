public class practice4_3 { /* 1+(1+2) ... 1+(1+2+3..+10)*/
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수를 0으로 초기화
        int i = 1;
        int result = 0; // 결과를 저장할 변수를 초기화

        System.out.print("중간 결과: ");
        while (i <= 10) {
            sum += i; // i를 누적해서 sum에 더함
            result += sum; // 중간 결과를 result에 누적
            System.out.print(sum + " "); // 중간 결과 출력
            i++; // i를 증가
        }

        System.out.println(result);
        System.out.println("최종 결과: " + result); // 결과 출력
    }
}
