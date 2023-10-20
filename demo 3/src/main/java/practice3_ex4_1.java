import java.util.Random;
public class practice3_ex4_1 {
    public static void main(String[] args) {
        int stack = 0;
        Random random = new Random();

        while (stack <= 20) {
            int randomMinion = random.nextInt(20) + 1;

            if (randomMinion <= 3 + stack) {
                System.out.println(stack +"스택+3기본데미지 이하체력의" + " 미니언이 처치되었습니다 " + stack
                + "스택 저장중");
                stack += 3; // 전위형 증감 연산자 사용
            } else {
                System.out.println(stack + "스택+3기본데미지 이상체력의 미니언이므로 " +"미니언을 처치못했습니다. " + stack +" 스택 저장중");
            }

            if (stack >= 20) {
                break;
            }
        }
    }
}