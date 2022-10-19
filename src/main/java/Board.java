import Card.*;
import Player.PokerHand;

import java.util.List;

public class Board {
    private Deck deck;

    private List<PokerHand> players; //Holds all players in the game
    private List<Card> board; //Cards on the board

    private int pot; //Winner pot


    //Find way to keep track of Dealer, Small and big blind

    //Index of dealer, i + 1 = small blind, i + 2 = big blind
    //Takes inn list of players then starts the game
    public Board(List<PokerHand> players) {
        this.players = players;
        deck = new Deck();

    }

    private void start(){
        /*
        * Dealer butten
        * Left of dealer (Small Blind) - Adds 5
        * Left of small blind (Big Blind) - small Blind bet 2x = adds 10
        *
        * Cards dealt out to all players - 2cards
        * Player left of big blind - starts
        *
        * Loop to all players have betted and have equal bets
        * ----
        * Fold, Call, Raise (Player input)
        * Fold - Trwos inn his cards - Folds and gives up
        * Call - Max the previous bet
        * Raise - Add more money to the bet: bet < NewBet
        * Move to next player
        * -----
        * All money goes into the pot
        * -----
        *
        * 3 cards draws 3 cards
        * First to act is the one left of the dealer
        *
        * Check - When player don't add money to pot but does not fold
        *
        * Loop again as last
        *
        *
        * Turn 4 card
        *
        * Loop again - if bet is matched the loop is over
        *
        *
        * Turn 5 card
        *
         * Loop again The River- if bet is matched the loop is over
         *
         * When round is over
         * Compare hands
         * The winner is decleard
         * The winner gets the pot
        *
        *
        *
        *
        *
        * */

    }
}
