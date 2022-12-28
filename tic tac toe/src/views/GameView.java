package views;

import models.Game;
import models.Square;
import utility.swing.layout.LayoutHelper;
import utility.swing.windows.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameView extends JPanel {
    private final JButton[][] gameField; //grid
public GameView(Game game) {
        gameField = new JButton[3][3];
        JPanel panel = new JPanel();
 /*   private boolean firstTurn;
  //  private Random firstToPlay;
    public Game() {
        squares = new Square[3][3];
        listeners = new ArrayList<>();
     //   firstToPlay = new Random(); //input first turn's code TODO
        turn=Square.X;
*/
        setLayout(new GridLayout(3,3));


        gameField[0][0]=new JButton();
        gameField[0][1]=new JButton();
        gameField[0][2]=new JButton();
        gameField[1][0]=new JButton();
        gameField[1][1]=new JButton();
        gameField[1][2]=new JButton();
        gameField[2][0]=new JButton();
        gameField[2][1]=new JButton();
        gameField[2][2]=new JButton();

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

    public JPanel displayWinner(String name){
    JPanel winnerPanel=new JPanel();
    winnerPanel.setLayout(new BoxLayout(winnerPanel, BoxLayout.X_AXIS));
    JLabel label=new JLabel("winner is : "+name);
    winnerPanel.add(label);
    return winnerPanel;
}
public JPanel displayDraw(){
   JPanel drawPanel = new JPanel();
    drawPanel.setLayout(new BoxLayout(drawPanel, BoxLayout.X_AXIS));
    JLabel label=new JLabel("we have no winner / draw");
    drawPanel.add(label);
    return drawPanel;
}

    public void disableButton(int position){
        switch (position) {
            case 0:
                gameField[0][0].setEnabled(false) ;

            case 1:
                gameField[0][1].setEnabled(false);
            case 2:
                gameField[0][2].setEnabled(false);
            case 3:
                gameField[1][0].setEnabled(false);
            case 4:
                gameField[1][1].setEnabled(false);
            case 5:
                gameField[1][2].setEnabled(false);
            case 6:
                gameField[2][0].setEnabled(false);
            case 7:
                gameField[2][1].setEnabled(false);
            case 8:
                gameField[2][2].setEnabled(false);


        }
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
