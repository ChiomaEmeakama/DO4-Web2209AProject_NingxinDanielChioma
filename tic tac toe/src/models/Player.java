package models;

public class Player  {
    private String name;
    private int score;


    public Player(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }


    public void resetScore() {
        score = 0;
    }
    public void resetName(){
        name="";
    }
}


