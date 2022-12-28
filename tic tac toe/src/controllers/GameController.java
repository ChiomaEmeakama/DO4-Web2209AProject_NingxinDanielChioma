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
    private void onGameBottomClicked(ActionEvent event)
    {


    }
}
