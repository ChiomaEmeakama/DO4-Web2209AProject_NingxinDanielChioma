package models;

import java.util.ArrayList;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;

    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
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

}
