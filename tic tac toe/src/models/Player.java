package models;

import java.net.Socket;

public class Player implements Runnable {
    private String nameString;
    private Square id;
    private int score;

    public Player(String name, Square id){
        this.nameString=name;
        this.id = id;
    }

    public String getName() {
        return nameString;
    }

    public Square getId()
    {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore() {
        score++;
    }

    public void resetScores() {
        score = 0;
    }

    public void setSuspended(boolean b) {
    }

    public void otherPlayerMoved(int location) {
    }

    @Override
    public void run() {

    }
}


