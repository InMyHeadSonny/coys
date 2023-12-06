package javapractice;

import java.lang.module.FindException;

public class oops5 {
    public static void main(String[] args) {
        Car3 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       // car = (car)fe;에서 형변환ㅇ ㅣ생략됨
        // car.water(); 컴파일에러 Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입 형변환 생략불가
        fe2.water();
    }
}

class Car3 {
    String color1;
    int door1;

    void drive() { //운전하는기능
        System.out.println("dirve, Brrr~");
    }

    void stop() { //멈추는기능

        System.out.println("stop");
    }
}

class FireEngine extends Car3 { //소방차
    void water() {
        System.out.println("water");
    }
}


//fe 값을 car에 저장