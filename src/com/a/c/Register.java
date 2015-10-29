/**
 * 功能：注册界面
 */
package com.a.c;

import javax.swing.*;

import java.awt.*;

public class Register extends JFrame{
	
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	JButton jb1,jb2;
	ButtonGroup bg;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Register register = new Register();

	}
	
	public Register() {
		// TODO Auto-generated constructor stub
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jl1 = new JLabel("你最喜欢的运动");
		jl2 = new JLabel("你的性别");
		
		jcb1 = new JCheckBox("篮球");
		jcb2 = new JCheckBox("足球");
		jcb3 = new JCheckBox("网球");
		
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		
		bg = new ButtonGroup();
		
		jb1 = new JButton("注册");
		jb2 = new JButton("取消");
		
		bg.add(jrb1);
		bg.add(jrb2);
		
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setLayout(new GridLayout(3,1));
		this.setSize(400,150);
		this.setTitle("用户注册页面");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setVisible(true);
		
	
	}

}
