package javapractice;
class Tv1 {
    boolean power; // 전원상태(on/off(
    int channel;    // 채널

    void power() { power= ! power;}
    void channelup() { ++channel;}
    void channelDown() { --channel;}

}

class SmartTv extends Tv1 { //smartTv는 tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;
    void displayCaption(String text) {

        if (caption) { //캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);

        }
    }

}

class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;                       // 조상 클래스로 상속받은 멤버
        stv.channelup();                        // 조상 클래스로 상송받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;                     // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, World");
    }
}

public class oops1 {
}

