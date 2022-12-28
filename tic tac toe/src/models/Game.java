package models;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;
    private Square turn;

 /*   private boolean firstTurn;
  //  private Random firstToPlay;
    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
     //   firstToPlay = new Random(); //input first turn's code TODO
        turn=Square.X;
*/

    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();

        turn = Square.X;


        // TODO: Initialize squares to be empty


        for (Square[] squareRow : squares) {
            for (Square square : squareRow) {
                square = Square.Empty;
            }
        }
    }

    public void addListener(IGameListener listener) {
        listeners.add(listener);
    }

    public String whoIsTurn() {
        if (turn == Square.X) return "x";
        else if (turn == Square.O) return "o";
        else return "Empty";
    }

    public final void changeTheTurn() {
        if (turn == Square.O) turn = Square.X;
        else turn = Square.O;
    }

    private Square setButton(int  position) {

        switch (whoIsTurn()) {
            case "x":
                if (checkEmpty(position)) return Square.X;
                else throw new RuntimeException("this button is not empty");
            case "o":

                if (checkEmpty(position)) return Square.O;
                else  throw new RuntimeException("this button is not empty");


        }
        return null;
    }

    public boolean checkEmpty(int  position) {
        switch (position) {
            case 0:
                if (squares[0][0] == Square.Empty)
                    return true;

            case 1:
                if (squares[0][1] == Square.Empty)
                    return true;
            case 2:
                if (squares[0][2] == Square.Empty)
                    return true;
            case 3:
                if (squares[1][0] == Square.Empty)
                    return true;
            case 4:
                if (squares[1][1] == Square.Empty)
                    return true;
            case 5:
                if (squares[1][2] == Square.Empty)
                    return true;
            case 6:
                if (squares[2][0] == Square.Empty)
                    return true;
            case 7:
                if (squares[2][1] == Square.Empty)
                    return true;
            case 8:
                if (squares[2][2] == Square.Empty)
                    return true;
            default:
                return false;



        }
    }
    public void setSquares ( int position){
        try {
            switch (position) {
                case 0:
                    squares[0][0] = setButton(position);
                    changeTheTurn();
                    break;
                case 1:
                    squares[0][1] = setButton(position);
                    changeTheTurn();
                    break;
                case 2:
                    squares[0][2] = setButton(position);
                    changeTheTurn();
                    break;
                case 3:
                    squares[1][0] = setButton(position);
                    changeTheTurn();
                    break;
                case 4:
                    squares[1][1] = setButton(position);
                    changeTheTurn();
                    break;
                case 5:
                    squares[1][2] = setButton(position);
                    changeTheTurn();
                    break;
                case 6:
                    squares[2][0] = setButton(position);
                    changeTheTurn();
                    break;
                case 7:
                    squares[2][1] = setButton(position);
                    changeTheTurn();
                    break;
                case 8:
                    squares[2][2] = setButton(position);
                    changeTheTurn();
                    break;


            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }


    }
    public boolean checkWinner()
    {
        for (int i = 0; i < 3; i++)
        {
            if ((squares[i][0] == squares[i][2]) && (squares[i][0] == squares[i][3]))
            {

            }

        }
    }
    

