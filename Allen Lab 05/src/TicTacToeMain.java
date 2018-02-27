//lab 5
import javax.swing.*;
import java.awt.event.ActionListener;


public class TicTacToeMain {

	public static void main(String[] args) {
		createAndShowGUI();
		}
	static void createAndShowGUI() {
		JFrame frame = new JFrame("Allen's Tic Tac Toe");
		TicTacToeBoard board =new TicTacToeBoard(622,722);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int rOffset = 17;
		int bOffset = 40;
		
		frame.add(board);
		//root.setSize(217, 240);
		frame.setSize(622+ rOffset,722 + bOffset);
		frame.setVisible(true);
	}


}