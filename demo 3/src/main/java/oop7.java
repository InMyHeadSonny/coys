// static으로 바꿔야하는것과 그이유는?

class Marine {
    int x = 0, y = 0; //Marine 의 위치좌표
    static int hp = 60; // 현재 체력 (체력은 공통 접두)
    int weapon = 6; // 공격력 (바이오닉과 메카닉혹은 공중유닛으로 별도 지정이되기떄문에 안된다.)

    int armor = 0; // 방어력 (바이오닉과 메카닉혹은 공중유닛으로 별도 지정이되기떄문에 안된다.)

    void weaponUP() {
        weapon++;
    }

    void armorUP() {
        armor++;
    }

     void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}



public class oop7 {
}
