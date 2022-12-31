package controllers;

import models.Game;
import models.Player;
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
        view.hideWinnerAndDraw();
    }
    private void on0BottomClicked(ActionEvent event)
    {

        view.setValueOnButton(0,0,game.whoIsTurn());
        game.setSquares(0);
        view.disableButton(0);

        if(game.checkWinnerO()){
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            view.visibleWinner(game.getPlayerO().getName());


        }else if(game.checkWinnerX()){
            Player player = game.getPlayerX();
            int score = player.getScore();
            view.updateScore(score, player);

            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            view.visibleWinner(game.getPlayerX().getName());


        }else if(game.canDraw())
            view.visibleDraw();
    }
    private void on1BottomClicked(ActionEvent event)
    {

        view.setValueOnButton(0,1,game.whoIsTurn());
        game.setSquares(1);
        view.disableButton(1);


        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);
            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();



    }private void on2BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(0,2,game.whoIsTurn());

        game.setSquares(2);
        view.disableButton(2);

        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();


    }private void on3BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(1,0,game.whoIsTurn());

        game.setSquares(3);
        view.disableButton(3);


        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();



    }private void on4BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(1,1,game.whoIsTurn());

        game.setSquares(4);
        view.disableButton(4);

        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();


    }private void on5BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(1,2,game.whoIsTurn());


        game.setSquares(5);


        view.disableButton(5);
        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();


    }private void on6BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(2,0,game.whoIsTurn());

        game.setSquares(6);


        view.disableButton(6);
        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();


    }private void on7BottomClicked(ActionEvent event)
    {        view.setValueOnButton(2,1,game.whoIsTurn());

        game.setSquares(7);


        view.disableButton(7);
        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerX().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();



    }private void on8BottomClicked(ActionEvent event)
    {
        view.setValueOnButton(2,2,game.whoIsTurn());
        game.setSquares(8);
        view.disableButton(8);

        if(game.checkWinnerO()){
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerO().getName());

        }else if(game.checkWinnerX()){
            //todo
            view.disableAllButtons();
            view.createWinnerMessage(game.getPlayerO().getName());
            Player player = game.getPlayerO();
            int score = player.getScore();
            view.updateScore(score, player);

            view.visibleWinner(game.getPlayerX().getName());

        }else if(game.canDraw())
            view.visibleDraw();




    }

}
