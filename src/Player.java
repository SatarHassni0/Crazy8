import java.util.Scanner;

public class Player extends Hand {

    private String name;
    private int playerNumber;

    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public void turn() {
        System.out.println("Please enter the card " + playerNumber + ":");
        Scanner cardinput = new Scanner(System.in);
        int cardnumber = cardinput.nextInt();
        Card card = new Card(getCards().get(cardnumber).getSuit(), getCards().get(cardnumber).getRank());
    }
}
