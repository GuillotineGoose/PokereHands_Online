package Poker;

import Card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerHand {
    private List<Card> hand; //holds player Cards

    private int money; //How much money the player have
    private int bet; //How much the player has in the bet

    private boolean folded = false; //Checks if the player have folded

    public PokerHand(){
        hand = new ArrayList<>();
    }

    public boolean playerDecision(Scanner input, int currentBet){
        String playerChoise = input.next();
        if (playerChoise.equals("f")){
            fold();
            return false;
        }
        else if (playerChoise.equals("c")) {
            call(currentBet);
            return false;
        }
        else if (playerChoise.equals("r")) {
            raise(input);
            return false;
        }
        else
            return true;
    }

    private void fold(){
        System.out.println("folded");
        setFolded(true);

    }
    private void call(int currentAmount){
        System.out.println(bet);
        int newbet = currentAmount - this.bet;

        money = money - bet;

        this.bet = newbet + this.bet;
        System.out.println("Call");

        System.out.println(bet);

    }
    private void raise(Scanner input){
        System.out.println("Amount");
        System.out.print('>');
        int amount = input.nextInt();
        System.out.println("Raise");

        bet = amount + bet;
    }


    public void addCard(Card card) {
        hand.add(card);
    }

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

    public void setBet(int bet) {
        this.bet = bet;
    }

    public boolean haveFolded() {
        return folded;
    }

    public void setFolded(boolean folded) {
        this.folded = folded;
    }
}
