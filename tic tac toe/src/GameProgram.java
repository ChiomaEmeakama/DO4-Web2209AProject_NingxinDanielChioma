import controllers.MenuController;
import utility.swing.style.StyleHelper;
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

        StyleHelper.configureLookAndFeel();

        MenuView view= new MenuView();
        Window window = new Window("Menu", view, true);

        MenuController controller = new MenuController(view,window);


        window.setVisible(true);
    }

}

