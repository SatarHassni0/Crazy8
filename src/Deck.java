public class Deck extends Hand {


    public Deck() {

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

    }

  /*  public int cardsLeft();

    public Card dealCard();*/
}
