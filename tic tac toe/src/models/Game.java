package models;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;
    private Square turn;
    private boolean firstTurn;
    private Random firstToPlay;
    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
        firstToPlay = new Random(); //input first turn's code TODO
        turn=Square.X;

        // TODO: Initialize squares to be empty


        for(Square[] squareRow : squares){
          for(Square square: squareRow) {
              square = Square.Empty;
          }
        }
    }

    public void addListener(IGameListener listener)
    {
        listeners.add(listener);
    }
    private Square whoIsTurn(){
        return turn;
    }
    public final void changeTheTurn(){
        if(turn==Square.O)
            turn=Square.X;
        else turn=Square.O;
    }




}
