import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> oList = new ArrayList<DrawnO>();
	boolean turn = false;
	int titleFontSize = 36;
	
	public TicTacToeBoard() {
		setSize(322,422);
		setBackground(Color.WHITE);
		
		MouseListen mouseEL = new MouseListen();
		addMouseListener(mouseEL);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		//font(font name , font.style, size)
		
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize));
		g.drawString("Tic Tac Toe", 0, (50 - titleFontSize) / 2 + titleFontSize );
		
		//DrawnO testO = new DrawnO(100,200);
		//g.drawString("O", testO.xCoord, testO.yCoord);
		
		for (TicTacToeBoard.DrawnX thisX: xList) {
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		}
		
		for (TicTacToeBoard.DrawnO thisO: oList) {
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}
	}
	
	class DrawnX {
		int xCoord = 200;
		int yCoord = 200;
		
		DrawnX(int xCoord, int yCoord){
			this.xCoord = xCoord;
			this.yCoord = yCoord;
			
		}
	}
	
	class DrawnO {
		int xCoord = 200;
		int yCoord = 200;
		
		DrawnO(int xCoord, int yCoord){
			this.xCoord = xCoord;
			this.yCoord = yCoord;
			
		}
	}
	
	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (turn)
			{
				System.out.println(e.getX() + " " + e.getY());
				xList.add(new DrawnX(e.getX()-10, e.getY()+10));
				repaint();
			}
			else
			{
				System.out.println(e.getX() + " " + e.getY());
				oList.add(new DrawnO(e.getX()-10, e.getY()+10));
				repaint();
			}
			turn = ! turn;
			
		}
		
	}
}
