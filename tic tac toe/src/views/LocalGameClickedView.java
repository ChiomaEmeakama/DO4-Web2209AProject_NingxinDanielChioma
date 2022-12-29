package views;

import models.IGameListener;
import utility.swing.components.InputField;

import javax.swing.*;
import java.awt.*;

public class LocalGameClickedView extends JPanel implements IGameListener
{
   // private final JLabel requestNameLabel;
    private final InputField nameField;
    private final InputField score;
    //private final Component nameFieldRigidArea;
    private final JButton okToTheDetails;


    public LocalGameClickedView()
    {
       // this.requestNameLabel = new JLabel("Choose a name:");
        this.nameField = new InputField("Choose a name");
        //this.nameFieldRigidArea = new;
        this.score = new InputField("Score:")
        this.okToTheDetails = new JButton("OK");
    }
}
