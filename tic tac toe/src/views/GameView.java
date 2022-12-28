package views;

import models.Game;
import models.Square;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameView extends JPanel {
    private final JButton[][] gameField;
public GameView(Game game) {
        gameField = new JButton[3][3];

        JPanel panel = new JPanel();

        setLayout(new GridLayout(3,3));
    System.out.println("here");
        gameField[0][0]=new JButton(" ");
        gameField[0][1]=new JButton(" ");
        gameField[0][2]=new JButton(" ");
        gameField[1][0]=new JButton(" ");
        gameField[1][1]=new JButton(" ");
        gameField[1][2]=new JButton(" ");
        gameField[2][0]=new JButton(" ");
        gameField[2][1]=new JButton(" ");
        gameField[2][2]=new JButton(" ");

    for(JButton[] fields : gameField){
        for(JButton field: fields) {
            panel.add(field);

        }
    }
/*

    for(JButton[] fields : gameField){
            for(JButton field: fields) {
                field=new JButton(" ");
                panel.add(field);

            }
        }
*/

    }
    public void add0BottomClicked(ActionListener listener)
    {
        gameField[0][0].addActionListener(listener);
    }
    public void add1BottomClicked(ActionListener listener)
    {
        gameField[0][1].addActionListener(listener);
    }
    public void add2BottomClicked(ActionListener listener)
    {
        gameField[0][2].addActionListener(listener);
    }
    public void add3BottomClicked(ActionListener listener)
    {
        gameField[1][0].addActionListener(listener);
    }
    public void add4BottomClicked(ActionListener listener)
    {
        gameField[1][1].addActionListener(listener);
    }
    public void add5BottomClicked(ActionListener listener)
    {
        gameField[1][2].addActionListener(listener);
    }
    public void add6BottomClicked(ActionListener listener)
    {
        gameField[2][0].addActionListener(listener);
    }
    public void add7BottomClicked(ActionListener listener)
    {
        gameField[2][1].addActionListener(listener);
    }
    public void add8BottomClicked(ActionListener listener)
    {
        gameField[2][2].addActionListener(listener);
    }
}
