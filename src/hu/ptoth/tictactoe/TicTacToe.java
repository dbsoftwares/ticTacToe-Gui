/**
 * This is the business logic class, and 
 */
package hu.ptoth.tictactoe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author ptoth
 * @since 2013.05.27.
 * @web http://ptoth.github.io
 */

public class TicTacToe {

    JButton btnNewButton = new JButton();
    int reply;
    int NextPlayer = 1;
    int[] Player1 = new int [10];
    int[] Player2 = new int [10];

    boolean winCondition = false;
    boolean winCondition2 = false;
    
    JFrame frame;
    JButton[] buttonsArray = new JButton[9];
    JButton btnPlayAgain;

    public TicTacToe() {
	init();
    }

    private void init() {
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.GRAY);
	frame.setBounds(100, 100, 418, 341);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.setLayout(new GridLayout(4, 3));

	for (int i = 0; i < buttonsArray.length; i++) {
	    buttonsArray[i] = new JButton("");
	    buttonsArray[i].setBackground(Color.WHITE);
	    buttonsArray[i].setSize(122, 76);
	    buttonsArray[i].setBackground(Color.WHITE);
	    buttonsArray[i].setEnabled(true);
	    frame.getContentPane().add(buttonsArray[i]);
	    buttonsArray[i].setName(String.valueOf(i));
	    
	    
	    // sets the ActionListener to our class
	    buttonsArray[i].addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    System.err.println(e.getSource().toString());
		    if (NextPlayer == 1) {
			System.err.println("Turns into blue");
		    } else {
			System.err.println("Turns into green");
		    }
		    
		    player_selection(((JButton) e.getSource()));
		    win_lose_conditions();
		}
	    });
	    
	}

	btnPlayAgain = new JButton("Play Again..");
	btnPlayAgain.setBackground(Color.WHITE);
	btnPlayAgain.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
		// This happens when the player hits the playAgain Button.

		frame.repaint();

	    }
	});
	btnPlayAgain = new JButton("Play Again..");
	btnPlayAgain.setBackground(Color.WHITE);

	frame.getContentPane().add(btnPlayAgain);
    }

    public void win_lose_conditions() {
	if (winCondition == true){
	    // this happens when Player1 wins
	    reply = JOptionPane.showConfirmDialog(null, "Player 1 win", "Do you want to Continue", JOptionPane.YES_NO_OPTION);
	    if (reply == JOptionPane.NO_OPTION){
		System.exit(0);
	    }
	}
	else if (winCondition2 == true) {
	    // this happens
	    reply = JOptionPane.showConfirmDialog(null, "Player2 win", "Do you want to Continue", JOptionPane.YES_NO_OPTION);
	    if (reply == JOptionPane.NO_OPTION)
	     {
		System.exit(0);
	    // if(Reply==JOptionPane.YES_OPTION)
	    }
	}
    }

    public void player_selection(JButton button) {
	// simple button coloring function
	if (NextPlayer == 1) {
	    button.setBackground(Color.BLUE);
	    button.setEnabled(false);
	    NextPlayer = 2;
	} else if (NextPlayer == 2) {
	    button.setBackground(Color.GREEN);
	    button.setEnabled(false);
	    NextPlayer = 1;
	}
    }
}
