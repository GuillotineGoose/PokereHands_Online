package Poker;

import Card.Card;
import Card.Deck;

import java.util.*;

public class Board {

    private Deck deck;
    private List<Card> board; //Holds all the cards on the board

    private List<PokerHand> players; //Holds all the players in the game
    private int pot; //Holds toal amount on the board

    private int dealerIndex; //Knows who the dealer is

    public Board(List<PokerHand> players) {
        this.players = players;
        deck = new Deck();

        setUp();
    }


    private void setUp(){
        dealerIndex = new Random().nextInt(players.size());

        //Make small and bigblind place bet
        players.get(setSmallBlind()).setBet(5);
        players.get(getBigBlind()).setBet(10);


        //Deal out cards
        dealCards();
    }

    private void dealCards() {
        for (int i = 0; i < players.size() * 2; i++){
            var card = deck.drawCard();
            if (i >= players.size())
                players.get(i - players.size()).addCard(card);
            else
                players.get(i).addCard(card);
        }
    }


    private int setSmallBlind(){
        var smallBlind = dealerIndex + 1;

        if (smallBlind >= players.size()){
            smallBlind = smallBlind - players.size();
        }

        return smallBlind;
    }
    private int getBigBlind(){
        var smallBlind = dealerIndex + 2;

        if (smallBlind >= players.size()){
            smallBlind = smallBlind - players.size();
        }

        return smallBlind;
    }


    public void firstRound(Scanner input){

        var currentPlayer = getStartPlayer();

        var currentBet = players.get(getBigBlind()).getBet();

        int callCount = 0;
        Set<PokerHand> foldCount = new HashSet<>();

        while (true){

            System.out.println(foldCount.toString());
            System.out.println(callCount);

            if ((foldCount.size() + callCount) == players.size())
                break;

            if (currentBet == players.get(currentPlayer).getBet()){
                callCount++;
                continue;
            }
            //If player has folded he is skiped and added to the folder count
            if (players.get(currentPlayer).haveFolded()){
                System.out.println("sssssssc");
                foldCount.add(players.get(currentPlayer));

                continue;
            }

            boolean playerNotDecided = true;
            while (playerNotDecided) {
                playerNotDecided = players.get(currentPlayer).playerDecision(input, currentBet);
            }

            //Player raises bet and resets the loop
            if (currentBet < players.get(currentPlayer).getBet()) {
                currentBet = players.get(currentPlayer).getBet();
                callCount = 0;
            }


            currentPlayer++;
            if (currentPlayer >= players.size())
                currentPlayer = currentPlayer - players.size();
        }
        System.out.println("Round done");

    }
    private int getStartPlayer(){
        var smallBlind = dealerIndex + 3;

        if (smallBlind >= players.size()){
            smallBlind = smallBlind - players.size();
        }

        return smallBlind;
    }

}
