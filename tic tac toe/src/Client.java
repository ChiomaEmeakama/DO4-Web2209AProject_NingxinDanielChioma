import models.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client extends JFrame implements Runnable {
    private JTextField idField;
    private JTextArea displayArea;
    private JPanel boardPanel;
    private JPanel panel2;
    private Square[][] board;
    private Square currentSquare;
    private Socket connection;
    private Formatter output;
    private String ticTacToeHost;
    private String myMark;
    private boolean myTurn;
    private final String X_MARK = "X";
    private final String O_MARK = "O";
    private Scanner input;

    public Client(String host) {
        ticTacToeHost = host;
        displayArea = new JTextArea(4, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);

        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3, 0, 0));

        board = new Square[3][3];
        idField = new JTextField();
        idField.setEditable(false);
        add(idField, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel2.add(boardPanel, BorderLayout.CENTER);

        setSize(300, 225);

        startClient();
    }

    public void startClient() {
        try {

            connection = new Socket(
                    InetAddress.getByName(ticTacToeHost), 12345);


            input = new Scanner(connection.getInputStream());
            output = new Formatter(connection.getOutputStream());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        ExecutorService worker = Executors.newFixedThreadPool(1);
        worker.execute(this);
    }


    @Override
    public void run() {
        myMark = input.nextLine();
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        idField.setText("");
                    }
                }
        );
        myTurn = true;
    }

}




