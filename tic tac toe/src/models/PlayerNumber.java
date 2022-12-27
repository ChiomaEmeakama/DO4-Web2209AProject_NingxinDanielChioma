package models;

public enum PlayerNumber {
    PLAYER_1("Player 1"),
    PLAYER_2("Player 2");

    private String text;
    PlayerNumber(String s) {
        text=s;
    }

    public String getText() {
        return text;
    }

}
