package javapractice;
// 참조형매개변수로 리그오브레전드 게임 내에서 밸런스패치시 아이템스텟이 바뀌었을때 변경하는 방법

class item {int attack; }

public class oop_practice_6_game {
    public static void main(String[] args) {


        item longSword = new item();
        longSword.attack = 10;
        System.out.println("롱소드 : 공격력 = " + longSword.attack);

        change(longSword);
        System.out.println("month.day | patch note 롱소드의 공격력이 8로 감소됩니다.");
        System.out.println("롱소드 : 공격력 (change) = " +longSword.attack);
    }

    static void change(item longSowrd) {//참조형 매개변수
        longSowrd.attack = 8;
        System.out.println("변경 | 롱소드 : 공격력 = " + longSowrd.attack);

    }
}