package models;

import java.util.ArrayList;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;

    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
        // TODO: Initialize squares to be empty
        for(Square[] square : squares){
          for(Square square1: square) {
              square1 = Square.Empty;
              System.out.println(square1);
          }
        }
    }

    public void addListener(IGameListener listener)
    {
        listeners.add(listener);
    }

}
