import org.apache.logging.log4j.util.ProcessIdUtil;

class Product
{
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price /10.0);
    }
}
class Tv extends Product {

    Tv(int price) {
        super (price);
    }

    public String toString() {
        return "Tv";
    }
}

public class oop_practice2 {
    public static void main(String[] args) {
        Tv t = new Tv(100);
    }
}
