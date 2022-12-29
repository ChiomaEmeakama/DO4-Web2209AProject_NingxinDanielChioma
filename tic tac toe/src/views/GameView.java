package views;

import models.Game;
import models.Square;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameView extends JPanel {
    private final JButton[][] gameField; //grid
    private final  JLabel score1,score2;
    private JLabel winnerMessage;
    private JLabel drawMessage;
    private String winnerName="";
    public GameView(Game game) {
        gameField = new JButton[3][3];


        score1 = new JLabel("X player score : ");
        score2 = new JLabel("O player score : ");

        drawMessage = new JLabel("we have no winner");
        winnerMessage =new JLabel();


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                gameField[i][j]=createButton();
            }
        }

      /*  setLayout(new GridLayout(3,3));
        setBorder(LayoutHelper.createLargeEmptyBorder());
*/;
        //setLayout(new GridBagLayout());
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBorder(LayoutHelper.createLargeEmptyBorder());
        add(createTopBorder());
        add(winnerMessage);
        add(drawMessage);

        add(createButtonsPanel());


    }
    public void hideWinnerAndDraw(){
        winnerMessage.setVisible(false);

        drawMessage.setVisible(false);

    }
    private  JPanel createTopBorder(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(1,5,15));
        panel.add(score1);
        panel.add(score2);


        return panel;

    }
    private JPanel createButtonsPanel(){
        JPanel panel = new JPanel();

        panel.setLayout((new GridLayout(3,3)));

        //setBorder(LayoutHelper.createLargeEmptyBorder());
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                panel.add(gameField[i][j]);
            }
        }
        return panel;
    }
    private JButton createButton(){
        JButton btn = new JButton();
        Dimension size = new Dimension(80,80);
        btn.setMinimumSize(size);
        btn.setPreferredSize(size);
        return btn;
    }

    public void createWinnerMessage(String name){
        winnerMessage = new JLabel("winner is : " + name);
    }
    public void visibleWinner(String name){

        winnerMessage.setVisible(true);

        /*   */
    }

    public void visibleDraw(){

        drawMessage.setVisible(true);
        /*JPanel drawPanel = new JPanel();
        drawPanel.setLayout(new BoxLayout(drawPanel, BoxLayout.X_AXIS));
        JLabel label=new JLabel("we have no winner / draw");
        drawPanel.add(label);
        return drawPanel;*/
    }

    public void setValueOnButton(int i,int j,String s){

        gameField[i][j].setText(s);
        if(s=="X")
            gameField[i][j].setBackground(Color.GREEN);
        else
            gameField[i][j].setBackground(Color.RED);
    }
    public void disableAllButtons(){
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                gameField[i][j].setEnabled(false);
            }
        }
    }
    public void enableAllButtons(){
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                gameField[i][j].setEnabled(true);
            }
        }
    }
    public void disableButton(int position){
        switch (position) {
            case 0:
               gameField[0][0].setEnabled(false) ;
                break;
            case 1:
                gameField[0][1].setEnabled(false);
                break;
            case 2:
                gameField[0][2].setEnabled(false);
                break;
            case 3:
                gameField[1][0].setEnabled(false);
                break;
            case 4:
                gameField[1][1].setEnabled(false);
                break;
            case 5:
                gameField[1][2].setEnabled(false);
                break;
            case 6:
                gameField[2][0].setEnabled(false);
                break;
            case 7:
                gameField[2][1].setEnabled(false);
                break;
            case 8:
                gameField[2][2].setEnabled(false);
                break;


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
