public class Player {
    String name;
    private final int playerID;

    public Player(String name, int playerID) {
        this.name = name;
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setName(String firstName) {
        this.name = name;
    }

}
