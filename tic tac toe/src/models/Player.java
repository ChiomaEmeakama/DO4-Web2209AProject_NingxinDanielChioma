package models;

import java.awt.*;

public class Player  {
    private String name;
    private Square square;
    private int wins;

    public Player(String name, Square square) {
        this.name = name;
        this.square=square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void incrementWins() {
        wins++;
    }

    public void resetWins() {
        wins = 0;
    }
}


