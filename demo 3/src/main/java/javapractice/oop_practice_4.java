package javapractice;


import java.sql.SQLOutput;

class Data {int x; }
public class oop_practice_4 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x =" + d.x);
    }

    static void change(int x) { //기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}


//기본형 매개변수는 변수의 값을 read only