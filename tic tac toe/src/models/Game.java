package models;

import java.util.ArrayList;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;
    private Square turn;
    private Player playerX,playerO;
    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();

        turn = Square.X;
        playerX = new Player("player x");

        playerO = new Player("player O");
        // TODO: Initialize squares to be empty


        for (Square[] squareRow : squares) {
            for (Square square : squareRow) {
                square = Square.Empty;
            }
        }

    }
    public String getPlayerXName(){
        return playerX.getName();
    } public String getPlayerOName(){
        return playerO.getName();
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

    private Square setButton(int position) {

        switch (whoIsTurn()) {
            case "x":
                if (checkEmpty(position)) return Square.X;
                else throw new RuntimeException("this button is not empty");
            case "o":

                if (checkEmpty(position)) return Square.O;
                else throw new RuntimeException("this button is not empty");


        }
        return null;
    }

    public boolean checkEmpty(int position) {
        switch (position) {
            case 0:
                if (squares[0][0] == Square.Empty) return true;

            case 1:
                if (squares[0][1] == Square.Empty) return true;
            case 2:
                if (squares[0][2] == Square.Empty) return true;
            case 3:
                if (squares[1][0] == Square.Empty) return true;
            case 4:
                if (squares[1][1] == Square.Empty) return true;
            case 5:
                if (squares[1][2] == Square.Empty) return true;
            case 6:
                if (squares[2][0] == Square.Empty) return true;
            case 7:
                if (squares[2][1] == Square.Empty) return true;
            case 8:
                if (squares[2][2] == Square.Empty) return true;
            default:
                return false;


        }
    }
    public boolean canDraw(){
        int counter =0;
        for(Square[] row:squares){
            for(Square square : row)
                if((square==Square.Empty))
                    counter++;
        }
        if(counter>=1)
        return false;
        else return true;
    }

    public void setSquares(int position) {
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public boolean checkWinnerX() {
        /*
        if(squares[0][0]==squares[0][1]&&squares[0][1]==squares[0][2]){

        }*/



        for (int i = 0; i < 3; i++) {
            for (int j = 0,counter = 0; j < 3; j++) {
                if (squares[i][j] == Square.X)
                    counter++;
                if(counter==3) {
                    playerX.incrementScore();
                    return true;

                }
            }


        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0,counter = 0; j < 3; j++) {
                if (squares[i][j] == Square.O)
                    counter++;
                if(counter==3) {
                    playerO.incrementScore();
                    return true;

                }
            }


        }
        if(squares[0][0]==squares[1][1]&&squares[1][1]==squares[2][2]&&squares[1][1]==Square.X)
            return true;

        if(squares[0][2]==squares[1][1]&&squares[1][1]==squares[2][0]&&squares[1][1]==Square.X)
            return true;

        return false;
    }
    public boolean checkWinnerO(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0,counter = 0; j < 3; j++) {
                if (squares[j][i] == Square.O)
                    counter++;
                if(counter==3) {

                    playerO.incrementScore();
                    return true;

                }
            }


        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0,counter = 0; j < 3; j++) {
                if (squares[j][i] == Square.O)
                    counter++;
                if(counter==3) {
                    playerO.incrementScore();
                    return true;

                }
            }


        }

        if(squares[0][0]==squares[1][1]&&squares[1][1]==squares[2][2]&&squares[1][1]==Square.O)
            return true;

        if(squares[0][2]==squares[1][1]&&squares[1][1]==squares[2][0]&&squares[1][1]==Square.O)
            return true;
        return false;
    }


}
