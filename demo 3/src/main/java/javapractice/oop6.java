package javapractice;

// oop4에서 작정한 클래스메서드를 인스턴스 메서드로 정의

public class oop6 {

    int x;
    int y;

    oop6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(int x2, int y2)  {

        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }



}

class Exercise6_6 {
    public static void main(String[] args) {
        oop6 p = new oop6(1, 1);

        System.out.println(p.calculateDistance(2, 2));
    }
}