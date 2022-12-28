import controllers.MenuController;
import utility.swing.style.StyleHelper;
import views.MenuView;
import utility.swing.windows.Window;

import javax.swing.*;


public class Local {

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Local::start);
    }

    private static void start()
    {

        StyleHelper.configureLookAndFeel();

        MenuView view= new MenuView();
        Window window = new Window("Menu", view, true);

        MenuController controller = new MenuController(view,window);

        window.resizeToFitContent();

        window.setVisible(true);
    }

}

