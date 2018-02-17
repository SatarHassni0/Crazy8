import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

    private List<Player> players;

    public PlayerManager() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }
}
