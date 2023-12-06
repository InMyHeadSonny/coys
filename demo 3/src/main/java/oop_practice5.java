class Outer1 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(Inner.this.value);
            System.out.println(Outer1.this.value);
        }
    }
}


public class oop_practice5 {
    public static void main(String[] args) {
        Outer1 aa = new Outer1();
        Outer1.Inner bb = aa.new Inner();

        bb.method1();
    }
}
