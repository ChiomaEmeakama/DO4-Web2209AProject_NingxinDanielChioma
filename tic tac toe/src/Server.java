import models.Player;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Server extends JFrame {

    private static int PLAYER_X;
    private String[] board = new String[9];
    private JTextArea outputArea;
    private Player[] players;
    private ServerSocket server;
    private int currentPlayer;
    private final static int PLAYER_O = 0;
    private final static String[] MARKS = {"X", "O"};
    private ExecutorService runGame;
    private Lock gameLock;
    private Condition otherPlayerConnected;
    private Condition otherPlayerTurn;
    private int playerNumber;
    private String mark;
    private Socket connection;
    private Scanner input;
    private Formatter output;
    private boolean suspended;


    public Server() {
        super("Tic-Tac-Toe Server");


        runGame = Executors.newFixedThreadPool(2);
        gameLock = new ReentrantLock();


        otherPlayerConnected = gameLock.newCondition();


        otherPlayerTurn = gameLock.newCondition();

        for (int i = 0; i < 9; i++)
            board[i] = new String("");
        players = new Player[2];
        currentPlayer = PLAYER_X;

        try {
            server = new ServerSocket(12345, 2);
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.exit(1);
        }

        outputArea = new JTextArea();
        add(outputArea, BorderLayout.CENTER);
        outputArea.setText("Server awaiting connections\n");

        setSize(300, 300);
        setVisible(true);
    }

    public void execute() {

        for (int i = 0; i < players.length; i++) {
            try {
                players[i] = new Player(server.accept(), i);
                runGame.execute((Runnable) players[i]);
            } catch (IOException ioException) {
                ioException.printStackTrace();
                System.exit(1);
            }
        }
        gameLock.lock();

        try {
            players[PLAYER_X].setSuspended(false);
            otherPlayerConnected.signal();
        } finally {
            gameLock.unlock();
        }
    }

    private void displayMessage(final String messageToDisplay) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        outputArea.append(messageToDisplay);
                    }
                }
        );
    }

    public boolean validateAndMove(int location, int player) {

        while (player != currentPlayer) {
            gameLock.lock();

            try {
                otherPlayerTurn.await();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            } finally {
                gameLock.unlock();
            }
        }
        if (!isOccupied(location)) {
            board[location] = MARKS[currentPlayer];
            currentPlayer = (currentPlayer + 1) % 2;

            players[currentPlayer].otherPlayerMoved(location);

            gameLock.lock();

            try {
                otherPlayerTurn.signal();
            } finally {
                gameLock.unlock();
            }

            return true;
        } else
            return false;
    }


    public boolean isOccupied(int location) {


        if (board[location].equals(MARKS[PLAYER_X]) ||
                board[location].equals(MARKS[PLAYER_O]))
            return true;
        else
            return false;
    }

    public boolean isGameOver() {
        return false;
    }


    public void run() {

        try {
            displayMessage("Player " + mark + " connected\n");
            output.format("%s\n", mark);
            output.flush();

            if (playerNumber == PLAYER_X) {
                output.format("%s\n%s", "Player X connected",
                        "Waiting for another player\n");
                output.flush();

                gameLock.lock();
            }
            try {
                while (suspended) {
                    otherPlayerConnected.await();
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            } finally {
                gameLock.unlock();
            }
            output.format("Other player connected. Your move.\n");
            output.flush();

        } finally {

        }
    }
    public void setSuspended(boolean status){
        suspended=status;
    }


    }
