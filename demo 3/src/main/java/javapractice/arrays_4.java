package javapractice;

public class arrays_4 {
    public static void main(String[] args) {
        int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성.

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for(int i=0; i < ball.length; i++)
            ball[i] = i+1; // ball[0]에 1이 저장된다.

        int tmp = 0;
        int j = 0;

        // 배열의 i번째 요소와 임의의 요소에 저장값 서로 바꿔서 값을 섞는다.
        // 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
        for(int i=0; i < 6; i++) {
            j = (int)(Math.random() * 45); // 0~44범위의 임의의 값을 얻는다. why? |
            // Math.random() 함수는 0 이상 1 미만의 난수를 생성하므로 Math.random() * 45는 0 이상 45 미만의 값을 가집니다.
            // 이 값은 소수점 이하의 부분을 가질 수 있으며, (int)로 캐스트하면 이 부분이 삭제되어 0에서 44 사이의 정수를 얻게 됩니다.
            tmp     = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        //배열 ball의 앞에서 부터 6개의 요소를 출력한다.
        for(int i=0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}
