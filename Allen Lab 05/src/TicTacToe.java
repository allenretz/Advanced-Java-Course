

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TicTacToe  extends Canvas implements MouseListener {
	//Graphics g;
	Graphics2D g2;
	public void paint (Graphics g) {
		g2 = (Graphics2D) g;
	    g.setFont(new Font("TimesRoman", Font.BOLD, 250)); 
	    
	    int lPad = 10;
	    int tPad = 60;
	    //g.drawString("X",10 + lPad, 180 + tPad);
	    
        setBackground(Color.WHITE);  
	    g2.drawLine(201 + lPad, 0 + tPad, 201 + lPad, 602 + tPad);
	    g2.drawLine(402 + lPad, 0 + tPad, 402 + lPad, 602 + tPad);
	    
	    g2.drawLine(0 + lPad, 201 + tPad, 602 + lPad, 201 + tPad);
	    g2.drawLine(0 + lPad, 402 + tPad, 602 + lPad, 402 + tPad);
	    //g2.setColor(Color.BLUE);
	    //g2.drawLine(0, 0, 200, 200);
	    
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Penguin");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//this.g2.drawLine(0, 0, e.getX(), e.getY()); //.drawString("X", e.getX(), e.getY());
		System.out.println("STUFF");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}