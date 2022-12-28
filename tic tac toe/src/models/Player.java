package models;

import java.net.Socket;

public class Player implements Runnable {
    private Socket name;
    private int square;
    private int wins;

    public Player(Socket name, int square) {
        this.name = name;
        this.square=square;
    }

    public Socket getName() {
        return name;
    }

    public void setName(Socket name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
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

    public void setSuspended(boolean b) {
    }

    public void otherPlayerMoved(int location) {
    }

    @Override
    public void run() {

    }
}


