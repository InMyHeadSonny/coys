package javapractice;

public class oop4 {
    public static void main(String[] args) {
        // 두 점의 좌표
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;

        // 거리 계산
        double distance = calculateDistance(x1, y1, x2, y2);

        // 결과 출력
        System.out.println("두 점 간의 거리: " + distance);
    }

    // 두 점 간의 거리를 계산하는 메서드
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
