import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;

public class DeckOfCards {


    public static void main(String[] args) {

    String player[] = {"Player 1","Player 2","Player 3","Player 4"};
    String[] suit = {"Clubs", "Diamons" ,"Spades","Hearts"};
    String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    String[][] deck = new String[suit.length][rank.length];

        for (int i =0; i<suit.length; i++){
            for(int j=0; j< rank.length;j++){
            deck[i][j] = suit[i] + " " + rank[j];
                System.out.println(deck[i][j]);
            }
            System.out.println(" ");
        }

        int randomSuit = ThreadLocalRandom.current().nextInt(1, 4);
        int randomrank = ThreadLocalRandom.current().nextInt(1, 13);
        for (int i=0; i< suit.length; i++){
            for (int j = 0; j< rank.length-4 ;j++){
                while (deck[randomSuit][randomrank] == null ){
                    randomSuit = ThreadLocalRandom.current().nextInt(1, 4);
                    randomrank = ThreadLocalRandom.current().nextInt(1, 13);
                }
                System.out.println();
                System.out.print(player[i]+":"+deck[randomSuit][randomrank]);
                deck[randomSuit][randomrank]=null;
            }
            System.out.println();
        }


   }
}