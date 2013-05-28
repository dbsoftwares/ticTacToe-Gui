/**
 * Main class, this is runnable
 */
package hu.ptoth.tictactoe;

import java.awt.EventQueue;

/**
 * @author ptoth
 * @since 2013.05.27.
 * @web http://ptoth.github.io
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

	EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		try {
		    TicTacToe window = new TicTacToe();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

}
