import java.util.Random;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard((i % 10) + 1, i < 10 && (i % 10 == 0 || i % 10 == 2 || i % 10 == 7));
        }
    }

    void shuffle() {
        Random random = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap
            SutdaCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    SutdaCard pick() {
        if (cards.length == 0) {
            // 덱에 카드가 없으면 null 반환하거나 적절한 예외 처리를 수행할 수 있음
            return null;
        }

        Random pick = new Random();
        int index = pick.nextInt(cards.length);
        SutdaCard selectedCard = cards[index];

        // 배열에서 선택한 카드 제거
        removeCard(index);

        return selectedCard;
    }

    private void removeCard(int index) {
        // 배열에서 선택한 인덱스의 카드를 삭제하고 배열을 조정
        SutdaCard[] newCards = new SutdaCard[cards.length - 1];
        for (int i = 0, j = 0; i < cards.length; i++) {
            if (i != index) {
                newCards[j++] = cards[i];
            }
        }
        cards = newCards;
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class oop_practice1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        deck.shuffle();

        // 셔플한 후 출력
        System.out.println("\n셔플 후:");
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");
        System.out.println("");
        System.out.println("선택된 카드: " + deck.pick());
        System.out.println("선택된 카드: " + deck.pick());

    }
}
