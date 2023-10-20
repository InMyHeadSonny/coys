public class practice3_3 { /* 100의자리 이하를 버리는 코드 */
    public static void main(String[] args) {
        int num = 456;
        System.out.println(num / 100*100); /* int 에서 소숫점은 버려진다. 4.56에서 0.56은 없어지고 4만남게된다. 거기서 100을 곱하여 나타낸다*/
    }
}
