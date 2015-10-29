/**
 * 功能：会员登录界面
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;

public class Login extends JFrame{
	
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf;
	JPasswordField jpf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login = new Login();

	}
	
	public Login() {
		// TODO Auto-generated constructor stub
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("用户名：");
		jlb2 = new JLabel("密    码：");
		
		jb1 = new JButton("确定");
		jb2 = new JButton("取消");
		
		jtf = new JTextField(10);
		
		jpf = new JPasswordField(10);
		
		this.setLayout(new GridLayout(3, 1));
		
		jp1.add(jlb1);
		jp1.add(jtf);
		jp2.add(jlb2);
		jp2.add(jpf);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(300,150);
		this.setTitle("会员登录界面");
		this.setLocation(100,100);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}

}
