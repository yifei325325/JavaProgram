/**
 * 学习时间监听
 */
package com.a.e;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class TestEvent extends JFrame implements ActionListener{
	JPanel mp ;
	JButton jb1,jb2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEvent te = new TestEvent();

	}
	
	public TestEvent() {
		// TODO Auto-generated constructor stub
		mp = new JPanel();
		jb1 = new JButton("黑色");
		jb2 = new JButton("红色");
		
		mp.setBackground(Color.WHITE);
//		注册监听源，由TestEvent这个类的实例去监听
		jb1.addActionListener(this);
		jb2.addActionListener(this);
//		设置监听消息
		jb1.setActionCommand("black");
		jb2.setActionCommand("red");
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black")){
			mp.setBackground(Color.black);
		}else if(e.getActionCommand().equals("red")){
			mp.setBackground(Color.RED);
		}
	}
}

//class MyPanel1 extends JPanel{
//	public void paint(Graphics g){
//		super.paint(g);
//		g.setColor(Color.WHITE);
//		g.fillRect(0, 0, 400, 300);
//	}
//}
