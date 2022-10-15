package Card;

public class Card {
    private Rank rank;
    private char suit;
    public Card(Rank rank, char suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank.ordinal();
    }

    public char getSuit() {
        return suit;
    }
}
