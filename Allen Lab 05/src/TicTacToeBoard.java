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
	boolean turn = true;
	
	
	public TicTacToeBoard(int width, int height) {
		setSize(width,height);
		setBackground(Color.WHITE);
		
		MouseListen mouseEL = new MouseListen();
		addMouseListener(mouseEL);
	}
	
	// game logic function
	
	// controls whose turn it is
	// keep track of the state of the board
	// redraw the board based on state change
	// check for victory conditions
	// handle victory / loss / cats game
	
	// check for errors
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
	    
	    int lPad = 10;
	    int tPad = 60;
	    
	    g.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
	    g.drawString("Allen's Tic Tac Toe Game", 120, 40);
	    
	    g.setFont(new Font("Comic Sans MS", Font.PLAIN, 200));
	    //g.drawString("X",10 + lPad, 180 + tPad);
	    
          
	    g.drawLine(201 + lPad, 0 + tPad, 201 + lPad, 602 + tPad);
	    g.drawLine(402 + lPad, 0 + tPad, 402 + lPad, 602 + tPad);
	    
	    g.drawLine(0 + lPad, 201 + tPad, 602 + lPad, 201 + tPad);
	    g.drawLine(0 + lPad, 402 + tPad, 602 + lPad, 402 + tPad);
	    //g2.setColor(Color.BLUE);
	    //g2.drawLine(0, 0, 200, 200);
	    
	    //DrawnO testO = new DrawnO(25,225);
	  	//g.drawString("O", testO.xCoord, testO.yCoord);
  		
  		for (TicTacToeBoard.DrawnX thisX: xList) {
  			g.drawString("X", thisX.xCoord, thisX.yCoord);
  		}
  		
  		for (TicTacToeBoard.DrawnO thisO: oList) {
  			g.drawString("O", thisO.xCoord, thisO.yCoord);
  		}
  		g.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
  		g.drawString("Instructions", 10, 680);
  		g.drawString("Players shall alternate placing X's and O's on the board staring with X", 10, 710);
  		g.drawString("until one player gets '3-in-a-row' including diagonals. The player that", 10, 750);
  		g.drawString("placed '3-in-a-row' wins. If all squares are filled in, no-one wins.", 10, 790);
    
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
				xList.add(new DrawnX(e.getX()-75, e.getY()+75));
				repaint();
			}
			else
			{
				System.out.println(e.getX() + " " + e.getY());
				oList.add(new DrawnO(e.getX()-75, e.getY()+75));
				repaint();
			}
			turn = ! turn;
			
		}
		
	}
}
