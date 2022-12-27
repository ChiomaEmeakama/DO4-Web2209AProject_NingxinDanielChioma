package views;

import models.Game;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;


public class MenuView extends JPanel {


    private final JLabel messageLabel;

    private final JButton hostGame;
    private final JButton localGame;
    private final JButton joinGame;


    public MenuView() {
        messageLabel = new JLabel("Please choose your option");

        localGame = new JButton("Local Game");

        hostGame = new JButton("Host Game");
        joinGame = new JButton("Join Game");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(LayoutHelper.createLargeEmptyBorder());

        add(messageLabel);
        add(LayoutHelper.createRigidArea());
        add(localGame);
        add(LayoutHelper.createRigidArea());
        add(hostGame);
        add(LayoutHelper.createRigidArea());
        add(joinGame);
        add(LayoutHelper.createRigidArea());
        add(createButtonsPanel());
        add(createMessagePanel());

        JFrame frame=new JFrame("first way");

        // creates instance of JButton
        JButton button = new JButton("let's see");

        button.setBounds(200, 150, 90, 50);

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adds button in JFrame
        frame.add(button);

        // sets 500 width and 600 height
        frame.setSize(500, 600);

        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);

    }

    private JPanel createMessagePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(messageLabel);
        return panel;
    }

    private JPanel createButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(localGame);
        panel.add(LayoutHelper.createSmallRigidArea());
        panel.add(joinGame);
        panel.add(LayoutHelper.createSmallRigidArea());
        panel.add(hostGame);
        panel.add(LayoutHelper.createSmallRigidArea());

        return panel;
    }
}
