package views;

import models.Game;
import models.Player;
import utility.formatting.CurrencyHelper;
import utility.swing.layout.LayoutHelper;

import javax.swing.*;
import java.awt.*;


public class PlayerView extends JPanel
{
    private JPanel infoPanel;
//   private  final JLabel playersName;
//   private final JLabel playersScoreLabel;

   //private final Player playerid;

   public PlayerView(Game game)
   {
//       playersName = createValueLabel();
//       playersName.setBackground(Color.DARK_GRAY);
//       playersName.setForeground(new Color(35,114,70));
//       playersName.setOpaque(true);

       infoPanel = new JPanel();
       infoPanel.setBounds(0,0,250,30);
       infoPanel.setBackground(Color.lightGray);

   }


}
