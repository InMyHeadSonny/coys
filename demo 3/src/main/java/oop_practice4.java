class Outer{
    class Inner {
        int iv = 100;
    }
}


public class oop_practice4 {
    public static void main(String[] args) {
        // Outer 클래스의 인스턴스 생성
        Outer aa = new Outer();

        // Inner 클래스의 인스턴스 생성
        Outer.Inner bb = aa.new Inner();

        // Inner 클래스의 인스턴스를 통해 iv 변수에 접근
        System.out.println(bb.iv);
    }
}
