import controllers.MenuController;
import views.MenuView;
import models.Game;
import utility.swing.windows.Window;

import javax.swing.*;

public class GameProgram {

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(GameProgram::start);
    }

    private static void start()
    {

        MenuView view= new MenuView();
        Window window = new Window("Menu", view, false);

        MenuController controller = new MenuController(window);

        window.setVisible(true);
    }

}

