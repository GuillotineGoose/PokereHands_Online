import Card.Deck;
import Old.PokerHand;

import java.util.Arrays;

public class Board {
    private PokerHand whitePlayer;
    private PokerHand blackPlayer;

    private Deck deck;

    //initializes the Board class
    public Board(){
        whitePlayer = new PokerHand();
        blackPlayer = new PokerHand();

        deck = new Deck();
    }
    
    public void setWhitePlayer(){

    }

    public void setBlackPlayer(){

    }
    public void startGame(){
        //You can segregate the class further into smaller methods if you want and even create a game-loop

        //Basic beginner of game
        deck.shuffle();
        dealCards();


        //Converts the hands to and int[] that holds the scores
        var whiteScore = whitePlayer.getHandScore();
        var blackScore = blackPlayer.getHandScore();

        for(var card : whitePlayer.getHand()) {
            System.out.print(card.getRank());
            System.out.print(card.getSuit());
        }
        System.out.println(" white");

        for(var card : blackPlayer.getHand()) {
            System.out.print(card.getRank());
            System.out.print(card.getSuit());
        }
        System.out.println(" black");


        //prints out hands so you can see it on the terminal. This can ofc be romoved
        System.out.println(Arrays.toString(whiteScore));
        System.out.println(Arrays.toString(blackScore));

        checkWinner(whiteScore, blackScore);

    }


    private void dealCards(){
        for (int i = 0; i < 10; i++){
            var card = deck.drawCard();

            //gets the remainder of i / 2 which means every second loop white gets a card from the deck
            if (i % 2 == 0)
                whitePlayer.addCard(card);
            else
                blackPlayer.addCard(card);
        }
    }


    public void checkWinner(int[] whiteScore, int[] blackScore){
        //ches hand of white and black to see who is the winner.
        if (whiteScore[0] > blackScore[0])
            System.out.println("White is winner");
        else if (whiteScore[0] < blackScore[0])
            System.out.println("Black is winner");
        //If the hands are equal they will compare which hand has the highest card to pick the winnr
        else {
            if (whiteScore[1] > blackScore[1])
                System.out.println("White is winner");
            else if (whiteScore[1] < blackScore[1])
                System.out.println("Black is winner");
            else {
                if (whiteScore[2] > blackScore[2])
                    System.out.println("white is winner");
                else if (whiteScore[2] < blackScore[2])
                    System.out.println("Black is winner");


                else {
                    boolean tie = false;
                    int[] whiteUsedRanks = new int[5];
                    int[] blackUsedRanks = new int[5];
                    whiteUsedRanks[0] = whiteScore[1];
                    blackUsedRanks[0] = blackScore[1];
                    int usedRankIndexer = 1;

                    if (whiteScore[2] != 0){
                        whiteUsedRanks[1] = whiteScore[2];
                        blackUsedRanks[1] = blackScore[2];
                        usedRankIndexer = 2;
                    }
                    int whiteTiebreakerResult;
                    int blackTiebreakerResult;
                    while(!tie) {
                        whiteTiebreakerResult = whitePlayer.getTiebreaker(whiteUsedRanks);
                        blackTiebreakerResult = blackPlayer.getTiebreaker(blackUsedRanks);
                        if (whiteTiebreakerResult > blackTiebreakerResult) {
                            System.out.println("white is winner");
                            tie = true;

                        }
                        else if (whiteTiebreakerResult < blackTiebreakerResult) {
                            System.out.println("black is winner");
                            tie = true;
                        }
                        else {
                            whiteUsedRanks[usedRankIndexer] = whiteTiebreakerResult;
                            blackUsedRanks[usedRankIndexer] = blackTiebreakerResult;
                            usedRankIndexer++;
                            if (usedRankIndexer == 5) {
                                System.out.println("Tie!");
                                tie= true;
                            }
                        }
                    }
                }

            }
        }
    }
}
