package controllers;

import models.Game;
import utility.swing.windows.Window;
import views.GameView;

import java.awt.event.ActionEvent;

public class GameController {
    private final Game game;
    private final GameView view;
    private final Window window;


    public GameController(Game game,GameView view, Window window) {
        this.view = view;
        this.game=game;
        this.window=window;



    }
    private void on0BottomClicked(ActionEvent event)
    {
        game.setSquares(0);

    }
    private void on1BottomClicked(ActionEvent event)
    {
        game.setSquares(1);

    }private void on2BottomClicked(ActionEvent event)
    {
        game.setSquares(2);

    }private void on3BottomClicked(ActionEvent event)
    {game.setSquares(3);


    }private void on4BottomClicked(ActionEvent event)
    {
        game.setSquares(4);

    }private void on5BottomClicked(ActionEvent event)
    {

        game.setSquares(5);
    }private void on6BottomClicked(ActionEvent event)
    {

        game.setSquares(6);
    }private void on7BottomClicked(ActionEvent event)
    {
        game.setSquares(7);

    }private void on8BottomClicked(ActionEvent event)
    {
        game.setSquares(8);

    }

}
