import Card.Deck;
import Card.Rank;
import Player.PokerHand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        var p1 = new PokerHand();
        var p2 = new PokerHand();
        var p3 = new PokerHand();
        var p4 = new PokerHand();
        var p5 = new PokerHand();

        List<PokerHand> playerList = new ArrayList<>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);


        var board = new Board(playerList);
        board.start();

        System.out.println(p5.getHand());


    }
}
