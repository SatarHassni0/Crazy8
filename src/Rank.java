public enum Rank {

    ACE("Ace"), TWO("Two"), THREE("Three"),
    FOUR("Four"), FIVE("Five"), SIX("Six"),
    EIGHT("Eight"), NINE("Nine"), TEN("Ten"),
    KING("King"), QUEEN("Queen"), JACK("Jack");

    private String rankString;

    private Rank(String rankString) {
        this.rankString = rankString;
    }
}
