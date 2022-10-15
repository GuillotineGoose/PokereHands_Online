package Card;

public class Card {
    private Rank rank;
    private Suit suit;
    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }


    @Override
    public String toString() {
        return rank + " " + suit;
    }
}
