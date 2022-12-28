package views;

import models.Game;
import models.Square;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame {
private final JButton[][] gameField;
public GameView(Game game) {
        gameField = new JButton[3][3];

        JPanel panel = new JPanel();
        setLayout(new GridLayout(3,3));

        for(JButton[] fields : gameField){
            for(JButton field: fields) {
                panel.add(field);
            }
        }

    }
}
