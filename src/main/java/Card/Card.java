package Card;

public class Card {
    private Rank rank;
    private Suit suit;
    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank.ordinal();
    }

    public Suit getSuit() {
        return suit;
    }
}
