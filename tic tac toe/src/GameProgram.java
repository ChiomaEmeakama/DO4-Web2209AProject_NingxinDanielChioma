import GameController.GameController;
import GameVirew.GameView;
import Model.Game;
import utility.swing.windows.Window;

import javax.swing.*;

public class GameProgram {

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(GameProgram::start);
    }

    private static void start()
    {
        //GameProgram gameProgram =new GameProgram();

        GameController gameController = new GameController();

        Game game = new Game();

        GameView view= new GameView(game);

        Window window = new Window("ATM", view, false);
        window.setVisible(true);
    }

}

