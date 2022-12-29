package models;

import java.util.ArrayList;

public class Game {
    private final Square[][] squares;
    private final ArrayList<IGameListener> listeners;
    private Square turn;
    private Player playerX,playerO;
    public Game() {

 /*   private boolean firstTurn;
  //  private Random firstToPlay;
    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
     //   firstToPlay = new Random(); //input first turn's code TODO
        turn=Square.X;
*/


        squares = new Square[3][3];
        listeners = new ArrayList<>();

        turn = Square.X;
        playerX = new Player("player X");

        playerO = new Player("player O");
        // TODO: Initialize squares to be empty


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                squares[i][j]=Square.Empty;
            }
        }


    }
    public Player getPlayerX(){
        return playerX;
    }

    public Player getPlayerO(){
        return playerO;
    }

    public void addListener(IGameListener listener) {
        listeners.add(listener);
    }

    public String whoIsTurn() {
        if (turn == Square.X) return "X";
        else if (turn == Square.O) return "O";
        else return "Empty";
    }

    public final void changeTheTurn() {
        if (turn == Square.O) turn = Square.X;
        else turn = Square.O;
    }

    private Square getSquare(int position) {


        switch (whoIsTurn()) {
            case "X":
                if (checkEmpty(position)) return Square.X;
                else throw new RuntimeException("this button is not empty");
            case "O":

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
        return counter == 0;
    }

    public void setSquares(int position) {
        try {
            switch (position) {
                case 0:
                    squares[0][0] = getSquare(position);

                    break;
                case 1:
                    squares[0][1] = getSquare(position);
                    break;
                case 2:
                    squares[0][2] = getSquare(position);
                    break;
                case 3:
                    squares[1][0] = getSquare(position);
                    break;
                case 4:
                    squares[1][1] = getSquare(position);
                    break;
                case 5:
                    squares[1][2] = getSquare(position);
                    break;
                case 6:
                    squares[2][0] = getSquare(position);
                    break;
                case 7:
                    squares[2][1] = getSquare(position);
                    break;
                case 8:
                    squares[2][2] = getSquare(position);

                    break;


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
                changeTheTurn();


    }

    public boolean checkWinnerX() {
        return checkWinner(Square.X, playerX);
    }
    public boolean checkWinnerO(){
        return checkWinner(Square.O, playerO);
    }

    private boolean checkWinner(Square square, Player player) {
        for (int i = 0,counter=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (squares[j][i] == square)
                    counter++;
                if(counter==3) {

                    player.incrementScore();
                    return true;

                }
            }


        }
        for (int i = 0,counter = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (squares[j][i] == square)
                    counter++;
                if(counter==3) {
                    player.incrementScore();
                    return true;

                }
            }


        }

        if(squares[0][0]==squares[1][1]&&squares[1][1]==squares[2][2]&&squares[1][1]==square) return true;

        return squares[0][2] == squares[1][1] && squares[1][1] == squares[2][0] && squares[1][1] == square;
    }


}
