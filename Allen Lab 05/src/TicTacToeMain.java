//lab 5
import javax.swing.*;
import java.awt.event.ActionListener;


public class TicTacToeMain {

	public static void main(String[] args) {
		createAndShowGUI();
		}
	static void createAndShowGUI() {
		int gameWidth = 622;
		int gameHeight= 820;
		JFrame frame = new JFrame("Allen's Tic Tac Toe");
		TicTacToeBoard board =new TicTacToeBoard(gameWidth,gameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int rOffset = 17;
		int bOffset = 40;
		
		frame.add(board);
		//root.setSize(217, 240);
		frame.setSize(622+ rOffset,820 + bOffset);
		frame.setVisible(true);
	}


}