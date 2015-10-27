/**
 * BorderLayout的练习
 * 1，继承JFrame
 * 2，定义组件
 * 3，构造组件
 * 4，添加组件
 * 5，设置窗体属性
 * 6，创建窗体实例
 */
package com.a.c;

import javax.swing.*;
import java.awt.*;
//1,继承JFrame
public class TestBorderLayout extends JFrame{
//	2，定义组件
	JButton jb1,jb2,jb3,jb4,jb5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6，创建窗体实例
		TestBorderLayout tbl = new TestBorderLayout();

	}
	public TestBorderLayout () {
//		3，构建组件
		jb1 = new JButton("东部");
		jb2 = new JButton("南部");
		jb3 = new JButton("西部");
		jb4 = new JButton("北部");
		jb5 = new JButton("中部");
//		4，添加组件
		this.add(jb1,BorderLayout.EAST);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.NORTH);
		this.add(jb5,BorderLayout.CENTER);
//		5，设置窗体属性
		this.setSize(400,300);
		this.setLocation(100, 100);
		this.setTitle("边界布局案例");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
