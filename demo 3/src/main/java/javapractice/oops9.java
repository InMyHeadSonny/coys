package javapractice;

class Ex7_11 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
         Myinterface.staticMethod();
        Myinterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements Myinterface, Myinterface2 {
    public void method1() {
        System.out.println("method1() in Child3");         //오버라이딩
    }
}

class Parent3 {
    public void method2() {
        System.out.println("method2() in Parent3");
    }
}

interface Myinterface {
    default void method1() {
        System.out.println("method1() in Myinterface");
    }

    default void method2() {
        System.out.println("method2() in Myinterface");
    }

    static void staticMethod() {
        System.out.println("staticeMethod() in Myinterface");
    }
}

interface Myinterface2 {
    default void method1() {
        System.out.println("method1() in Myinterface2");
    }

    static void staticMethod() {
        System.out.println("staticeMethod() in Myinterface2");
    }
}



public class oops9 {
}
