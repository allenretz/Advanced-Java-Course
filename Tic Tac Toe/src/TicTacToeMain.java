import javax.swing.JFrame;

public class TicTacToeMain {

	public static void main(String[] args) {
		createAndShowGUI();

	}
	
	private static void createAndShowGUI() {
		JFrame frame= new JFrame("Tic Tac Toe Board");
		TicTacToeBoard board = new TicTacToeBoard();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(board);
		
		frame.setSize(322,422); //may need to change size to account for borders and title bar
		frame.setVisible(true);
	}
	

}
