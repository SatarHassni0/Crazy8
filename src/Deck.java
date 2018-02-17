import java.util.Collections;
import java.util.List;

public class Deck extends Hand {

    public Deck() {
        populate();
        shuffle();

    }

    public void populate() {
        for(Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                this.addCard(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(getCards());
    }

    public void initGame() {

    }

     public Card getTopCard() {
        return this.getCards().get(0);
     }

}
