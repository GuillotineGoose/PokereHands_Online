import Card.Deck;

public class Main {
    public static void main(String[] args) {
        var deck = new Deck();

        System.out.println(deck);

        System.out.println(deck.drawCard());
        System.out.println(deck);
        System.out.println(deck.drawCard());
        System.out.println(deck);
        System.out.println(deck.drawCard());
        System.out.println(deck);

    }
}
