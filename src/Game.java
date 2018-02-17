import java.util.Scanner;

public class Game {

    public Game() {

    }

    public void start() {
        Player player1 = new Player("joe", 1);
        Player player2 = new Player("bob", 2);
        GameHelper gameHelper = new GameHelper();

        gameHelper.playerManager.getPlayers().add(player1);
        gameHelper.playerManager.getPlayers().add(player2);

        Deck deck = new Deck();

        for (int i = 0; i <= 7; i++) {
            for (Player player : GameHelper.playerManager.getPlayers()) {
                if(player.getCards().size() != 8) {
                    deck.give(deck.getTopCard(), player);
                }
            }
        }

        System.out.print("Player one hand:" + player1.showHand());
        System.out.println("Player two hand:" + player2.showHand());

    }

    public void gameLoop() {
        Scanner input = new Scanner(System.in);
        GameHelper.gameEnded = false;

        while (!GameHelper.gameEnded) {
            System.out.println("place your card!");
            String c = input.next();

            for (Player player : GameHelper.playerManager.getPlayers()) {

            }
        }
    }
}
