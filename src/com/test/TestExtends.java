package com.test;
import java.awt.Color;

import javax.swing.*;

public class TestExtends extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestExtends te = new TestExtends();
		te.setTitle("我的第一个窗口");
		te.getContentPane().setBackground(Color.red);

	}
	
	public TestExtends(){
		this.setVisible(true);
		this.setSize(300,300);
	}

}

