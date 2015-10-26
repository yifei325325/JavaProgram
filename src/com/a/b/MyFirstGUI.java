/**
 * GUI程序开发
 */
package com.a.b;

import javax.swing.*;
import java.awt.*;

public class MyFirstGUI extends JFrame{
	JButton jb1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstGUI mfg = new MyFirstGUI();
		
	

	}
	public MyFirstGUI(){
		//定义组件
		jb1 = new JButton("我是按钮");
		//添加组件
		this.add(jb1);
		//设置窗口属性
		this.setTitle("Hello World");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置可见性
		this.setVisible(true);
	}

}
