package javapractice;

public class array_practice3 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        // 알맞은 코드를 넣어 완성하시오

        for (int i = 0; i < arr.length; i++) {
            int xyCount = 0;
            for (int j = 0; j < arr[i].length; j++)
                total += arr[i][j];
            xyCount = arr.length * arr[i].length;
            average = total / (float) xyCount;


        }
            // 알맞은 코드를 넣어 완성하시오
            System.out.println("total=" + total);
            System.out.println("average=" + average);

    }
}