/**
 * 功能：学习FlowLayout布局
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;

public class TestFlowLayout extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFlowLayout tfl = new TestFlowLayout();

	}
	
	public TestFlowLayout(){
		jb1 = new JButton("关羽");
		jb2 = new JButton("张飞");
		jb3 = new JButton("赵云");
		jb4 = new JButton("马超");
		jb5 = new JButton("黄忠");
		jb6 = new JButton("魏延");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		5，设置窗体属性
		this.setSize(380,300);
		this.setLocation(100, 100);
		this.setTitle("流式布局案例");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

}
