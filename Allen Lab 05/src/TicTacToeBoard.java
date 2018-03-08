import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	int[][] gameSpaces = { // 0 -> X, 1 -> O
							{-1,-1,-1},
							{-1,-1,-1},
							{-1,-1,-1},
						 };
	boolean turn = true;
	
	int lPad = 10;
	int tPad = 60;
	
	
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
  		
  		for (int y = 0; y < 3; y++) {
  			for (int x = 0; x < 3; x++) {
  				if (gameSpaces[y][x] == 0) {
  					g.drawString("X", 201 * x +lPad + 15, 201 * y + tPad + 165);
  				} else if (gameSpaces[y][x] == 1) {
  					g.drawString("O", 201 * x +lPad + 15, 201 * y + tPad + 165);
  				}
  			}
  		}
  		
  		if (isWinnerOrCatsGame() != -1) {
  			
  			if (isWinnerOrCatsGame() != 2) {
  				g.setColor(Color.RED);
  				g.drawString("WIN", 45, 400 + 30);
  			}
  			else {
  				g.setColor(Color.BLUE);
  				g.drawString("~~~~~", lPad, tPad + 155);
  				g.drawString("~TIE~", lPad, tPad + 355);
  				g.drawString("~~~~~", lPad, tPad + 555);
  				
  			}
  			g.setColor(Color.BLACK);
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
	
	public boolean equalAndPlaced(int a,int b,int c) {
		return a != -1 && a == b && b == c;
	}
	
	private int isWinnerOrCatsGame() {
		int[][] gs = gameSpaces;
		boolean catsGame = true;
		
		if (  equalAndPlaced(  gs[0][0], gs[0][1], gs[0][2])  ) {return gs[0][0];}
		if (  equalAndPlaced(  gs[1][0], gs[1][1], gs[1][2])  ) {return gs[1][0];}
		if (  equalAndPlaced(  gs[2][0], gs[2][1], gs[2][2])  ) {return gs[2][0];}
		
		if (  equalAndPlaced(  gs[0][0], gs[1][0], gs[2][0])  ) {return gs[0][0];}
		if (  equalAndPlaced(  gs[0][1], gs[1][1], gs[2][1])  ) {return gs[0][1];}
		if (  equalAndPlaced(  gs[0][2], gs[1][2], gs[2][2])  ) {return gs[0][2];}
		
		if (  equalAndPlaced(  gs[0][0], gs[1][1], gs[2][2])  ) {return gs[0][0];}
		if (  equalAndPlaced(  gs[0][2], gs[1][1], gs[2][0])  ) {return gs[0][2];}
		
		for (int y = 0; y < 3; y ++) {
			for (int x = 0; x < 3; x ++) {
				catsGame &= gs[y][x] != -1 ;
			}
		}
		if (catsGame) {return 2;}
		
		return -1;
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
			int tmpX = e.getX();
			int tmpY = e.getY();
			
			int sX   = -1;
			int sY   = -1;
			
			
			if      (tmpX < lPad)       { sX = -1; }
			else if (tmpX < lPad + 201) { sX = 0;  }
			else if (tmpX < lPad + 402) { sX = 1;  }
			else if (tmpX < lPad + 603) { sX = 2;  }
			else                        { sX = -1; }
			
			if      (tmpY < tPad)       { sY = -1; }
			else if (tmpY < tPad + 201) { sY = 0;  }
			else if (tmpY < tPad + 402) { sY = 1;  }
			else if (tmpY < tPad + 603) { sY = 2;  }
			else                        { sY = -1; }
			
			if (isWinnerOrCatsGame() == -1 && sX != -1 && sY != -1 && gameSpaces[sY][sX] == -1){
				gameSpaces[sY][sX] =  turn? 0 : 1;
				turn = ! turn;
				}
			
			
			repaint();
			
		}
		
	}
}
