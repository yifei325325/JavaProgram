/**
 * 功能：学习GirdLayout的布局方式
 */
package com.a.c;
import java.awt.*;

import javax.swing.*;
public class TestGridLayout extends JFrame{
//	1，创建一个数组，存放“size”个jb
	int size = 9;
	JButton jbs[] = new JButton[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGridLayout tgl = new TestGridLayout();

	}
	
	public TestGridLayout(){
//		2，把每个jb实例化出来
		for(int i=0;i<size;i++){
			jbs[i] = new JButton(String.valueOf(i)); 
		}
//		3，设置使用的布局管理器类型
		this.setLayout(new GridLayout(3,3,10,10));
//		4，添加组件
		for(int i=0;i<size;i++){
			
			this.add(jbs[i]);
		}
		
//		5，设置窗体属性
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setTitle("网格布局案例");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
