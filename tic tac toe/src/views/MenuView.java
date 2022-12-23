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
