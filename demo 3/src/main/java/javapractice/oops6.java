package javapractice;

class Product {
    int price;      //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);     //보너스점수는 제품가격의 10%
    }
}
class Tvone extends Product {
    Tvone() {
        //조상클래스의 생성자 Product(int price)를 호출한다
        super(1000000); //Tv의 가격을 100만원으로한다
    }

    public String toString() { return "Tv";}
}

class Computer extends Product {
    Computer() { super(2000000); }

    public String toString() {return "Computer";}
}
class buyer { //고객, 물건을 사는사람
    int money = 300; //소유금액
    int bonusPoint = 0;     // 보너스 포인트

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        money -= p.price;       //가진돈에 구입한제품의 가격을뺀다
        bonusPoint += p.bonusPoint; //제품의 보너스포인트를 추가한다.
        System.out.println(p + "을/를 구입했습니다");
    }
}

public class oops6 {
    public static void main(String[] args) {
        buyer b =new buyer();

        b.buy(new Tvone());
        b.buy(new Computer());

        System.out.println("현재남은돈은 " +b.money + "원");
        System.out.println("현재 포인트는" + b.bonusPoint + "포인트");
    }
}
