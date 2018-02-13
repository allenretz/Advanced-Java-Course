import javax.swing.*;
import java.awt.event.ActionListener;


public class TicTacToeMain {

	public static void main(String[] args) {
			JFrame root = new JFrame("Allen's Tic Tac Toe");
			ActionListener e = ;
			TicTacToe board =new TicTacToe();  
			
			int rOffset = 17;
			int bOffset = 40;
			
			root.add(board);
			//root.setSize(217, 240);
			root.setSize(622+ rOffset,722 + bOffset);
			root.setVisible(true);
			root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}


	}