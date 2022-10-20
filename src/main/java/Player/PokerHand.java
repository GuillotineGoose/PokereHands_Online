package Player;

import Card.*;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    private List<Card> hand;//Player poker hand

    private int money; //Total amount of money player have
    private int bet; //Amount player have placed in bet

    private boolean folded;

    public PokerHand() {
        hand = new ArrayList<>();
        money = 500;
        folded = false;
    }

    public void playerCallOptions(String option){
        switch (option){
            case "f":
                //Player folds
                fold();
                break;
            case "c":
                //Player calls
                call();
                break;
            case "r":
                //Player raises
                raise();
                break;
        }

    }

    private void fold(){
        setFolded(true);

    }
    //Calls new bet. If player raise by 5, call is adding 5 to bet
    private void call(){

    }
    //Check is not adding new bet. If bet is the same, and player cheks the round continiues to next player
    private void check(){

    }
    private void raise(){

    }




    public void addCard(Card card) {
        hand.add(card);
    }

    //places bet for player

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBet() {
        return bet;
    }

    public void placeBet(int amount) {
        this.bet = amount;
    }

    public boolean haveFolded() {
        return folded;
    }

    public void setFolded(boolean folded) {
        this.folded = folded;
    }
}
