package com.a.e;
import java.awt.*;
import javax.swing.*;

public class DrawCircle extends JFrame{
	
	MyPanel mp = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawCircle dc = new DrawCircle();
		

	}
	public DrawCircle(){
		mp = new MyPanel();
		mp.repaint();
		this.add(mp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel{
	
	public void paint(Graphics g){
//		super.paint(g);
		g.drawOval(50, 50, 100, 100);
		g.drawOval(95, 10, 100, 100);
		g.drawOval(150, 10, 100, 100);
//		g.draw3DRect(100, 100, 100,150,true);
//		g.fill3DRect(50, 50, 100, 150, true);
		
	}
	
}