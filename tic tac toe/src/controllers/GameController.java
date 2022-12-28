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


        view.add0BottomClicked(this::on0BottomClicked);
        view.add1BottomClicked(this::on1BottomClicked);
        view.add2BottomClicked(this::on2BottomClicked);
        view.add3BottomClicked(this::on3BottomClicked);
        view.add4BottomClicked(this::on4BottomClicked);
        view.add5BottomClicked(this::on5BottomClicked);
        view.add6BottomClicked(this::on6BottomClicked);
        view.add7BottomClicked(this::on7BottomClicked);
        view.add8BottomClicked(this::on8BottomClicked);

    }
    private void on0BottomClicked(ActionEvent event)
    {
        game.setSquares(0);
        if(!game.checkEmpty(0))
            view.disableButton(0);
        if(game.checkWinnerO()){
            view.displayWinner(game.getPlayerOName());

        }else if(game.checkWinnerX()){
            //todo
            view.displayWinner(game.getPlayerOName());

        }else if(game.canDraw())
            view.displayDraw();

        window.resizeToFitContent();



    }
    private void on1BottomClicked(ActionEvent event)
    {
        game.setSquares(1);

        if(!game.checkEmpty(1))
            view.disableButton(1);
        if(game.checkWinnerO()){
            view.displayWinner(game.getPlayerOName());

        }else if(game.checkWinnerX()){
            //todo
            view.displayWinner(game.getPlayerOName());

        }else if(game.canDraw())
            view.displayDraw();


        window.resizeToFitContent();

    }private void on2BottomClicked(ActionEvent event)
    {
        game.setSquares(2);

        if(!game.checkEmpty(2))
            view.disableButton(2);
        if(game.checkWinnerO()){
            view.displayWinner(game.getPlayerOName());

        }else if(game.checkWinnerX()){
            //todo
            view.displayWinner(game.getPlayerOName());

        }else if(game.canDraw())
            view.displayDraw();


        window.resizeToFitContent();
    }private void on3BottomClicked(ActionEvent event)
    {game.setSquares(3);


        if(!game.checkEmpty(3))
            view.disableButton(3);
        if(game.checkWinnerO()){
            view.displayWinner(game.getPlayerOName());

        }else if(game.checkWinnerX()){
            //todo
            view.displayWinner(game.getPlayerOName());

        }else if(game.canDraw())
            view.displayDraw();


        window.resizeToFitContent();

    }private void on4BottomClicked(ActionEvent event)
    {
        game.setSquares(4);

        if(!game.checkEmpty(4))
            view.disableButton(4);
        if(game.checkWinnerO()){
            view.displayWinner(game.getPlayerOName());

        }else if(game.checkWinnerX()){
            //todo
            view.displayWinner(game.getPlayerOName());

        }else if(game.canDraw())
            view.displayDraw();


        window.resizeToFitContent();
    }private void on5BottomClicked(ActionEvent event)
    {

        game.setSquares(5);

        if(!game.checkEmpty(5))
            view.disableButton(5);if(game.checkWinnerO()){
        view.displayWinner(game.getPlayerOName());

    }else if(game.checkWinnerX()){
        //todo
        view.displayWinner(game.getPlayerOName());

    }else if(game.canDraw())
        view.displayDraw();


        window.resizeToFitContent();
    }private void on6BottomClicked(ActionEvent event)
    {

        game.setSquares(6);

        if(!game.checkEmpty(6))
            view.disableButton(6);if(game.checkWinnerO()){
        view.displayWinner(game.getPlayerOName());

    }else if(game.checkWinnerX()){
        //todo
        view.displayWinner(game.getPlayerOName());

    }else if(game.canDraw())
        view.displayDraw();


        window.resizeToFitContent();
    }private void on7BottomClicked(ActionEvent event)
    {
        game.setSquares(7);

        if(!game.checkEmpty(7))
            view.disableButton(7);if(game.checkWinnerO()){
        view.displayWinner(game.getPlayerOName());

    }else if(game.checkWinnerX()){
        //todo
        view.displayWinner(game.getPlayerOName());

    }else if(game.canDraw())
        view.displayDraw();


        window.resizeToFitContent();

    }private void on8BottomClicked(ActionEvent event)
    {
        game.setSquares(8);

        if(!game.checkEmpty(8))
            view.disableButton(8);if(game.checkWinnerO()){
        view.displayWinner(game.getPlayerOName());

    }else if(game.checkWinnerX()){
        //todo
        view.displayWinner(game.getPlayerOName());

    }else if(game.canDraw())
        view.displayDraw();


        window.resizeToFitContent();

    }

}
