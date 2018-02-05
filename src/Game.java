public class Game {

    private Player player;

    public Game() {
    }

    public void start() {
        Player player1 = new Player("joe", 1);
        Player palyer2 = new Player("bob", 2);

        Deck deck = new Deck();
        deck.populate();
        System.out.print("deck has: " + deck.showHand());
    }
}
