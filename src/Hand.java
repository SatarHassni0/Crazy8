import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void clearCards() {
        cards.clear();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public String showHand() {
        String str = "";
        for(Card c : cards) {
            str += c.toString() + "\n";
        }
        return str;
    }

    public boolean give(Card card, Hand otherHand) {
        if (!cards.contains(card)) {
            return false;
        }
        cards.remove(card);
        otherHand.addCard(card);
        return true;
    }

    public List<Card> getCards() {
        return cards;
    }
}
