/**
 * JPanel���÷�
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;

public class JPanel_Test extends JFrame{
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanel_Test jt = new JPanel_Test();

	}
	
	public JPanel_Test() {
		// TODO Auto-generated constructor stub
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
//		jp1.setLayout(new FlowLayout());
//		jp2.setLayout(new FlowLayout());
		
		jb1 = new JButton("����");
		jb2 = new JButton("ƻ��");
		jb3 = new JButton("�㽶");
		jb4 = new JButton("����");
		jb5 = new JButton("����");
		jb6 = new JButton("����");
		
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		
		this.add(jb3,BorderLayout.CENTER);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setTitle("ѧϰJPanel����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

