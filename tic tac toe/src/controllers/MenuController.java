package controllers;

import models.Game;
import models.IGameListener;
import utility.swing.style.StyleHelper;
import utility.swing.windows.Window;
import views.GameView;
import views.MenuView;

import java.awt.event.ActionEvent;
import java.util.Objects;

public class MenuController {

    private final Window window;
    public final  MenuView view;


    public MenuController(MenuView view, Window window)

    {

        this.view=Objects.requireNonNull(view);
        this.window = Objects.requireNonNull(window);

        view.addLocalGameListener(this::onLocalClicked);

    }

    private void onLocalClicked(ActionEvent e)
    {
        //CREATE A GAME


        Game game = new Game();
        GameView gameView = new GameView(game);

        Window gameWindow=new Window("local game",gameView,true);
        GameController controller = new GameController (game,gameView,gameWindow);


        window.dispose();
        gameWindow.resizeToFitContent();

        gameWindow.setVisible(true);
    }
    private void onJoinClicked(ActionEvent e)
    {
        // IF THREE IS A HOST
        //CREATE A GAME

    }private void onHostClicked(ActionEvent e)
    {
        // IF THERE IS NOT ANY HOST GAME
        //CREATE A GAME
    }
}
