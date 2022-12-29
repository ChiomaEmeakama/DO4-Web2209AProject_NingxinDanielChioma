package views;

import models.IGameListener;
import utility.swing.components.InputField;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;
import java.awt.*;

public class LocalGameClickedView extends JPanel implements IGameListener
{

    private final InputField nameField;
    private final InputField score;
    private final JButton receivedDetails;

    // private final JLabel requestNameLabel;
    //private final Component nameFieldRigidArea;


    public LocalGameClickedView()
    {
        this.nameField = new InputField("Type your name");
        this.score = new InputField("Score:");
        this.receivedDetails = new JButton("OK");

        // this.requestNameLabel = new JLabel("Choose a name:");
        //this.nameFieldRigidArea = new;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(LayoutHelper.createLargeEmptyBorder());

        add(LayoutHelper.createRigidArea());
        add(createButtonsPanel());
        add(LayoutHelper.createRigidArea());
    }

    private Component createButtonsPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        // TODO
        return panel;
    }


}
