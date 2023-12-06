package javapractice;
import java.util.Arrays;
public class arrays_3 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i < 100; i++) {
            int n = (int)(Math.random() * 10); //0~9의 값을 임의로 받는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
