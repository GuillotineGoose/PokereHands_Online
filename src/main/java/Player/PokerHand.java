package Player;

import Card.*;

import java.util.*;
import java.util.stream.IntStream;

public class PokerHand {
    Map<Integer, List<Card>> handValues = new HashMap<>();
    boolean isChecked = false;

    private List<Card> hand = new ArrayList<>();

    public void addCard(Card card) {
        hand.add(card);
    }



    private   Map<Integer, List<Card>>  checkHand(){

        for (var card : hand) {
            if (!handValues.containsKey(card.getRank())) {
                handValues.put(card.getRank().ordinal(), new ArrayList<>());
            }

            handValues.get(card.getRank()).add(card);
        }


        return handValues;
        }

        //This is used to compare all the hands from "high-card" to "four og a kind" to get a value that can be compared with other players
        /* Here I rage the hands from 1-8 where a higher number beats a lower one. eks "Four of a kind" = 8 > "Pair" = 1

        The return value is a Map with two integers where the first represents the hand (pair -> four of a kind) and the second integer represents the rank of the highest card. eks  Pair Q♥  returns Map<1, 12>
        */
        public int[] getHandScore(){

        var score = new int[3];
        var scoreRank = 0;

        scoreRank = getFourOfAKind();
        if (scoreRank != 0){
            score[0] = 8;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getFullhouse()[0]; //får ut verdien av de 3 like
        if (scoreRank != 0){
            score[0] = 7;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getFlush();
        if (scoreRank != 0){
            score[0] = 6;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getStraight();
        if (scoreRank != 0){
            score[0] = 5;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getThreeOfAKind();
        if (scoreRank != 0){
            score[0] = 4;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getTwoPair()[1];
        if (scoreRank != 0){
            score[0] = 3;
            score[1] = scoreRank;
            score[2] = getTwoPair()[0];
            return score;
        }

        scoreRank = getPair();
        if (scoreRank != 0){
            score[0] = 2;
            score[1] = scoreRank;
            return score;
        }

        scoreRank = getTiebreaker();
            score[0] = 1;
            score[1] = scoreRank;
        return score;

        }

    public int getTiebreaker(int[]... usedRanks) {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }
        List<Integer> ranks = new ArrayList<>();
        ranks.addAll(handValues.keySet());

        if (usedRanks.length == 0) {
            return ranks.get(ranks.size() - 1);
        }


        for(int x = ranks.size() - 1; x > 0; x--) {

            int finalX = x;
            if (!IntStream.of(usedRanks[0]).anyMatch(z -> z == ranks.get(finalX))){
               return ranks.get(x);
            }
        }
        return 0;
    }

    public int getPair() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        for (int rank : handValues.keySet()) {
            if (handValues.get(rank).size() == 2){
                return rank;
            }
        }
        return 0;
    }

    public int[] getTwoPair() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        var twoPairs = new int[2];
        int i = 0;
        for (int rank : handValues.keySet()) {
            if (handValues.get(rank).size() == 2){
                twoPairs[i] = rank;
                i++;
            }
        }

        return twoPairs;
    }






    public int getThreeOfAKind() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        for (int rank : handValues.keySet()) {
            if (handValues.get(rank).size() == 3){
                return rank;
            }
        }
        return 0;
    }

    public int[] getFullhouse() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        var fullHouse = new int[2];

        fullHouse[0] = getThreeOfAKind();
        fullHouse[1] = getPair();

        return fullHouse;
    }

    public int getStraight() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        List<Integer> ranks = new ArrayList<>();
        ranks.addAll(handValues.keySet());


        Collections.sort(ranks);

        for (int i = 0; i < ranks.size() - 1; i++) {
            if (ranks.get(i) != ranks.get(i + 1) - 1)
                return 0;

        }
        return ranks.get(4);
    }

    public int getFlush() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        Suit suit = hand.get(0).getSuit();
        for(int x= 0; x < hand.size() -1; x++){
            if (!(hand.get(x).getSuit() == hand.get(x+1).getSuit())){
                return 0;
            }
        }

        return getTiebreaker();

    }

    public int getFourOfAKind() {
        if (!isChecked){
            checkHand();
            isChecked = true;
        }

        for (int rank : handValues.keySet()){
            if (handValues.get(rank).size() == 4)
                return rank;
        }

        return 0;
    }

    public List<Card> getHand() {
        return hand;
    }
}
